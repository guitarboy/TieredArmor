package net.jumpingjaguar.tieredarmor.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.jumpingjaguar.tieredarmor.handler.ConfigurationHandler;
import net.jumpingjaguar.tieredarmor.item.*;
import net.minecraft.item.Item;

public class ModItems
{
    public static final ItemTiAr gappasFeather = new ItemGappasFeather();
    public static final ItemTiAr gabarasTooth = new ItemGabarasTooth();
    public static final ItemTiAr blackLeather = new ItemBlackLeather();
    public static final ItemTiAr gappaArrow = new ItemGappaArrow();

    public static final ItemTiAr baramiteIngot = new ItemBaramiteIngot();
    public static final ItemTiAr flametiteIngot = new ItemFlametiteIngot();
    public static final ItemTiAr einsteiniumIngot = new ItemEisteiniumIngot();
    public static final ItemTiAr molybdeniteIngot = new ItemMolybdeniteIngot();

    public static final Item baramiteSword = new ItemBaramiteSword();
    public static final Item baramitePickaxe = new ItemBaramitePickaxe();
    public static final Item baramiteShovel = new ItemBaramiteShovel();
    public static final Item baramiteAxe = new ItemBaramiteAxe();
    public static final Item baramiteHoe = new ItemBaramiteHoe();

    public static final ItemTiAr baramiteCore = new ItemBaramiteCore();
    public static final ItemTiAr flametiteCore = new ItemFlametiteCore();
    public static final ItemTiAr techCore = new ItemTechCore();
    public static final ItemTiAr divingCore = new ItemDivingCore();

    public static final ItemTiAr baramiteChestT1 = new ItemBaramiteChestT1();
    public static final ItemTiAr baramiteChestT2 = new ItemBaramiteChestT2();

    public static void init()
    {
        // Registering items
        GameRegistry.registerItem(gappasFeather, "gappasFeather");
        GameRegistry.registerItem(blackLeather, "blackLeather");
        GameRegistry.registerItem(gabarasTooth, "gabarasTooth");
        GameRegistry.registerItem(gappaArrow, "gappaArrow");

        // Registering ingots
        GameRegistry.registerItem(baramiteIngot, "baramiteIngot");
        GameRegistry.registerItem(flametiteIngot, "flametiteIngot");
        GameRegistry.registerItem(einsteiniumIngot, "einsteiniumIngot");
        GameRegistry.registerItem(molybdeniteIngot, "molybdeniteIngot");

        // Register tools
        GameRegistry.registerItem(baramiteSword, "baramiteSword");
        GameRegistry.registerItem(baramitePickaxe, "baramitePickaxe");
        GameRegistry.registerItem(baramiteShovel, "baramiteShovel");
        GameRegistry.registerItem(baramiteAxe, "baramiteAxe");
        GameRegistry.registerItem(baramiteHoe, "baramiteHoe");

        // Registering cores to the armor
        GameRegistry.registerItem(baramiteCore, "baramiteCore");
        GameRegistry.registerItem(flametiteCore, "flametiteCore");

        // Registering armor
        GameRegistry.registerItem(baramiteChestT1, "baramiteChestT1");
        GameRegistry.registerItem(baramiteChestT2, "baramiteChestT2");

        // Techarmor related items
        if(ConfigurationHandler.enableTechArmor)
        {
            GameRegistry.registerItem(techCore, "techCore");
        }

        // Diving armor related items
        if(ConfigurationHandler.enableDivingArmor)
        {
            GameRegistry.registerItem(divingCore, "divingCore");
        }
    }

}
