package dev.lumi.leylines.access;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Collection;

public interface CreativeScreenAccessor {
    ItemGroup leylines$getSelectedTab();
    void leylines$refreshSelectedTab(Collection<ItemStack> stacks);
    int leylines$getGuiLeft();
    int leylines$getGuiTop();
}
