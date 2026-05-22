package dev.lumi.leylines;

import dev.lumi.leylines.cca.PlayerCharacterComponent;
import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.cca.PlayerProfileComponent;
import dev.lumi.leylines.cca.PlayerWindGliderComponent;
import dev.lumi.leylines.character.LeyLinesCharacterSkinRegistry;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.command.LeylinesCharacterCommand;
import dev.lumi.leylines.init.LeyLinesComponents;
import dev.lumi.leylines.network.payload.PartySwapPayload;
import dev.lumi.leylines.network.payload.ToggleGlidingPayload;
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
		LeyLinesCharacterSkinRegistry.init();
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

		PayloadTypeRegistry.playC2S().register(ToggleGlidingPayload.PAYLOAD_ID, ToggleGlidingPayload.CODEC);
		ServerPlayNetworking.registerGlobalReceiver(ToggleGlidingPayload.PAYLOAD_ID, (payload, context) -> {
					context.server().execute(() -> {
						LeyLinesComponents.WIND_GLIDER.get(context.player()).toggleGliding();
					});
				}
		);
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}