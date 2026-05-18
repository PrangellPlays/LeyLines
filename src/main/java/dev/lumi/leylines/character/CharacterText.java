package dev.lumi.leylines.character;

import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class CharacterText {
    public static Text getCharacterName(PlayerEntity player) {
        PlayerPartyComponent party = LeyLinesComponents.PARTY.get(player);
        CharacterDefinition definition = LeylinesCharacterRegistry.get(party.getActiveCharacter());
        if (definition == null) {
            return Text.literal("None");
        }

        return definition.displayName();
    }

    public static Text getDecoratedName(PlayerEntity player) {
        return Text.literal("").append(player.getGameProfile().getName()).append(" (").append(getCharacterName(player)).append(")");
    }
}
