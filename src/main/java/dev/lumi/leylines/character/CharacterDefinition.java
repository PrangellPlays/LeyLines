package dev.lumi.leylines.character;

import net.minecraft.util.Identifier;

public record CharacterDefinition(Identifier id, String displayName, String model, Identifier skin) {
}
