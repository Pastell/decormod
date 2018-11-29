package pastell.firstmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import pastell.firstmod.FirstMod;
import pastell.firstmod.item.ModItems;

public class FirstModTab extends CreativeTabs {

    public FirstModTab() {
        super(FirstMod.modId);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotEperine);
    }
}
