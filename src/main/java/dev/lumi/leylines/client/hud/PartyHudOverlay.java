package dev.lumi.leylines.client.hud;

import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.character.CharacterDefinition;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PartyHudOverlay implements HudRenderCallback {

    @Override
    public void onHudRender(DrawContext context, RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        PlayerPartyComponent party = LeyLinesComponents.PARTY.get(client.player);
        Identifier[] members = party.getParty();
        int active = party.getActiveSlot();

        int x = 10;
        int y = 10;
        for (int i = 0; i < 4; i++) {
            Identifier id = members[i];
            CharacterDefinition def = LeylinesCharacterRegistry.get(id);
            if (def == null) continue;

            context.fill(x, y, x + 40, y + 40, 0x88000000);
            if (i == active) {
                context.drawBorder(x, y, 40, 40, 0xFFFFFF00);
            }

            context.drawText(client.textRenderer, def.displayName(), x + 4, y + 4, 0xFFFFFF, true);
            x += 45;
        }
    }
}
