package dev.lumi.leylines.client;

import dev.lumi.leylines.index.LeyLinesItemGroups;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;
import dev.lumi.leylines.access.CreativeScreenAccessor;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public final class LeyLinesWeaponsTabFilter {
    private static final Set<ILeyLinesWeaponType> SELECTED_TYPES = EnumSet.noneOf(ILeyLinesWeaponType.class);
    private static final Set<ILeyLinesWeaponRarity> SELECTED_RARITIES = EnumSet.noneOf(ILeyLinesWeaponRarity.class);

    private LeyLinesWeaponsTabFilter() {
    }

    public static boolean isTypeSelected(ILeyLinesWeaponType type) {
        return SELECTED_TYPES.contains(type);
    }

    public static boolean isRaritySelected(ILeyLinesWeaponRarity rarity) {
        return SELECTED_RARITIES.contains(rarity);
    }

    public static void toggleType(ILeyLinesWeaponType type) {
        if (!SELECTED_TYPES.add(type)) {
            SELECTED_TYPES.remove(type);
        }
    }

    public static void toggleRarity(ILeyLinesWeaponRarity rarity) {
        if (!SELECTED_RARITIES.add(rarity)) {
            SELECTED_RARITIES.remove(rarity);
        }
    }

    public static boolean matches(ItemStack stack) {
        if (!(stack.getItem() instanceof LeyLinesWeaponItem weapon)) {
            return false;
        }

        boolean typeMatches = SELECTED_TYPES.isEmpty() || SELECTED_TYPES.contains(weapon.getWeaponType());
        boolean rarityMatches = SELECTED_RARITIES.isEmpty() || SELECTED_RARITIES.contains(weapon.getWeaponRarity());
        return typeMatches && rarityMatches;
    }

    public static void refresh(CreativeInventoryScreen screen) {
        if (!isLeyLinesTab(screen)) {
            return;
        }

        ItemGroup group = LeyLinesItemGroups.LEYLINES_WEAPONS_GROUP;

        Collection<ItemStack> filtered = new ArrayList<>(group.getDisplayStacks());
        filtered.removeIf(stack -> !matches(stack));

        CreativeScreenAccessor access = (CreativeScreenAccessor) screen;
        access.leylines$refreshSelectedTab(filtered);
    }

    private static boolean isLeyLinesTab(CreativeInventoryScreen screen) {
        CreativeScreenAccessor access = (CreativeScreenAccessor) screen;

        return access.leylines$getSelectedTab() == LeyLinesItemGroups.LEYLINES_WEAPONS_GROUP;
    }
}
