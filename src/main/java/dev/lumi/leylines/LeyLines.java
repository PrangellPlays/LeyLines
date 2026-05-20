package dev.lumi.leylines;

import dev.lumi.leylines.cca.PlayerCharacterComponent;
import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.cca.PlayerProfileComponent;
import dev.lumi.leylines.cca.PlayerWindGliderComponent;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.command.LeylinesCharacterCommand;
import dev.lumi.leylines.init.LeyLinesComponents;
import dev.lumi.leylines.network.payload.PartySwapPayload;
import dev.lumi.leylines.network.payload.StartGlidingPayload;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeyLines implements ModInitializer {
	public static final String MOD_ID = "leylines";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LeylinesCharacterRegistry.init();
		CommandRegistrationCallback.EVENT.register(LeylinesCharacterCommand::register);

		PayloadTypeRegistry.playC2S().register(PartySwapPayload.PAYLOAD_ID, PartySwapPayload.CODEC);
		ServerPlayNetworking.registerGlobalReceiver(
				PartySwapPayload.PAYLOAD_ID, (payload, context) -> {
					int slot = payload.slot();

					System.out.println("SWAP RECEIVED: " + slot);
					context.server().execute(() -> {
						var player = context.player();
						PlayerPartyComponent party = LeyLinesComponents.PARTY.get(player);
						party.setActiveSlot(slot);

						PlayerCharacterComponent character = LeyLinesComponents.CHARACTER.get(player);
						character.setActiveCharacter(party.getActiveCharacter());
					});
				}
		);

		PayloadTypeRegistry.playC2S().register(StartGlidingPayload.PAYLOAD_ID, StartGlidingPayload.CODEC);
		ServerPlayNetworking.registerGlobalReceiver(
				StartGlidingPayload.PAYLOAD_ID, (payload, context) -> {
					context.server().execute(() -> {
						var player = context.player();
						if (player.isOnGround()) {
							return;
						}

						if (player.isTouchingWater()) {
							return;
						}

						PlayerProfileComponent profileComponent = LeyLinesComponents.PROFILE.get(player);
						if (profileComponent.getStamina() <= 0) {
							return;
						}

						PlayerWindGliderComponent gliderComponent = LeyLinesComponents.WIND_GLIDER.get(player);
						gliderComponent.setGliding(true);
					});
				}
		);

		ServerTickEvents.END_SERVER_TICK.register(server -> {
			for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
				PlayerWindGliderComponent gliderComponent = LeyLinesComponents.WIND_GLIDER.get(player);
				if (gliderComponent.isGliding()) {
					continue;
				}

				if (player.isOnGround() || player.isTouchingWater()) {
					gliderComponent.setGliding(false);
					continue;
				}

				PlayerProfileComponent profileComponent = LeyLinesComponents.PROFILE.get(player);
				if (!profileComponent.consumeStamina(0.5f)) {
					gliderComponent.setGliding(false);
					continue;
				}

				Vec3d velocity = player.getVelocity();
				double verticalVelocity = Math.max(velocity.y, -0.08);
				Vec3d forwardVelocity = player.getRotationVector().multiply(0.03);

				player.setVelocity(velocity.x + forwardVelocity.x, verticalVelocity, velocity.z + forwardVelocity.z);
				player.velocityModified = true;
			}
		});
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}