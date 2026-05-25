package dev.lumi.leylines.character;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public record CharacterSkinDefinition(Identifier id, Identifier character, VanillaVisualData vanilla, GeckoVisualData gecko) {
    public Text displayName() {
        return Text.translatable("skin." + id.getNamespace() + "." + id.getPath());
    }

    public record VanillaVisualData(Identifier texture, String model) {
    }

    public record GeckoVisualData(boolean useGeckoModel, @Nullable Identifier texture, @Nullable Identifier glowTexture, @Nullable Identifier model, @Nullable Identifier animation) {
        public boolean hasRequiredAssets() {
            return texture != null && model != null && animation != null;
        }
    }
}
