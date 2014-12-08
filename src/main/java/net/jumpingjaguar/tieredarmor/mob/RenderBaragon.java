package net.jumpingjaguar.tieredarmor.mob;

import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBaragon extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + "textures/entity/Baragon.png");

    public RenderBaragon(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getEntityTexture(EntityBaragon entity) {
        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityBaragon) entity);
    }
}
