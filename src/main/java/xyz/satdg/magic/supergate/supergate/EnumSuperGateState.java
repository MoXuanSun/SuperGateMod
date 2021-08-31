package xyz.satdg.magic.supergate.supergate;

/**
 * @author GongSunink
 * @date 2021/8/28
 */
public enum EnumSuperGateState {
    ENGAGING(0),
    STRUCTURE_NOT_COMPLETE(-1);

    private final int state;

    EnumSuperGateState(int state) {
        this.state = state;
    }
}
