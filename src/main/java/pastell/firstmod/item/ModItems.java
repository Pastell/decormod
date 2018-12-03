package pastell.firstmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class ModItems {

    public static ItemOre ingotEperine = new ItemOre("ingot_eperine", "ingotEperine");
    public static ItemHaySeed haySeed = new ItemHaySeed();
    public static ItemOre hay = new ItemOre("hay", "cropHay");
    public static ItemOre fibersEperine = new ItemOre("fibers_eperine","fiberEperine");
    public static ItemOre brickEperine = new ItemOre("brick_eperine","brickEperine");

    public static void register(IForgeRegistry<Item> registry) {
            registry.registerAll(
                    ingotEperine,
                    haySeed,
                    hay,
                    fibersEperine,
                    brickEperine
            );
    }

    public static void registerModels() {
            ingotEperine.registerItemModel();
            hay.registerItemModel();
            haySeed.registerItemModel();
            fibersEperine.registerItemModel();
            brickEperine.registerItemModel();
    }

}
