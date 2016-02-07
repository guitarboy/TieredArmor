package net.jumpingjaguar.tieredarmor.items;

import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiArTools;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordTiAr extends ItemSword
{
    public ItemSwordTiAr(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTiArTools.TiAr_TOOLSTAB);
    }

    public ItemSwordTiAr()
    {
        this(ToolMaterial.IRON);
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
