package net.jumpingjaguar.tieredarmor.creativeTab;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTiArArmor
{
    public static final CreativeTabs TiAr_ARMORTAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.baramiteChestT1;
        }
    };
}

