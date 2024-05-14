package net.merian.rattherat.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.merian.rattherat.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.merian.rattherat.RatTheRat;

public class ModBlocks {

    public static final Block CHEESE_BLOCK = new CheeseBlock(AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).nonOpaque());

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(RatTheRat.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        RatTheRat.LOGGER.info("Registering Mod Blocks for " + RatTheRat.MOD_ID);
        registerBlock("cheese_block", CHEESE_BLOCK);
    }
}
