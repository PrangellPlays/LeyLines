package dev.lumi.leylines.cca;

import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class PlayerWindGliderComponent implements Component, AutoSyncedComponent {
    private final PlayerEntity player;
    public boolean gliding = false;

    public PlayerWindGliderComponent(PlayerEntity player) {
        this.player = player;
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
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.putBoolean("Gliding", gliding);
    }
}
