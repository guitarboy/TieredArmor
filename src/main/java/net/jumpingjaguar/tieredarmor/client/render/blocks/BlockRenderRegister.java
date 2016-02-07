package net.jumpingjaguar.tieredarmor.client.render.blocks;

import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

	public static void registerBlockRenderer()
	{
		reg(ModBlocks.baramiteOre);
		/*reg(ModBlocks.einsteiniumOre);
		reg(ModBlocks.flametiteOre);
		reg(ModBlocks.molybdeniteOre);
		*/
	}

	public static void reg(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
				.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(".") + 1), "inventory"));
	}
}
