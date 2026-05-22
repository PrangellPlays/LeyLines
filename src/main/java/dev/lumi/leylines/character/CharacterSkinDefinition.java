package dev.lumi.leylines.character;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public record CharacterSkinDefinition(Identifier id, Identifier character, Identifier texture, String model) {
    public Text displayName() {
        return Text.translatable("skin." + id.getNamespace() + "." + id.getPath());
    }
}
