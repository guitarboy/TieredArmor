package net.jumpingjaguar.tieredarmor.client.render.items;

import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static void registerItemRenderer()
	{
		reg(ModItems.baramiteIngot);
		reg(ModItems.baragonsHorn);
		reg(ModItems.baramiteAxe);
		reg(ModItems.baramiteCore);
		reg(ModItems.baramiteHelmT1);
		reg(ModItems.baramiteChestT1);
		reg(ModItems.baramiteLegsT1);
		reg(ModItems.baramiteBootsT1);
		reg(ModItems.baramiteHelmT2);
		reg(ModItems.baramiteChestT2);
		reg(ModItems.baramiteLegsT2);
		reg(ModItems.baramiteBootsT2);
		reg(ModItems.baramiteHoe);
		reg(ModItems.baramitePickaxe);
		reg(ModItems.baramiteShovel);
		reg(ModItems.baramiteSword);
		reg(ModItems.blackLeather);
		reg(ModItems.divingCore);
		reg(ModItems.einsteiniumIngot);
		reg(ModItems.techCore);
		reg(ModItems.einsteiniumHelmT1);
		reg(ModItems.einsteiniumChestT1);
		reg(ModItems.einsteiniumLegsT1);
		reg(ModItems.einsteiniumBootsT1);
		reg(ModItems.flametiteCore);
		reg(ModItems.flametiteIngot);
		reg(ModItems.gabarasTooth);
		reg(ModItems.gappaArrow);
		reg(ModItems.gappasFeather);
		reg(ModItems.molybdeniteIngot);
		reg(ModItems.baramiteHelmFrame);
		reg(ModItems.baramiteChestFrame);
		reg(ModItems.baramiteLegsFrame);
		reg(ModItems.baramiteBootsFrame);
	}

	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
				.register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf(".") + 1), "inventory"));
	}
}
