package dev.lumi.leylines.item.weapon.base;

import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;

public class BowWeaponItem extends LeyLinesWeaponItem {
    public BowWeaponItem(ILeyLinesWeaponRarity weaponRarity, int attack, String secondary, String secondaryValue, String passive, String passiveDescription, Settings settings) {
        super(ILeyLinesWeaponType.BOW, weaponRarity, attack, secondary, secondaryValue, passive, passiveDescription, settings);
    }
}
