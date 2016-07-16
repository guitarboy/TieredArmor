package net.jumpingjaguar.tieredarmor.proxy;

import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.init.Recipes;
import net.jumpingjaguar.tieredarmor.worldGen.WorldGenTiAr;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		ModItems.init();
		ModBlocks.preInit();
	}

	public void init(FMLInitializationEvent e)
	{
		Recipes.init();
		GameRegistry.registerWorldGenerator(new WorldGenTiAr(), 0);
	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}

	public void registerRenders() {

	}
}
