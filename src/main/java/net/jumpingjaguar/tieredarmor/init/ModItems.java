package net.jumpingjaguar.tieredarmor.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.jumpingjaguar.tieredarmor.handler.ConfigurationHandler;
import net.jumpingjaguar.tieredarmor.item.*;
import net.jumpingjaguar.tieredarmor.materials.Material;
import net.minecraft.item.Item;

public class ModItems
{
    public static int baraHelmetID;
    public static int einHelmetID;
    public static int baraChestplateID;
    public static int einChestplateID;
    public static int baraLeggingsID;
    public static int einLeggingsID;
    public static int baraBootsID;
    public static int einBootsID;

    public static final ItemTiAr gappasFeather = new ItemGappasFeather();
    public static final ItemTiAr gabarasTooth = new ItemGabarasTooth();
    public static final ItemTiAr blackLeather = new ItemBlackLeather();
    public static final ItemTiAr gappaArrow = new ItemGappaArrow();
    public static final ItemTiAr baragonsHorn = new ItemBaragonsHorn();

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

    public static final ArmorTiAr baramiteHelmT1 = new ItemBaramiteHelmT1(Material.TiArArmorMaterial, baraHelmetID, 0);
    public static final ArmorTiAr baramiteChestT1 = new ItemBaramiteChestT1(Material.TiArArmorMaterial, baraChestplateID, 1);
    public static final ArmorTiAr baramiteLegsT1 = new ItemBaramiteLegsT1(Material.TiArArmorMaterial, baraLeggingsID, 2);
    public static final ArmorTiAr baramiteBootsT1 = new ItemBaramiteBootsT1(Material.TiArArmorMaterial, baraBootsID, 3);
    public static final ArmorTiAr einsteiniumHelmT1 = new ItemEinsteiniumHelmT1(Material.TiArArmorMaterial, einHelmetID, 0);
    public static final ArmorTiAr einsteiniumChestT1 = new ItemEinsteiniumChestT1(Material.TiArArmorMaterial, einChestplateID, 1);
    public static final ArmorTiAr einsteiniumLegsT1 = new ItemEinsteiniumLegsT1(Material.TiArArmorMaterial, einLeggingsID, 2);
    public static final ArmorTiAr einsteiniumBootsT1 = new ItemEinsteiniumBootsT1(Material.TiArArmorMaterial, einBootsID, 3);
    public static final ItemTiAr baramiteChestT2 = new ItemBaramiteChestT2();

    public static void init()
    {
        // Registering items
        GameRegistry.registerItem(gappasFeather, "gappasFeather");
        GameRegistry.registerItem(blackLeather, "blackLeather");
        GameRegistry.registerItem(gabarasTooth, "gabarasTooth");
        GameRegistry.registerItem(gappaArrow, "gappaArrow");
        GameRegistry.registerItem(baragonsHorn, "baragonsHorn");

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
        GameRegistry.registerItem(baramiteHelmT1, "baramiteHelmT1");
        GameRegistry.registerItem(baramiteChestT1, "baramiteChestT1");
        GameRegistry.registerItem(baramiteLegsT1, "baramiteLegsT1");
        GameRegistry.registerItem(baramiteBootsT1, "baramiteBootsT1");
        GameRegistry.registerItem(einsteiniumChestT1, "einsteiniumChestT1");
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
