package net.jumpingjaguar.tieredarmor;

import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.init.Recipes;
import net.jumpingjaguar.tieredarmor.proxy.CommonProxy;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.jumpingjaguar.tieredarmor.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class TieredArmor
{

    @Mod.Instance
    public static TieredArmor instance = new TieredArmor();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);

        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

	    ModBlocks.init();
	    ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
	    proxy.registerRenders();

	    Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
       proxy.postInit(event);

        LogHelper.info("Post Initialization Complete!");
    }
}
