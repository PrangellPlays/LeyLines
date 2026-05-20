package dev.lumi.leylines.mixin.server;

import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @ModifyArg(method = "applyMovementInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"))
    private float leyLines$windGliderMovementMultiplier(float value) {
        var component = LeyLinesComponents.WIND_GLIDER.getNullable(this);
        if (component != null && component.isGliding()) {
            return value * 1.15f;
        }

        return value;
    }
}
