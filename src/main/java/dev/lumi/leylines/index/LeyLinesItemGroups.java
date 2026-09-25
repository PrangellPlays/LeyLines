package dev.lumi.leylines.index;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import static dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity.*;
import static dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType.*;

public interface LeyLinesItemGroups {
    ItemGroup LEYLINES_WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP, LeyLines.id("leylines_weapon_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.leylines.leylines_weapon_group")).icon(() -> new ItemStack(LeyLinesItems.DULL_BLADE)).entries((displayContext, entries) -> {
        //5 Star
        addWeapons(entries, FIVE_STAR, SWORD);
        addWeapons(entries, FIVE_STAR, CLAYMORE);
        addWeapons(entries, FIVE_STAR, POLEARM);
        addWeapons(entries, FIVE_STAR, CATALYST);
        addWeapons(entries, FIVE_STAR, BOW);

        //4 Star
        addWeapons(entries, FOUR_STAR, SWORD);
        addWeapons(entries, FOUR_STAR, CLAYMORE);
        addWeapons(entries, FOUR_STAR, POLEARM);
        addWeapons(entries, FOUR_STAR, CATALYST);
        addWeapons(entries, FOUR_STAR, BOW);

        //3 Star
        addWeapons(entries, THREE_STAR, SWORD);
        addWeapons(entries, THREE_STAR, CLAYMORE);
        addWeapons(entries, THREE_STAR, POLEARM);
        addWeapons(entries, THREE_STAR, CATALYST);
        addWeapons(entries, THREE_STAR, BOW);

        //2 Star
        addWeapons(entries, TWO_STAR, SWORD);
        addWeapons(entries, TWO_STAR, CLAYMORE);
        addWeapons(entries, TWO_STAR, POLEARM);
        addWeapons(entries, TWO_STAR, CATALYST);
        addWeapons(entries, TWO_STAR, BOW);

        //1 Star
        addWeapons(entries, ONE_STAR, SWORD);
        addWeapons(entries, ONE_STAR, CLAYMORE);
        addWeapons(entries, ONE_STAR, POLEARM);
        addWeapons(entries, ONE_STAR, CATALYST);
        addWeapons(entries, ONE_STAR, BOW);
    }).build());

    public static void init() {
    }

    private static void addWeapons(ItemGroup.Entries entries, ILeyLinesWeaponRarity weaponRarity, ILeyLinesWeaponType weaponType) {
        LeyLinesItems.WEAPONS.stream().filter(weapon -> weapon.getWeaponRarity() == weaponRarity).filter(weapon -> weapon.getWeaponType() == weaponType).forEach(entries::add);
    }
}
