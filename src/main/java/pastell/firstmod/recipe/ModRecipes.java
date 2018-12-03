package pastell.firstmod.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pastell.firstmod.block.ModBlocks;
import pastell.firstmod.item.ModItems;

public class ModRecipes {

    public static void init() {

        // Ore Dict
        ModBlocks.oreEperine.initOreDict();
        ModItems.ingotEperine.initOreDict();
        ModItems.hay.initOreDict();

        GameRegistry.addSmelting(ModBlocks.oreEperine, new ItemStack(ModItems.ingotEperine), 0.7f);
    }

}
