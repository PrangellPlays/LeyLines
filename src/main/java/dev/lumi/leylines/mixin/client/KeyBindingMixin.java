package dev.lumi.leylines.mixin.client;

import dev.lumi.leylines.index.keybinds.LeyLinesKeybinds;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(KeyBinding.class)
public class KeyBindingMixin {
    @Inject(method = "compareTo", at = @At("HEAD"), cancellable = true)
    private void leylines$customCompare(KeyBinding other, CallbackInfoReturnable<Integer> cir) {
        KeyBinding self = (KeyBinding) (Object) this;
        Integer selfCategoryOrder = LeyLinesKeybinds.getCategoryOrder(self);
        Integer otherCategoryOrder = LeyLinesKeybinds.getCategoryOrder(other);

        // Only override the comparison when BOTH are Ley Lines keybinds.
        if (selfCategoryOrder != null && otherCategoryOrder != null) {
            // First: compare categories.
            int categoryComparison = Integer.compare(selfCategoryOrder, otherCategoryOrder);
            if (categoryComparison != 0) {
                cir.setReturnValue(categoryComparison);
                return;
            }

            // Second: compare keybinds within the category.
            int keyComparison = Integer.compare(LeyLinesKeybinds.getKeyBindingOrder(self), LeyLinesKeybinds.getKeyBindingOrder(other));
            cir.setReturnValue(keyComparison);
        }
    }
}
