package dev.lumi.leylines.cca;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class PlayerCharacterComponent implements Component, AutoSyncedComponent {
    private final PlayerEntity player;
    private Identifier activeCharacter = LeyLines.id("none");

    public PlayerCharacterComponent(PlayerEntity player) {
        this.player = player;
    }

    public Identifier getActiveCharacter() {
        return activeCharacter;
    }

    public void setActiveCharacter(Identifier activeCharacter) {
        this.activeCharacter = activeCharacter;

        LeyLinesComponents.CHARACTER.sync(player);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        activeCharacter = Identifier.of(tag.getString("ActiveCharacter"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("ActiveCharacter", activeCharacter.toString());
    }
}
