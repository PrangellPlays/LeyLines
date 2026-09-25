package dev.lumi.leylines.item.weapon.util;

import net.minecraft.text.Text;

public enum ILeyLinesWeaponType {
    SWORD,
    CLAYMORE,
    POLEARM,
    CATALYST,
    BOW;

    public Text getDisplayName() {
        return Text.translatable("weapon_type.leylines." + name().toLowerCase());
    }
}
