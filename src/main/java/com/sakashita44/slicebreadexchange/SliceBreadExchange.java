package sakashita44.slicebreadexchange;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(SliceBreadExchange.MOD_ID)
public class SliceBreadExchange {

    public static final String MOD_ID = "slicebreadexchange";

    public SliceBreadExchange() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register setup methods for the mod
        bus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        // Register recipes here if needed
        // (if you use any custom serializer)
    }
}