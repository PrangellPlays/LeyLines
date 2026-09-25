package dev.lumi.leylines;

import dev.lumi.leylines.datagen.LeyLinesLangProvider;
import dev.lumi.leylines.datagen.LeyLinesModelProvider;
import dev.lumi.leylines.datagen.LeylinesCharacterProvider;
import dev.lumi.leylines.datagen.LeylinesCharacterSkinProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LeyLinesDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(LeyLinesModelProvider::new);
		pack.addProvider(LeyLinesLangProvider::new);

		pack.addProvider(LeylinesCharacterProvider::new);
		pack.addProvider(LeylinesCharacterSkinProvider::new);
	}
}
