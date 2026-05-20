package dev.lumi.leylines.mixin.server;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.lumi.leylines.cca.PlayerWindGliderComponent;
import dev.lumi.leylines.character.CharacterText;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.fabricmc.fabric.mixin.event.lifecycle.LivingEntityMixin;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @ModifyReturnValue(method = "getDisplayName", at = @At("RETURN"))
    private Text leylines$displayName(Text original) {
        PlayerEntity self = (PlayerEntity)(Object)this;
        return CharacterText.getDecoratedName(self);
    }
}
