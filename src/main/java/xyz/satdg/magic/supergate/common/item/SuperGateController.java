package xyz.satdg.magic.supergate.common.item;

import net.minecraft.item.Item;
import xyz.satdg.magic.supergate.SuperGateMod;
import xyz.satdg.magic.supergate.SuperGateProps;
import xyz.satdg.magic.supergate.common.creativetables.SuperGateCreativeTable;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public class SuperGateController extends Item {

    public SuperGateController(){
        super();
        setRegistryName(SuperGateMod.MOD_ID,"super_gate_controller_item");
        setUnlocalizedName("super_gate_controller");
        setCreativeTab(SuperGateProps.DEFAULT_TABLE);
    }
}
