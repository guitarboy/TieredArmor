package net.jumpingjaguar.tieredarmor.mob;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityGabara extends EntityMob{

    public EntityGabara(World par1World) {
        super(par1World);
        this.setSize(3.0F, 5.0F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.7D));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    protected Item getDropItem() {
        return ModItems.gabarasTooth;
    }

    public boolean isAIEnabled() {
        return true;
    }

}
