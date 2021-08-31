package xyz.satdg.magic.supergate.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import xyz.satdg.magic.supergate.SuperGateMod;
import xyz.satdg.magic.supergate.common.block.supergate.SuperGateCoreBlock;
import xyz.satdg.magic.supergate.common.block.supergate.SuperGateRingBlock;
import xyz.satdg.magic.supergate.common.tileentitys.SuperGateTileEntity;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
@Mod.EventBusSubscriber(modid = SuperGateMod.MOD_ID)
public class OriBlocks {

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(BLOCKS.SUPER_GATE_CORE_BLOCK);
        registry.register(BLOCKS.SUPER_GATE_RING_BLOCK);

        GameRegistry.registerTileEntity(SuperGateTileEntity.class,BLOCKS.SUPER_GATE_CORE_BLOCK.getRegistryName());
    }

    @SubscribeEvent
    public static void onRegisterItemBlocks(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new ItemBlock(BLOCKS.SUPER_GATE_CORE_BLOCK)
                .setRegistryName(BLOCKS.SUPER_GATE_CORE_BLOCK.getRegistryName()));
        registry.register(new ItemBlock(BLOCKS.SUPER_GATE_RING_BLOCK)
                .setRegistryName(BLOCKS.SUPER_GATE_RING_BLOCK.getRegistryName()));

    }

    public final static class BLOCKS{

        public final static SuperGateCoreBlock SUPER_GATE_CORE_BLOCK = new SuperGateCoreBlock();

        public final static SuperGateRingBlock SUPER_GATE_RING_BLOCK = new SuperGateRingBlock();
    }
}
