package dev.lumi.leylines.mixin.client;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.character.CharacterDefinition;
import dev.lumi.leylines.character.CharacterSkinDefinition;
import dev.lumi.leylines.character.LeyLinesCharacterSkinRegistry;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Mixin(AbstractClientPlayerEntity.class)
public class AbstractClientPlayerEntityMixin {
    @Unique Map<UUID, SkinTextures> ORIGINAL_SKINS = new HashMap<>();

    @Inject(method = "getSkinTextures", at = @At("HEAD"), cancellable = true)
    private void leylines$getSkinTextures(CallbackInfoReturnable<SkinTextures> cir) {
        AbstractClientPlayerEntity player = (AbstractClientPlayerEntity)(Object)this;
        Identifier active = LeyLinesComponents.PARTY.get(player).getActiveCharacter();
        if (active == null || active.equals(LeyLines.id("none"))) {
            return;
        }

        CharacterDefinition definition = LeylinesCharacterRegistry.get(active);
        if (definition == null) {
            return;
        }

        Identifier equippedSkin = LeyLinesComponents.CHARACTER.get(player).getEquippedSkin(active);
        if (equippedSkin == null) {
            equippedSkin = definition.defaultSkin();
        }

        CharacterSkinDefinition skin = LeyLinesCharacterSkinRegistry.get(equippedSkin);
        if (skin == null) {
            return;
        }

        SkinTextures.Model model = skin.model().equals("slim") ? SkinTextures.Model.SLIM : SkinTextures.Model.WIDE;
        //cir.setReturnValue(new SkinTextures(definition.skin(), null, original.capeTexture(), original.elytraTexture(), model, true));
        cir.setReturnValue(new SkinTextures(skin.texture(), null, null, null, model, true));
    }
}
