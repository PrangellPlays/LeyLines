package dev.lumi.leylines.cca;

import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.Vec3d;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;
import org.ladysnake.cca.api.v3.component.tick.CommonTickingComponent;

public class PlayerWindGliderComponent implements AutoSyncedComponent, CommonTickingComponent {
    private final PlayerEntity player;
    public boolean gliding = false;
    private int toggleCooldown = 0;
    private int airborneTicks = 0;

    public PlayerWindGliderComponent(PlayerEntity player) {
        this.player = player;
    }

    @Override
    public void tick() {
        if (toggleCooldown > 0) {
            toggleCooldown--;
        }

        if (!player.isOnGround()) {
            airborneTicks++;
        } else {
            airborneTicks = 0;
        }

        if (airborneTicks < 6) {
            return;
        }

        if (!gliding) {
            return;
        }

        player.fallDistance = 0;
        if (player.isOnGround() || player.isSneaking() || player.isFallFlying() || player.getAbilities().flying) {
            setGliding(false);
            return;
        }

        PlayerProfileComponent profile = LeyLinesComponents.PROFILE.get(player);
        if (!profile.consumeStamina(0.5f)) {
            setGliding(false);
            return;
        }

        Vec3d velocity = player.getVelocity();
        double fallSpeed = -0.08D;
        velocity = new Vec3d(velocity.x * 0.91D, Math.max(velocity.y, fallSpeed), velocity.z * 0.91D);
        player.setVelocity(velocity);
        player.velocityModified = true;
    }

    public void toggleGliding() {
        if (toggleCooldown > 0) {
            return;
        }

        toggleCooldown = 5;
        if (player.isOnGround()) {
            return;
        }

        if (player.isFallFlying()) {
            return;
        }

        setGliding(!gliding);
    }

    public boolean isGliding() {
        return gliding;
    }

    public void setGliding(boolean gliding) {
        this.gliding = gliding;
        LeyLinesComponents.WIND_GLIDER.sync(player);
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        gliding = nbtCompound.getBoolean("Gliding");
        toggleCooldown = nbtCompound.getInt("ToggleCooldown");
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.putBoolean("Gliding", gliding);
        nbtCompound.putInt("ToggleCooldown", toggleCooldown);
    }
}
