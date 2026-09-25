package dev.lumi.leylines.character;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public record CharacterDefinition(Identifier id, String model, Identifier defaultSkin, CharacterData characterData) {
    public Text displayName() {
        return Text.translatable("character." + id.getNamespace() + "." + id.getPath());
    }

    public record CharacterData(Integer starCount, Identifier element, Identifier weapon, Identifier region, Identifier modelType) {
    }
}
