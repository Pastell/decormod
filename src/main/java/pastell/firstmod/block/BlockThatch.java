package pastell.firstmod.block;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import pastell.firstmod.FirstMod;

public class BlockThatch extends BlockRotatedPillar {

    protected String name;

    public BlockThatch() {

        super(Material.GRASS, MapColor.YELLOW);

        this.name = "block_thatch";

        this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
        setCreativeTab(FirstMod.creativeTab);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    /**
     * Block's chance to react to a living entity falling on it.
     */
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 0.2F);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    public void registerItemModel(Item itemBlock) {
        FirstMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }
}