package dev.lumi.leylines.item.util.tooltip;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public interface LeyLinesTooltipItem {
    List<Text> getTooltip(ItemStack stack);
}
