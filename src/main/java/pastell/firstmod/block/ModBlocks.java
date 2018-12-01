package pastell.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreEperine = new BlockOre("ore_eperine");
    public static BlockCropHay cropHay = new BlockCropHay();
    public static BlockThatch blockThatch = new BlockThatch();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreEperine,
                cropHay,
                blockThatch
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreEperine.createItemBlock(),
                blockThatch.createItemBlock()
        );

    }

    public static void registerModels() {

        oreEperine.registerItemModel(Item.getItemFromBlock(oreEperine));
        blockThatch.registerItemModel(Item.getItemFromBlock(blockThatch));
    }
}
