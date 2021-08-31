package xyz.satdg.magic.supergate.api;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author GongSunink
 * @date 2021/8/24
 */
public interface IProxy {

    void onModPreInit(FMLPreInitializationEvent event);

    void onModInit(FMLInitializationEvent event);

    void onModPostInit(FMLPostInitializationEvent event);
}
