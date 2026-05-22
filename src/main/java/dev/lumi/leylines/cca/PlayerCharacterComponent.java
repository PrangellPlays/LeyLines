package dev.lumi.leylines.cca;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.character.CharacterSkinDefinition;
import dev.lumi.leylines.character.LeyLinesCharacterSkinRegistry;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

import java.util.HashMap;
import java.util.Map;

public class PlayerCharacterComponent implements Component, AutoSyncedComponent {
    private final PlayerEntity player;
    private Identifier activeCharacter = LeyLines.id("none");
    private final Map<Identifier, Identifier> equippedSkins = new HashMap<>();

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

    public Identifier getEquippedSkin(Identifier character) {
        return equippedSkins.getOrDefault(character, LeylinesCharacterRegistry.get(character).defaultSkin());
    }

    public void setEquippedSkin(Identifier character, Identifier skin) {
        CharacterSkinDefinition definition = LeyLinesCharacterSkinRegistry.get(skin);
        if (definition == null) {
            return;
        }

        if (!definition.character().equals(character)) {
            return;
        }

        equippedSkins.put(character, skin);
        LeyLinesComponents.CHARACTER.sync(player);
    }

    public boolean hasSkinEquipped(Identifier character, Identifier skin) {
        return getEquippedSkin(character).equals(skin);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        activeCharacter = Identifier.of(tag.getString("ActiveCharacter"));

        equippedSkins.clear();
        NbtCompound skinsTag = tag.getCompound("EquippedSkins");
        for (String key : skinsTag.getKeys()) {
            equippedSkins.put(Identifier.of(key), Identifier.of(skinsTag.getString(key)));
        }
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("ActiveCharacter", activeCharacter.toString());

        NbtCompound skinsTag = new NbtCompound();
        for (var entry : equippedSkins.entrySet()) {
            skinsTag.putString(entry.getKey().toString(), entry.getValue().toString());
        }

        tag.put("EquippedSkins", skinsTag);
    }
}
