package net.jumpingjaguar.tieredarmor.blocks;

public class BlockmolybdeniteOre extends BlockTiAr
{
	public BlockmolybdeniteOre()
	{
		super("molybdeniteOre");
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(4.0F);
		this.setResistance(7.0F);
	}
}
