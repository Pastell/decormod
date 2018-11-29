package pastell.firstmod.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import pastell.firstmod.FirstMod;
import pastell.firstmod.block.ModBlocks;

public class ItemHaySeed extends ItemSeeds {

    public ItemHaySeed() {
        super(ModBlocks.cropHay, Blocks.FARMLAND);
        setUnlocalizedName("hay_seed");
        setRegistryName("hay_seed");
    }

    public void registerItemModel() {
        FirstMod.proxy.registerItemRenderer(this, 0, "hay_seed");
    }

}
