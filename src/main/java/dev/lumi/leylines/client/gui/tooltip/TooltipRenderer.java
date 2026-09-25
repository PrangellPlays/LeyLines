package dev.lumi.leylines.client.gui.tooltip;

import dev.lumi.leylines.client.gui.NineSliceRenderer;
import dev.lumi.leylines.item.util.ColouredTooltipItem;
import dev.lumi.leylines.item.util.tooltip.WeaponTooltipData;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;

import java.util.List;

public class TooltipRenderer {
    public static void draw(DrawContext context, TextRenderer textRenderer, List<Text> lines, int x, int y, ItemStack stack) {
        int width = getWidth(textRenderer, lines);
        int height = getHeight(textRenderer, lines);

        int background = 0xE61C1C24;
        int border = 0xFFB8A46B;
        int shadow = 0x66000000;
        if(stack.getItem() instanceof ColouredTooltipItem item) {
            background = item.tooltipBackground();
            border = item.tooltipBorder();
            shadow = item.tooltipShadow();
        }

        NineSliceRenderer.drawRounded(context, x, y, width + 12, height + 12, 6, border, background, shadow);
        drawText(context, textRenderer, lines, x + 6, y + 6);
    }

    private static void drawText(DrawContext context, TextRenderer renderer, List<Text> lines, int x, int y) {
        int offset = 0;
        for(Text text : lines) {
            context.drawText(renderer, text, x, y + offset, 0xFFFFFFFF, true);
            offset += renderer.fontHeight + 2;
        }
    }

    private static int getWidth(TextRenderer renderer, List<Text> lines) {
        int width = 0;
        for(Text text : lines) {
            width = Math.max(width, renderer.getWidth(text));
        }

        return width;
    }

    private static int getHeight(TextRenderer renderer, List<Text> lines) {
        return lines.size() * (renderer.fontHeight + 2);
    }

    private static void drawDivider(DrawContext context, int x, int y, int width){
        context.fill(x, y, x + width, y + 1, TooltipColours.DIVIDER);
    }

    public static void drawWeaponTooltip(DrawContext context, TextRenderer renderer, WeaponTooltipData data, int x, int y){
        int width = 220;

        context.getMatrices().push();
        context.getMatrices().translate(0, 0, 500);

        NineSliceRenderer.drawRounded(context, x, y, width, 150, 6, data.weaponRarity().getTextColor().getRgb(), 0xE61C1C24, 0x66000000);

        int line = y + 8;
        context.drawText(renderer, data.name(), x + 8, line, TooltipColours.TITLE, true);

        line += 16;
        context.drawText(renderer, data.weaponRarity().getStarText(), x + 8, line, 0xFFFFFFFF, false);

        line += 16;
        context.drawText(renderer, data.weaponType().getDisplayName(), x + 8, line, 0xFFAAAAAA, false);

        line += 14;
        drawDivider(context, x + 8, line, width - 16);

        line += 10;
        context.drawText(renderer, "Base ATK " + data.attack(), x + 8, line, TooltipColours.STAT, false);

        line += 14;
        context.drawText(renderer, data.secondaryName() + " " + data.secondaryValue(), x + 8, line, TooltipColours.STAT, false);

        line += 16;
        drawDivider(context, x + 8, line, width - 16);

        line += 10;
        context.drawText(renderer, data.passiveName(), x + 8, line, data.weaponRarity().getTextColor().getRgb(), true);

        line += 14;
        for(OrderedText text : renderer.wrapLines(Text.literal(data.passiveDescription()), width - 16)) {
            context.drawText(renderer, text, x + 8, line, TooltipColours.DESCRIPTION, false);
            line += 12;
        }

        context.getMatrices().pop();
    }
}
