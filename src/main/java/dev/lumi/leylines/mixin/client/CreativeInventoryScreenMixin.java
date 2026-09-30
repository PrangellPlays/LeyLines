package dev.lumi.leylines.mixin.client;

import dev.lumi.leylines.access.CreativeScreenAccessor;
import dev.lumi.leylines.access.HandledScreenAccessor;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Collection;

@Mixin(CreativeInventoryScreen.class)
public abstract class CreativeInventoryScreenMixin implements CreativeScreenAccessor {
    @Shadow private static ItemGroup selectedTab;

    @Shadow private void refreshSelectedTab(Collection<ItemStack> displayStacks) {
        throw new AssertionError();
    }

    @Override
    public ItemGroup leylines$getSelectedTab() {
        return selectedTab;
    }

    @Override
    public void leylines$refreshSelectedTab(Collection<ItemStack> stacks) {
        refreshSelectedTab(stacks);
    }

    @Override
    public int leylines$getGuiLeft() {
        return ((HandledScreenAccessor) this).leylines$getHandledScreenX();
    }

    @Override
    public int leylines$getGuiTop() {
        return ((HandledScreenAccessor) this).leylines$getHandledScreenY();
    }
}
