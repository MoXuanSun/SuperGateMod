package xyz.satdg.magic.supergate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.satdg.magic.supergate.api.IProxy;

/**
 * @author GongSunink
 * @date 2021/8/24
 */
@Mod(name = SuperGateMod.MOD_NAME,modid = SuperGateMod.MOD_ID, version = SuperGateMod.VERSION)
public class SuperGateMod {

    public static final String MOD_NAME = "Ori's SuperGates";
    //可以和mcmod.info的modName不一致
    public static final String MOD_ID = "supergate";
    //must be all lowercase
    public static final String VERSION = "1.0";

    public static final String CLIENT_SIDE = "xyz.satdg.magic.supergate.client.ClientProxy";
    public static final String SERVER_SIDE = "xyz.satdg.magic.supergate.common.CommonProxy";

    //proxy
    @SidedProxy(clientSide = CLIENT_SIDE,
            serverSide = SERVER_SIDE,modId = MOD_ID)
    public static IProxy proxy;


    @Mod.EventHandler
    public void onModPreInit(FMLPreInitializationEvent event){
        proxy.onModPreInit(event);
    }

    @Mod.EventHandler
    public void onModInit(FMLInitializationEvent event){
        proxy.onModInit(event);
    }

    @Mod.EventHandler
    public void onModPostInit(FMLPostInitializationEvent event){
        proxy.onModPostInit(event);
    }

}
