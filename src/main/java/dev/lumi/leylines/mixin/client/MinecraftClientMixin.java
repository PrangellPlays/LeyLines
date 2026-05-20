package dev.lumi.leylines.mixin.client;

import dev.lumi.leylines.network.payload.ToggleGlidingPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Shadow public ClientPlayerEntity player;
    @Shadow @Final public GameOptions options;
    @Unique private boolean wasJumping = false;

    @Inject(method = "tick", at = @At("TAIL"))
    private void leyLines$handleWindGliderInput(CallbackInfo ci) {
        if (player == null) {
            return;
        }

        boolean jumping = options.jumpKey.isPressed();
        if (jumping && !wasJumping) {
            if (!player.isOnGround()) {
                ClientPlayNetworking.send(new ToggleGlidingPayload());
            }
        }

        wasJumping = jumping;
    }
}
