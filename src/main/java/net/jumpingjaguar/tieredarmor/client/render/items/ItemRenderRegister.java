package net.jumpingjaguar.tieredarmor.client.render.items;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static void registerItemRenderer()
	{
		reg(ModItems.baramiteIngot);
	}

	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
				.register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf(".") + 1), "inventory"));
	}
}
