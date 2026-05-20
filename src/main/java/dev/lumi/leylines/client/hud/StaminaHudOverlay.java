package dev.lumi.leylines.client.hud;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;

public class StaminaHudOverlay implements HudRenderCallback {
    private static final Identifier STAMINA_EMPTY = LeyLines.id("textures/gui/stamina_empty.png");
    private static final Identifier STAMINA_FILL = LeyLines.id("textures/gui/stamina_fill.png");

    @Override
    public void onHudRender(DrawContext drawContext, RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;
        var profile = LeyLinesComponents.PROFILE.get(client.player);

        float stamina = profile.getStamina();
        float max = profile.getMaxStamina();
        if (max <= 0) return;
        float percent = stamina / max;

        if (stamina == max) return;
        if (client.options.hudHidden) return;
        int centerX = client.getWindow().getScaledWidth() / 2;
        int centerY = client.getWindow().getScaledHeight() / 2;

        int size = 64;
        drawContext.drawTexture(STAMINA_EMPTY, centerX - size / 2, centerY - size / 2, 0, 0, size, size, size, size);

        int fillHeight = (int) (size * percent);
        drawContext.drawTexture(STAMINA_FILL, centerX - size / 2, centerY + size / 2 - fillHeight, 0, size - fillHeight, size, fillHeight, size, size);
    }
}
