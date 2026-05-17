package dev.lumi.leylines;

import dev.lumi.leylines.client.hud.PartyHudOverlay;
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
    public static KeyBinding party_slot_1;
    public static KeyBinding party_slot_2;
    public static KeyBinding party_slot_3;
    public static KeyBinding party_slot_4;

    @Override
    public void onInitializeClient() {
        party_slot_1 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.leylines.party_slot_1", InputUtil.Type.KEYSYM, 321, "category.leylines"));
        party_slot_2 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.leylines.party_slot_2", InputUtil.Type.KEYSYM, 322, "category.leylines"));
        party_slot_3 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.leylines.party_slot_3", InputUtil.Type.KEYSYM, 323, "category.leylines"));
        party_slot_4 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.leylines.party_slot_4", InputUtil.Type.KEYSYM, 324, "category.leylines"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;

            if (party_slot_1.wasPressed()) swap(client, 0);
            if (party_slot_2.wasPressed()) swap(client, 1);
            if (party_slot_3.wasPressed()) swap(client, 2);
            if (party_slot_4.wasPressed()) swap(client, 3);
        });

        HudRenderCallback.EVENT.register(new PartyHudOverlay());
    }

    private static void swap(MinecraftClient client, int slot) {
        ClientPlayNetworking.send(new PartySwapPayload(slot));
    }
}
