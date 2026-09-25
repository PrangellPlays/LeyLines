package dev.lumi.leylines.client.gui;

import net.minecraft.client.gui.DrawContext;

public final class NineSliceRenderer {
    private NineSliceRenderer() {
    }

    public static void draw(DrawContext context, int x, int y, int width, int height, int borderSize, int borderColor, int backgroundColor, int shadowColor) {
        // Shadow
        context.fill(x + 2, y + 3, x + width + 2, y + height + 3, shadowColor);

        // Outer panel
        context.fill(x, y, x + width, y + height, borderColor);

        // Inner panel
        context.fill(x + borderSize, y + borderSize, x + width - borderSize, y + height - borderSize, backgroundColor);
    }

    public static void drawRounded(DrawContext context, int x, int y, int width, int height, int radius, int borderColor, int backgroundColor, int shadowColor) {
        // Shadow
        context.fill(x + 3, y + 4, x + width + 3, y + height + 4, shadowColor);

        // Border
        context.fill(x + radius, y, x + width - radius, y + height, borderColor);
        context.fill(x, y + radius, x + width, y + height - radius, borderColor);

        // Background
        context.fill(x + radius, y + radius, x + width - radius, y + height - radius, backgroundColor);
        context.fill(x, y + radius, x + width, y + height - radius, backgroundColor);
    }
}
