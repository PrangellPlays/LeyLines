package dev.lumi.leylines.util;

import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class TextOptions {
    /**
     * Takes a text and returns the same text but with the given int color.
     */
    public static MutableText withColor(String text, int color) {
        return Text.literal(text).setStyle(Style.EMPTY.withColor(color));
    }

    public static MutableText translateWithColor(String text, int color) {
        return Text.translatable(text).setStyle(Style.EMPTY.withColor(color));
    }

    public static MutableText withFormatting(String text, Formatting... formatting) {
        var textPieces = text.split("§");
        if (formatting.length != textPieces.length) return withColor("unmatched format specifiers - this is a bug", 0xff007f);

        var textBase = Text.literal(textPieces[0]).formatted(formatting[0]);

        for (int i = 1; i < textPieces.length; i++) {
            textBase.append(Text.literal(textPieces[i]).formatted(formatting[i]));
        }

        return textBase;
    }

    public static MutableText withColor(String text, int... colors) {
        var textPieces = text.split("§");
        if (colors.length != textPieces.length) return withColor("unmatched color specifiers - this is a bug", 0xff007f);

        var textBase = withColor(textPieces[0], colors[0]);

        for (int i = 1; i < textPieces.length; i++) {
            textBase.append(withColor(textPieces[i], colors[i]));
        }

        return textBase;
    }

    public static int color(Formatting formatting) {
        return formatting.getColorValue() == null ? 0 : formatting.getColorValue();
    }
}
