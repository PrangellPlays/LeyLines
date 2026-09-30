package dev.lumi.leylines;

import dev.lumi.leylines.client.LeyLinesCreativeScreen;
import dev.lumi.leylines.client.hud.PartyHudOverlay;
import dev.lumi.leylines.client.hud.StaminaHudOverlay;
import dev.lumi.leylines.index.keybinds.LeyLinesKeybinds;
import dev.lumi.leylines.network.payload.PartySwapPayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class LeyLinesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LeyLinesKeybinds.init();
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;

            if (LeyLinesKeybinds.actions_party_slot_1.wasPressed()) swap(client, 0);
            if (LeyLinesKeybinds.actions_party_slot_2.wasPressed()) swap(client, 1);
            if (LeyLinesKeybinds.actions_party_slot_3.wasPressed()) swap(client, 2);
            if (LeyLinesKeybinds.actions_party_slot_4.wasPressed()) swap(client, 3);
            if (LeyLinesKeybinds.actions_party_slot_5.wasPressed()) swap(client, 4);
        });

        HudRenderCallback.EVENT.register(new PartyHudOverlay());
        HudRenderCallback.EVENT.register(new StaminaHudOverlay());

        LeyLinesCreativeScreen.init();
    }

    private static void swap(MinecraftClient client, int slot) {
        ClientPlayNetworking.send(new PartySwapPayload(slot));
    }
}
