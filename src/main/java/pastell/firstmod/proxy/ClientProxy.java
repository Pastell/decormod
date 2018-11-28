package pastell.firstmod.proxy;

import pastell.firstmod.FirstMod;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(FirstMod.modId + ":" + id, "inventory"));
    }
}
