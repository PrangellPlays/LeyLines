package dev.lumi.leylines.index;

import dev.lumi.leylines.LeyLines;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class LeyLinesBlocks {
    protected static final Map<Block, Identifier> BLOCKS = new LinkedHashMap();
    //public static final Block CLAW;

    public static void init() {
        BLOCKS.forEach((block, id) -> {
            Registry.register(Registries.BLOCK, id, block);
        });
    }

    protected static <T extends Block> T register(String name, T block) {
        BLOCKS.put(block, LeyLines.id(name));
        return block;
    }

    protected static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    protected static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        return registerWithItem(name, block, (b) -> {
            return new BlockItem(b, settings);
        });
    }

    protected static <T extends Block> T registerWithItem(String name, T block, Function<T, BlockItem> itemGenerator) {
        LeyLinesItems.register(name, (BlockItem)itemGenerator.apply(block));
        return register(name, block);
    }

    public LeyLinesBlocks() {
    }

    static {
        //CLAW = registerWithItem("claw", new ClawBlock(FabricBlockSettings.create().strength(0.3F).sounds(BlockSoundGroup.LODESTONE).nonOpaque().allowsSpawning(Blocks::never)));
    }
}
