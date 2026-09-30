package dev.lumi.leylines.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class LeyLinesFilterButton extends ButtonWidget {
    private final Boolean rarityFilter;
    private final ItemStack icon;
    private final BooleanSupplier selected;
    private final Identifier starTexture;
    private final Identifier backgroundTexture;
    private final Identifier backgroundSelectedTexture;

    public LeyLinesFilterButton(int x, int y, boolean rarityFilter, ItemStack icon, Identifier starTexture, Text tooltip, Identifier backgroundTexture, Identifier backgroundSelectedTexture, PressAction pressAction, BooleanSupplier selected) {
        super(x, y, 26, 26, Text.empty(), pressAction, DEFAULT_NARRATION_SUPPLIER);

        this.rarityFilter = rarityFilter;
        this.icon = icon;
        this.selected = selected;
        this.starTexture = starTexture;
        this.backgroundTexture = backgroundTexture;
        this.backgroundSelectedTexture = backgroundSelectedTexture;
        this.setTooltip(Tooltip.of(tooltip));
    }

    @Override
    public void renderWidget(DrawContext context, int mouseX, int mouseY, float delta) {
        if (selected.getAsBoolean()) {
            context.drawTexture(backgroundSelectedTexture, getX(), getY(), 0, 0, width, height, width, height);
        } else {
            context.drawTexture(backgroundTexture, getX(), getY(), 0, 0, width, height, width, height);
        }

        if (rarityFilter) {
            context.drawTexture(starTexture, getX(), getY(), 0, 0, width, height, width, height);
        } else {
            context.drawItem(icon, getX() + 5, getY() + 5);
        }
    }
}
