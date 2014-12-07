package net.jumpingjaguar.tieredarmor;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.jumpingjaguar.tieredarmor.handler.ConfigurationHandler;
import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.init.Recipes;
import net.jumpingjaguar.tieredarmor.mob.EntityTiAr;
import net.jumpingjaguar.tieredarmor.proxy.ClientProxy;
import net.jumpingjaguar.tieredarmor.proxy.IProxy;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.jumpingjaguar.tieredarmor.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TieredArmor
{

    @Mod.Instance(Reference.MOD_ID)
    public static TieredArmor instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ClientProxy.registerRendering();

        ModItems.init();
        ModBlocks.init();
        EntityTiAr.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
