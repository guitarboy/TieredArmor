package net.jumpingjaguar.tieredarmor.mob;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityGabara extends EntityMob{

    public EntityGabara(World par1World) {
        super(par1World);
        this.setSize(3.0F, 5.0F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.7D));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(5, new EntityAITempt(this, 1.0D, Items.wheat_seeds, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    protected Item getDropItem() {
        return ModItems.gabarasTooth;
    }

    public boolean isAIEnabled() {
        return true;
    }

    /*protected String getLivingSound() {
        return Reference.MOD_ID + ":mob.gabara.say";
    }

    protected String getHurtSound() {
        return Reference.MOD_ID + ":mob.gabara.hurt";
    }

    protected String getDeathSound() {
        return Reference.MOD_ID + ":mob.gabara.death";
    }*/

}
