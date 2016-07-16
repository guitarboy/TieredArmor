
package net.jumpingjaguar.tieredarmor.blocks;

public class BlockEinsteiniumOre extends BlockTiAr
{
	public BlockEinsteiniumOre()
	{
		super("einsteiniumOre");
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(9.0F);
		this.setResistance(7.0F);
	}
}
