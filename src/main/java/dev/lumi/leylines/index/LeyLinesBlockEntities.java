package dev.lumi.leylines.index;

import dev.lumi.leylines.LeyLines;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeyLinesBlockEntities {
    protected static final Map<BlockEntityType<?>, Identifier> BLOCK_ENTITY_TYPES = new LinkedHashMap();
    //public static final BlockEntityType<ClawBlockEntity> CLAW;

    public LeyLinesBlockEntities() {
    }

    protected static <T extends BlockEntity> BlockEntityType<T> create(String name, BlockEntityType<T> blockEntityType) {
        BLOCK_ENTITY_TYPES.put(blockEntityType, LeyLines.id(name));
        return blockEntityType;
    }

    public static void init() {
        BLOCK_ENTITY_TYPES.forEach((blockEntityType, id) -> {
            Registry.register(Registries.BLOCK_ENTITY_TYPE, id, blockEntityType);
        });
    }

    static {
        //CLAW = create("claw", FabricBlockEntityTypeBuilder.create(ClawBlockEntity::new, PookieGiftBlocks.CLAW).build());
    }
}
