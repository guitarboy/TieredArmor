package net.jumpingjaguar.tieredarmor.handler;

import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    // Initialize configuration values
    public static boolean enableDropRecipes = false;
    public static boolean enableTechArmor = false;
    public static boolean enableDivingArmor = false;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        /*
         Register cofig values
         ("nameOfTheValue", category, defaultValue, "descriptionOfTheValue")
        */
        enableDropRecipes = configuration.getBoolean("enableDropRecipes", Configuration.CATEGORY_GENERAL, false, "Enables recipes for mobdrops if true");
        enableTechArmor = configuration.getBoolean("enableTechArmor", Configuration.CATEGORY_GENERAL, false, "Enables Techarmor if true");
        enableDivingArmor = configuration.getBoolean("enableDivingArmor", Configuration.CATEGORY_GENERAL, false, "Enables Diving Armor if true");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
