package xyz.satdg.magic.supergate.common.block.supergate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public abstract class BaseSuperGateBlock extends Block {

    public BaseSuperGateBlock(){
        super(Material.IRON);
        setResistance(9999.0f);
    }

}
