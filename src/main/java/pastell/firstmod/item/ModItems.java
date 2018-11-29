package pastell.firstmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class ModItems {

    public static ItemBase ingotEperine = new ItemBase("ingot_eperine").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemHaySeed haySeed = new ItemHaySeed();
    public static ItemBase hay = new ItemBase("hay").setCreativeTab(CreativeTabs.FOOD);

    public static void register(IForgeRegistry<Item> registry) {
            registry.registerAll(
                    ingotEperine,
                    haySeed,
                    hay
            );
    }

    public static void registerModels() {
            ingotEperine.registerItemModel();
            hay.registerItemModel();
            haySeed.registerItemModel();
    }

}
