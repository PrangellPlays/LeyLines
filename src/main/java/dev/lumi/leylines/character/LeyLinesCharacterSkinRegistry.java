package dev.lumi.leylines.character;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.util.*;
import java.util.stream.Collectors;

public class LeyLinesCharacterSkinRegistry {
    private static final Gson GSON = new Gson();
    private static final Map<Identifier, CharacterSkinDefinition> SKINS = new HashMap<>();

    public static void init() {
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new ReloadListener());
    }

    public static void register(CharacterSkinDefinition definition) {
        SKINS.put(definition.id(), definition);
    }

    public static CharacterSkinDefinition get(Identifier id) {
        return SKINS.get(id);
    }

    public static void clear() {
        SKINS.clear();
    }

    public static Set<Identifier> idsForCharacter(Identifier character) {
        return SKINS.values().stream().filter(skin -> skin.character().equals(character)).map(CharacterSkinDefinition::id).collect(Collectors.toSet());
    }

    private static class ReloadListener implements SimpleSynchronousResourceReloadListener {
        @Override
        public Identifier getFabricId() {
            return Identifier.of("leylines", "skin_loader");
        }

        @Override
        public void reload(ResourceManager manager) {
            clear();

            manager.findResources("skins", path -> path.getPath().endsWith(".json")).forEach((id, resource) -> {
                try (BufferedReader reader = resource.getReader()) {
                    JsonObject json = GSON.fromJson(reader, JsonObject.class);
                    Identifier skinId = Identifier.of(json.get("id").getAsString());
                    Identifier character = Identifier.of(json.get("character").getAsString());
                    Identifier texture = Identifier.of(json.get("texture").getAsString());
                    String model = json.get("model").getAsString();

                    register(new CharacterSkinDefinition(skinId, character, texture, model));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
