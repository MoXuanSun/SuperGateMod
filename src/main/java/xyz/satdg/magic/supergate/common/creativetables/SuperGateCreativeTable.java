package xyz.satdg.magic.supergate.common.creativetables;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xyz.satdg.magic.supergate.common.block.OriBlocks;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public class SuperGateCreativeTable extends CreativeTabs {



    public SuperGateCreativeTable(String label) {
        super(label);
    }


    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(OriBlocks.BLOCKS.SUPER_GATE_CORE_BLOCK);
    }
}
