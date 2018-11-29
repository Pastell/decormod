package pastell.firstmod.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import pastell.firstmod.item.ModItems;

public class BlockCropHay extends BlockCrops{

    public BlockCropHay() {
        setUnlocalizedName("crop_hay");
        setRegistryName("crop_hay");
    }

    @Override
    protected Item getSeed() {
        return ModItems.haySeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.hay;
    }
}
