package net.jumpingjaguar.tieredarmor.blocks;

public class BlockBaramiteOre extends BlockTiAr
{
	public BlockBaramiteOre()
	{
		super("baramiteOre");
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setResistance(7.0F);
	}
}
