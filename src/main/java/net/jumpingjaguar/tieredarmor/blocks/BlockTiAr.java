package net.jumpingjaguar.tieredarmor.blocks;

import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiAr;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTiAr extends Block
{
    public BlockTiAr(Material material, String unlocalizedName)
    {
        super(material);
        this.setCreativeTab(CreativeTabTiAr.TiAr_TAB);
        this.setUnlocalizedName(unlocalizedName);
    }

    public BlockTiAr(String unlocalizedName)
    {
        this(Material.rock, unlocalizedName);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
