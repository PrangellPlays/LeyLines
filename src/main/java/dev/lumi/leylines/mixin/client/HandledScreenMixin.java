package dev.lumi.leylines.mixin.client;

import dev.lumi.leylines.access.HandledScreenAccessor;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin implements HandledScreenAccessor {
    @Shadow protected int x;
    @Shadow protected int y;

    @Override
    public int leylines$getHandledScreenX() {
        return x;
    }

    @Override
    public int leylines$getHandledScreenY() {
        return y;
    }
}
