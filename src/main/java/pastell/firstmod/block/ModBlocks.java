package pastell.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreEperine = new BlockOre("ore_eperine", "oreEperine");
    public static BlockCropHay cropHay = new BlockCropHay();
    public static BlockThatch blockThatch = new BlockThatch();
    public static BlockBase blockEperineBrick = new BlockBase(Material.ROCK,"block_eperine_brick");
    public static BlockBase blockEperineBrickCarved = new BlockBase(Material.ROCK,"block_eperine_brick_carved");
    public static BlockBase blockEperineBrickCracked = new BlockBase(Material.ROCK,"block_eperine_brick_cracked");


    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreEperine,
                cropHay,
                blockThatch,
                blockEperineBrick,
                blockEperineBrickCarved,
                blockEperineBrickCracked

        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreEperine.createItemBlock(),
                blockThatch.createItemBlock(),
                blockEperineBrick.createItemBlock(),
                blockEperineBrickCarved.createItemBlock(),
                blockEperineBrickCracked.createItemBlock()
        );

    }

    public static void registerModels() {

        oreEperine.registerItemModel(Item.getItemFromBlock(oreEperine));
        blockThatch.registerItemModel(Item.getItemFromBlock(blockThatch));
        blockEperineBrick.registerItemModel(Item.getItemFromBlock(blockEperineBrick));
        blockEperineBrickCarved.registerItemModel(Item.getItemFromBlock(blockEperineBrickCarved));
        blockEperineBrickCracked.registerItemModel(Item.getItemFromBlock(blockEperineBrickCracked));
    }
}
