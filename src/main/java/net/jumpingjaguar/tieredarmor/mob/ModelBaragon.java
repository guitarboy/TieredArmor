package net.jumpingjaguar.tieredarmor.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBaragon extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Left_front_leg;
    ModelRenderer Left_back_leg;
    ModelRenderer Right_front_leg;
    ModelRenderer Right_back_leg;
    ModelRenderer Tale;
    ModelRenderer Neck;
    ModelRenderer Head;
  
  public ModelBaragon()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      Body = new ModelRenderer(this, 0, 174);
      Body.addBox(-13F, -9F, -32F, 26, 18, 64);
      Body.setRotationPoint(0F, -7F, 0F);
      Body.setTextureSize(512, 256);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Left_front_leg = new ModelRenderer(this, 0, 145);
      Left_front_leg.addBox(-2F, -1F, -2F, 4, 23, 4);
      Left_front_leg.setRotationPoint(7F, 2F, -15F);
      Left_front_leg.setTextureSize(512, 256);
      Left_front_leg.mirror = true;
      setRotation(Left_front_leg, 0F, 0F, 0F);
      Left_back_leg = new ModelRenderer(this, 0, 0);
      Left_back_leg.addBox(-2F, -1F, -2F, 4, 23, 4);
      Left_back_leg.setRotationPoint(7F, 2F, 15F);
      Left_back_leg.setTextureSize(512, 256);
      Left_back_leg.mirror = true;
      setRotation(Left_back_leg, 0F, 0F, 0F);
      Right_front_leg = new ModelRenderer(this, 0, 0);
      Right_front_leg.addBox(-2F, -1F, -2F, 4, 23, 4);
      Right_front_leg.setRotationPoint(-7F, 2F, -15F);
      Right_front_leg.setTextureSize(512, 256);
      Right_front_leg.mirror = true;
      setRotation(Right_front_leg, 0F, 0F, 0F);
      Right_back_leg = new ModelRenderer(this, 0, 0);
      Right_back_leg.addBox(-2F, -1F, -2F, 4, 23, 4);
      Right_back_leg.setRotationPoint(-7F, 2F, 15F);
      Right_back_leg.setTextureSize(512, 256);
      Right_back_leg.mirror = true;
      setRotation(Right_back_leg, 0F, 0F, 0F);
      Tale = new ModelRenderer(this, 3, 0);
      Tale.addBox(-2.5F, -2.5F, 0F, 5, 5, 46);
      Tale.setRotationPoint(0F, -8F, 30F);
      Tale.setTextureSize(512, 256);
      Tale.mirror = true;
      setRotation(Tale, -0.4886922F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 0);
      Neck.addBox(-2.5F, -2.5F, -22F, 5, 5, 22);
      Neck.setRotationPoint(0F, -10F, -30F);
      Neck.setTextureSize(512, 256);
      Neck.mirror = true;
      setRotation(Neck, -0.3141593F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-3.5F, -2.5F, -9F, 7, 5, 9);
      Head.setRotationPoint(0F, -16.7F, -48F);
      Head.setTextureSize(512, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Left_front_leg.render(f5);
    Left_back_leg.render(f5);
    Right_front_leg.render(f5);
    Right_back_leg.render(f5);
    Tale.render(f5);
    Neck.render(f5);
    Head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
