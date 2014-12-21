package net.jumpingjaguar.tieredarmor.creativeTab;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTiArTools
{
    public static final CreativeTabs TiAr_TOOLSTAB = new CreativeTabs(Reference.MOD_ID + "Tools")
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.baramiteSword;
        }
    };
}
