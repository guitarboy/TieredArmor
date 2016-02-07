package net.jumpingjaguar.tieredarmor.items;


import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiAr;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTiAr extends Item
{
    public ItemTiAr()
    {
        super();
        this.setCreativeTab(CreativeTabTiAr.TiAr_TAB);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
