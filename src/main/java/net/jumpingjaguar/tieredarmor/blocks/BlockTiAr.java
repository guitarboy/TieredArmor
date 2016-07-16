package net.jumpingjaguar.tieredarmor.blocks;

import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiAr;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTiAr extends Block
{

    public BlockTiAr(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabTiAr.TiAr_TAB);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
    public BlockTiAr(String unlocalizedName)
    {
        this(unlocalizedName , 2.0f, 10.0f);
    }

    public BlockTiAr(String unlocalizedName, float hardness, float resistance)
    {
        this(unlocalizedName, Material.rock, hardness, resistance);
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
