package xyz.satdg.magic.supergate.common.tileentitys;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import xyz.satdg.magic.supergate.common.block.OriBlocks;

/**
 * @author GongSunink
 * @date 2021/8/25
 */
public class SuperGateTileEntity extends TileEntity implements ITickable {

    private boolean canBuildGate = false;

    private BlockPos currEast;
    private BlockPos currWest;

    private int lastUpdateTick = 0;
    private int currUpdateTick;

    private enum BuildingState{
        STATE_UNDER,
        STATE_UPPER,
        STATE_TOP
    }

    public SuperGateTileEntity(){
        if (super.getPos().getZ() < 128){
            canBuildGate = true;
        }
    }

    /**
     * to left and to right side
     */
    @Override
    public void update() {
        if (lastUpdateTick == 0){
            //first tick
            currEast = super.getPos().east();
            currWest = super.getPos().west();
            lastUpdateTick = 1;
            return;
        }
        if (canBuildGate){
            if (currUpdateTick - lastUpdateTick > 20) {
                super.getWorld().setBlockState(currEast, OriBlocks.BLOCKS.SUPER_GATE_RING_BLOCK.getDefaultState());
                super.getWorld().setBlockState(currWest, OriBlocks.BLOCKS.SUPER_GATE_RING_BLOCK.getDefaultState());

                lastUpdateTick = currUpdateTick;

                //-- 过程边界状态机经典逻辑问题 这个状态应该是一个状态栈的结构 即判断上先判断后面的状态 执行时依次执行
                //避免到达边界时出现deadlock 锁死在边界上
                if(currWest.getX() -1 == currEast.getX() -1){
                    super.getWorld().setBlockState(currWest.east(), OriBlocks.BLOCKS.SUPER_GATE_RING_BLOCK.getDefaultState());
                    canBuildGate = false;
                    return;
                }else if ((Math.abs(currEast.getY() - super.getPos().getY()) == 128)) {
                    UpdatePos(BuildingState.STATE_TOP);
                }else if (Math.abs(currEast.getX() - super.getPos().getX()) == 64){
                    UpdatePos(BuildingState.STATE_UPPER);
                }else if (currWest.getZ() == super.getPos().getZ()){
                    UpdatePos(BuildingState.STATE_UNDER);
                }
            }
            currUpdateTick++;
        }

    }

    private void UpdatePos(BuildingState state){
        switch (state){
            case STATE_UNDER:
                currEast = currEast.east();
                currWest = currWest.west();
                break;
            case STATE_UPPER:
                currEast = currEast.up();
                currWest = currWest.up();
                break;
            case STATE_TOP:
                currWest = currWest.east();
                currEast = currEast.west();
                break;
        }
    }
}
