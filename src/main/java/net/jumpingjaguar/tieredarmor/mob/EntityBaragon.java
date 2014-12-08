package net.jumpingjaguar.tieredarmor.mob;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBaragon extends EntityMob{

    public EntityBaragon(World par1World) {
        super(par1World);
        this.setSize(7.0F, 5.0F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.7D));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(5, new EntityAITempt(this, 1.0D, Items.wheat_seeds, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0F);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    }

    protected Item getDropItem() {
        return ModItems.baragonsHorn;
    }

    protected String getLivingSound() {
        return Reference.MOD_ID + ":mob.baragon.say";
    }

    protected String getHurtSound() {
        return Reference.MOD_ID + ":baragon_hurt";
    }

    protected String getDeathSound() {
        return Reference.MOD_ID + ":mob.baragon.death";
    }

}
