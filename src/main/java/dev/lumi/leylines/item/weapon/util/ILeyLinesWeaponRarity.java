package dev.lumi.leylines.item.weapon.util;

import net.minecraft.text.Text;
import net.minecraft.text.TextColor;

public enum ILeyLinesWeaponRarity {
    ONE_STAR(1, TextColor.fromRgb(0xFF8C95A6)),
    TWO_STAR(2, TextColor.fromRgb(0xFF60C381)),
    THREE_STAR(3, TextColor.fromRgb(0xFF549BE6)),
    FOUR_STAR(4, TextColor.fromRgb(0xFFAA6CD9)),
    FIVE_STAR(5, TextColor.fromRgb(0xFFEEA439));

    private final int stars;
    private final TextColor textColor;

    ILeyLinesWeaponRarity(int stars, TextColor textColor) {
        this.stars = stars;
        this.textColor = textColor;
    }

    public int getStars() {
        return stars;
    }

    public TextColor getTextColor() {
        return textColor;
    }

    public Text getStarText() {
        return Text.literal("\u2605".repeat(stars)).styled(style -> style.withColor(textColor));
    }

    public static ILeyLinesWeaponRarity fromStars(int stars) {
        for (ILeyLinesWeaponRarity rarity : values()) {
            if (rarity.stars == stars) {
                return rarity;
            }
        }
        throw new IllegalArgumentException("Unknown rarity: " + stars);
    }
}
