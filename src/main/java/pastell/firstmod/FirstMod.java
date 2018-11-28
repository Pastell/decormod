package pastell.firstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraft.item.Item;
import pastell.firstmod.item.ItemBase;
import pastell.firstmod.item.ModItems;
import pastell.firstmod.proxy.CommonProxy;
import pastell.firstmod.proxy.ClientProxy;

@Mod(modid = FirstMod.modId, name = FirstMod.name, version = FirstMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class FirstMod {
    public static final String modId = "firstmod";
    public static final String name = "First Mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static FirstMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @SidedProxy(serverSide = "pastell.firstmod.proxy.CommonProxy", clientSide = "pastell.firstmod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
                ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
                ModItems.registerModels();
        }
    }
}


