package net.jumpingjaguar.tieredarmor.proxy;

import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.init.Recipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		ModBlocks.init();
		ModItems.init();

	}

	public void init(FMLInitializationEvent e)
	{
		Recipes.init();
	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}

	public void registerRenders() {

	}
}
