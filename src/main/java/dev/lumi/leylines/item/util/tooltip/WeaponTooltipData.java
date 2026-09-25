package dev.lumi.leylines.item.util.tooltip;

import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;

public record WeaponTooltipData(String name, ILeyLinesWeaponRarity weaponRarity, ILeyLinesWeaponType weaponType, int attack, String secondaryName, String secondaryValue, String passiveName, String passiveDescription) {
    public static WeaponTooltipData of(LeyLinesWeaponItem weaponItem) {
        return new WeaponTooltipData(weaponItem.getName().getString(), weaponItem.getWeaponRarity(), weaponItem.getWeaponType(), weaponItem.getBaseAttack(), weaponItem.getSecondaryName(), weaponItem.getSecondaryValue(), weaponItem.getPassiveName(), weaponItem.getPassiveDescription());
    }
}
