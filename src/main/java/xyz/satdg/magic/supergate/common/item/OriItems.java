package xyz.satdg.magic.supergate.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import xyz.satdg.magic.supergate.SuperGateMod;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
@Mod.EventBusSubscriber(modid = SuperGateMod.MOD_ID)
public class OriItems {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(ITEMS.SUPER_GATE_CONTROLLER);
    }


    public static class ITEMS{
        public final static SuperGateController SUPER_GATE_CONTROLLER = new SuperGateController();
    }
}
