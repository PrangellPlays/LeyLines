package dev.lumi.leylines.datagen;

import com.google.gson.JsonObject;
import dev.lumi.leylines.LeyLines;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LeylinesCharacterSkinProvider implements DataProvider {
    private final FabricDataOutput output;

    public LeylinesCharacterSkinProvider(FabricDataOutput output) {
        this.output = output;
    }

    @Override public CompletableFuture<?> run(DataWriter writer) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        //Aino
        addCharacterSkin(futures, writer,
                LeyLines.id("aino_fluffy_puffy_whiz_kid_workwear"),
                LeyLines.id("aino"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Traveler Male
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_as_heaven_and_earth_are_made_anew"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_as_heaven_and_earth_are_made_anew.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_night_hunt_in_snow"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_night_hunt_in_snow.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_rising_star"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_rising_star.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private void addCharacterSkin(List<CompletableFuture<?>> futures, DataWriter writer, Identifier id, Identifier character, String model, Boolean useGecko, Identifier geckoTexture, Identifier geckoGlowTexture, Identifier geckoModel, Identifier geckoAnimations) {
        JsonObject json = new JsonObject();
        json.addProperty("id", id.toString());
        json.addProperty("character", character.toString());

        JsonObject vanilla = new JsonObject();
        vanilla.addProperty("texture", vanillaTexture(character, id).toString());
        vanilla.addProperty("model", model);

        JsonObject gecko = new JsonObject();
        gecko.addProperty("useGeckoModel", useGecko);
        gecko.addProperty("texture", geckoTexture.toString());
        gecko.addProperty("glow_texture", geckoGlowTexture.toString());
        gecko.addProperty("model", geckoModel.toString());
        gecko.addProperty("animation", geckoAnimations.toString());

        json.add("vanilla", vanilla);
        json.add("gecko", gecko);
        futures.add(DataProvider.writeToPath(writer, json, output.getResolver(DataOutput.OutputType.DATA_PACK, "skins").resolveJson(id)));
    }

    private void addCharacterSkinComplex(List<CompletableFuture<?>> futures, DataWriter writer, Identifier id, Identifier character, Identifier vanillaTexture, String model, Boolean useGecko, Identifier geckoTexture, Identifier geckoGlowTexture, Identifier geckoModel, Identifier geckoAnimations) {
        JsonObject json = new JsonObject();
        json.addProperty("id", id.toString());
        json.addProperty("character", character.toString());

        JsonObject vanilla = new JsonObject();
        vanilla.addProperty("texture", vanillaTexture.toString());
        vanilla.addProperty("model", model);

        JsonObject gecko = new JsonObject();
        gecko.addProperty("useGeckoModel", useGecko);
        gecko.addProperty("texture", geckoTexture.toString());
        gecko.addProperty("glow_texture", geckoGlowTexture.toString());
        gecko.addProperty("model", geckoModel.toString());
        gecko.addProperty("animation", geckoAnimations.toString());

        json.add("vanilla", vanilla);
        json.add("gecko", gecko);
        futures.add(DataProvider.writeToPath(writer, json, output.getResolver(DataOutput.OutputType.DATA_PACK, "skins").resolveJson(id)));
    }

    private Identifier vanillaTexture(Identifier character, Identifier id) {
        return Identifier.of("textures/character/" + character.getPath() + "/skins/" + id.getPath() + ".png");
    }

    @Override public String getName() {
        return "Character Skin Data";
    }
}
