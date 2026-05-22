package dev.lumi.leylines.character;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public record CharacterDefinition(Identifier id, String model, Identifier defaultSkin) {
    public Text displayName() {
        return Text.translatable("character." + id.getNamespace() + "." + id.getPath());
    }
}
