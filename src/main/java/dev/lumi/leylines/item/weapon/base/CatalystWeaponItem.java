package dev.lumi.leylines.item.weapon.base;

import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;

public class CatalystWeaponItem extends LeyLinesWeaponItem {
    public CatalystWeaponItem(ILeyLinesWeaponRarity weaponRarity, int attack, String secondary, String secondaryValue, String passive, String passiveDescription, Settings settings) {
        super(ILeyLinesWeaponType.CATALYST, weaponRarity, attack, secondary, secondaryValue, passive, passiveDescription, settings);
    }
}
