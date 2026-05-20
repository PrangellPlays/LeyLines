package dev.lumi.leylines.init;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.cca.PlayerCharacterComponent;
import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.cca.PlayerProfileComponent;
import dev.lumi.leylines.cca.PlayerWindGliderComponent;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

public class LeyLinesComponents implements EntityComponentInitializer {
    public static final ComponentKey<PlayerProfileComponent> PROFILE = ComponentRegistry.getOrCreate(LeyLines.id("profile"), PlayerProfileComponent.class);
    public static final ComponentKey<PlayerCharacterComponent> CHARACTER = ComponentRegistry.getOrCreate(LeyLines.id("character"), PlayerCharacterComponent.class);
    public static final ComponentKey<PlayerPartyComponent> PARTY = ComponentRegistry.getOrCreate(LeyLines.id("party"), PlayerPartyComponent.class);
    public static final ComponentKey<PlayerWindGliderComponent> WIND_GLIDER = ComponentRegistry.getOrCreate(LeyLines.id("wind_glider"), PlayerWindGliderComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry entityComponentFactoryRegistry) {
        entityComponentFactoryRegistry.registerForPlayers(PROFILE, PlayerProfileComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
        entityComponentFactoryRegistry.registerForPlayers(CHARACTER, PlayerCharacterComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
        entityComponentFactoryRegistry.registerForPlayers(PARTY, PlayerPartyComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
        entityComponentFactoryRegistry.registerForPlayers(WIND_GLIDER, PlayerWindGliderComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
    }
}
