package xyz.satdg.magic.supergate.common.block.supergate;

import xyz.satdg.magic.supergate.SuperGateMod;
import xyz.satdg.magic.supergate.SuperGateProps;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public class SuperGateRingBlock extends BaseSuperGateBlock{

    public SuperGateRingBlock() {
        super();
        setRegistryName(SuperGateMod.MOD_ID,"super_gate_ring_block");
        setUnlocalizedName("super_gate_ring");
        setCreativeTab(SuperGateProps.DEFAULT_TABLE);
    }
}
