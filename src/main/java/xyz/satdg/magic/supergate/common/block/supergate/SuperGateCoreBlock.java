package xyz.satdg.magic.supergate.common.block.supergate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.satdg.magic.supergate.SuperGateMod;
import xyz.satdg.magic.supergate.SuperGateProps;
import xyz.satdg.magic.supergate.common.tileentitys.SuperGateTileEntity;

import javax.annotation.Nullable;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public class SuperGateCoreBlock extends BaseSuperGateBlock {

    public SuperGateCoreBlock(){
        super();
        setRegistryName(SuperGateMod.MOD_ID,"super_gate_core_block");
        setUnlocalizedName("super_gate_core");
        setCreativeTab(SuperGateProps.DEFAULT_TABLE);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new SuperGateTileEntity();
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        //TODO:OpenGui
    }


}