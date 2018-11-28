package pastell.firstmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class ModItems {

    public static ItemBase ingotEperine = new ItemBase("ingot_Eperine").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
            registry.registerAll(
                    ingotEperine
            );
    }

    public static void registerModels() {
            ingotEperine.registerItemModel();
    }

}
