package starrflower.blocks.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import starrflower.blocks.StarrSBlocks;

import java.util.function.Function;

public class ModBlocks {
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            properties -> new Block(properties.strength(0.65F)
                    .sound(SoundType.WET_GRASS)));



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(StarrSBlocks.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(StarrSBlocks.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(StarrSBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(StarrSBlocks.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        StarrSBlocks.LOGGER.info("Registering Mod Blocks for " + StarrSBlocks.MOD_ID);
    }
}
