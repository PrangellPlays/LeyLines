package dev.lumi.leylines.character;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LeylinesCharacterRegistry {
    private static final Gson GSON = new Gson();
    private static final Map<Identifier, CharacterDefinition> CHARACTERS = new HashMap<>();

    public static void init() {
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new ReloadListener());
    }

    public static CharacterDefinition get(Identifier id) {
        return CHARACTERS.get(id);
    }

    public static Collection<CharacterDefinition> getAll() {
        return CHARACTERS.values();
    }

    public static void clear() {
        CHARACTERS.clear();
    }

    public static void register(CharacterDefinition definition) {
        CHARACTERS.put(definition.id(), definition);
    }

    private static class ReloadListener implements SimpleSynchronousResourceReloadListener {
        @Override
        public Identifier getFabricId() {
            return Identifier.of("leylines", "character_loader");
        }

        @Override
        public void reload(ResourceManager manager) {
            clear();

            manager.findResources("characters", path -> path.getPath().endsWith(".json"))
                    .forEach((id, resource) -> {
                        try (BufferedReader reader = resource.getReader()) {
                            JsonObject json = GSON.fromJson(reader, JsonObject.class);
                            Identifier characterId = Identifier.of(json.get("id").getAsString());
                            String displayName = json.get("display_name").getAsString();
                            String model = json.get("model").getAsString();
                            Identifier skin = Identifier.of(json.get("default_skin").getAsString());

                            register(new CharacterDefinition(characterId, displayName, model, skin));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
