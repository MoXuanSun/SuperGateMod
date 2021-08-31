package xyz.satdg.magic.supergate.common.entity;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;
import scala.tools.nsc.doc.model.Entity$class;
import xyz.satdg.magic.supergate.SuperGateMod;

import java.awt.*;

/**
 * @author GongSunink
 * create at {2021/8/29}
 */
@Mod.EventBusSubscriber(modid = SuperGateMod.MOD_ID)
public class OriEntities {

    @SubscribeEvent
    public static void onEntitiesRegister(RegistryEvent.Register<EntityEntry> event){
        IForgeRegistry<EntityEntry> registry = event.getRegistry();


    }

    private static EntityEntry buildEntity(Class<? extends Entity> entityClass,){
        EntityEntryBuilder<Entity> builder = EntityEntryBuilder.create();

        builder.

    }
}
