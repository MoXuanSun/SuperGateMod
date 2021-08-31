package xyz.satdg.magic.supergate.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import xyz.satdg.magic.supergate.common.entity.EntityFlyingBlock;

import javax.annotation.Nullable;

/**
 * @author GongSunink
 * @date 2021/8/29
 */
public class TestBlockEntityRender extends Render<EntityFlyingBlock> {


    protected TestBlockEntityRender(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    public void doRender(EntityFlyingBlock entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        GlStateManager.pushMatrix();

    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityFlyingBlock entity) {
        return null;
    }
}
