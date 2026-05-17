package dev.lumi.leylines.client.skin;

import dev.lumi.leylines.character.CharacterDefinition;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class LeyLinesCharacterSkinUtil {
    private static final Map<Identifier, SkinTextures> CACHE = new HashMap<>();

    public static SkinTextures getSkin(AbstractClientPlayerEntity player, SkinTextures original) {
        Identifier active = LeyLinesComponents.CHARACTER.get(player).getActiveCharacter();
        CharacterDefinition definition = LeylinesCharacterRegistry.get(active);

        if (definition == null) {
            return original;
        }

        return CACHE.computeIfAbsent(active, id -> {
            SkinTextures.Model model = definition.model().equals("slim") ? SkinTextures.Model.SLIM : SkinTextures.Model.WIDE;
            return new SkinTextures(definition.skin(), null, null, null, model, true
            );
        });
    }
}
