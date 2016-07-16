package net.jumpingjaguar.tieredarmor.init;

import net.jumpingjaguar.tieredarmor.items.*;
import net.jumpingjaguar.tieredarmor.materials.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

    // Armor ID initialization
    public static int baraHelmetT1ID;
    public static int einHelmetT1ID;
    public static int baraChestplateT1ID;
    public static int einChestplateT1ID;
    public static int baraLeggingsT1ID;
    public static int einLeggingsT1ID;
    public static int baraBootsT1ID;
    public static int einBootsT1ID;
	public static int baraHelmetT2ID;
	public static int baraChestplateT2ID;
	public static int baraLeggingsT2ID;
	public static int baraBootsT2ID;

    // Material initialization
    public static ItemTiAr gappasFeather;
    public static ItemTiAr gabarasTooth;
    public static ItemTiAr blackLeather;
    public static ItemTiAr gappaArrow;
    public static ItemTiAr baragonsHorn;

    // Ingot initialization
    public static ItemTiAr baramiteIngot;
    public static ItemTiAr flametiteIngot;
    public static ItemTiAr einsteiniumIngot;
    public static ItemTiAr molybdeniteIngot;

    // Weapon initialization
    public static Item baramiteSword;

    // Tools initialization
    public static Item baramitePickaxe;
    public static Item baramiteShovel;
    public static Item baramiteAxe;
    public static Item baramiteHoe;

    // Cores initialization
    public static ItemTiAr baramiteCore;
    public static ItemTiAr flametiteCore;
    public static ItemTiAr techCore;
    public static ItemTiAr divingCore;

	// Armor frame initialization
	public static ItemTiAr baramiteHelmFrame;
	public static ItemTiAr baramiteChestFrame;
	public static ItemTiAr baramiteLegsFrame;
	public static ItemTiAr baramiteBootsFrame;

    // T1 armor initialization
    public static ArmorTiAr baramiteHelmT1;
    public static ArmorTiAr baramiteChestT1;
    public static ArmorTiAr baramiteLegsT1;
    public static ArmorTiAr baramiteBootsT1;
    public static ArmorTiAr einsteiniumHelmT1;
    public static ArmorTiAr einsteiniumChestT1;
    public static ArmorTiAr einsteiniumLegsT1;
    public static ArmorTiAr einsteiniumBootsT1;
	public static ArmorTiAr flamtetiteHelmT1;
	public static ArmorTiAr flametiteChestT1;
	public static ArmorTiAr flametiteLegsT1;
	public static ArmorTiAr flametiteBootsT1;


    // T2 armor initialization
	public static ArmorTiAr baramiteHelmT2;
    public static ArmorTiAr baramiteChestT2;
	public static ArmorTiAr baramiteLegsT2;
	public static ArmorTiAr baramiteBootsT2;
	public static ArmorTiAr einsteiniumHelmT2;
	public static ArmorTiAr einsteiniumChestT2;
	public static ArmorTiAr einsteiniumLegsT2;
	public static ArmorTiAr einsteiniumBootsT2;
	public static ArmorTiAr flametiteHelmT2;
	public static ArmorTiAr flametiteChestT2;
	public static ArmorTiAr flametiteLegsT2;
	public static ArmorTiAr flametiteBootsT2;

	// T3 armor initialization
	public static ArmorTiAr baramiteHelmT3;
	public static ArmorTiAr baramiteChestT3;
	public static ArmorTiAr baramiteLegsT3;
	public static ArmorTiAr baramiteBootsT3;
	public static ArmorTiAr einsteiniumHelmT3;
	public static ArmorTiAr einsteiniumChestT3;
	public static ArmorTiAr einsteiniumLegsT3;
	public static ArmorTiAr einsteiniumBootsT3;

	// T4 armor initialization

	// T5 armor initialization

    public static void init()
    {
        // Registering items
        GameRegistry.registerItem(gappasFeather = new ItemGappasFeather(), "gappasFeather");
        GameRegistry.registerItem(blackLeather = new ItemBlackLeather(), "blackLeather");
        GameRegistry.registerItem(gabarasTooth = new ItemGabarasTooth(), "gabarasTooth");
        GameRegistry.registerItem(gappaArrow = new ItemGappaArrow(), "gappaArrow");
        GameRegistry.registerItem(baragonsHorn = new ItemBaragonsHorn(), "baragonsHorn");


        // Registering ingots
        GameRegistry.registerItem(baramiteIngot = new ItemBaramiteIngot(), "baramiteIngot");
        GameRegistry.registerItem(flametiteIngot = new ItemFlametiteIngot(), "flametiteIngot");
        GameRegistry.registerItem(einsteiniumIngot = new ItemEisteiniumIngot(), "einsteiniumIngot");
        GameRegistry.registerItem(molybdeniteIngot = new ItemMolybdeniteIngot(), "molybdeniteIngot");

	    // Registering weapons
	    GameRegistry.registerItem(baramiteSword = new ItemBaramiteSword(Material.BaramiteMaterial), "baramiteSword");

        // Register tools
        GameRegistry.registerItem(baramitePickaxe = new ItemBaramitePickaxe(Material.BaramiteMaterial), "baramitePickaxe");
        GameRegistry.registerItem(baramiteShovel = new ItemBaramiteShovel(Material.BaramiteMaterial), "baramiteShovel");
        GameRegistry.registerItem(baramiteAxe = new ItemBaramiteAxe(Material.BaramiteMaterial), "baramiteAxe");
        GameRegistry.registerItem(baramiteHoe = new ItemBaramiteHoe(Material.BaramiteMaterial), "baramiteHoe");

        // Registering cores to the armor
        GameRegistry.registerItem(baramiteCore = new ItemBaramiteCore(), "baramiteCore");
        GameRegistry.registerItem(flametiteCore = new ItemFlametiteCore(), "flametiteCore");

	    //Registering armor frames
	    GameRegistry.registerItem(baramiteHelmFrame = new ItemBaramiteHelmFrame(), "baramiteHelmFrame");
	    GameRegistry.registerItem(baramiteChestFrame = new ItemBaramiteChestFrame(), "baramiteChestFrame");
	    GameRegistry.registerItem(baramiteLegsFrame = new ItemBaramiteLegsFrame(), "baramiteLegsFrame");
	    GameRegistry.registerItem(baramiteBootsFrame = new ItemBaramiteBootsFrame(), "baramiteBootsFrame");

        // Registering armor
        GameRegistry.registerItem(baramiteHelmT1 = new ItemBaramiteHelmT1(Material.BaramiteArmorMaterialT1, baraHelmetT1ID, 0), "baramiteHelmT1");
        GameRegistry.registerItem(baramiteChestT1 = new ItemBaramiteChestT1(Material.BaramiteArmorMaterialT1, baraChestplateT1ID, 1), "baramiteChestT1");
        GameRegistry.registerItem(baramiteLegsT1 = new ItemBaramiteLegsT1(Material.BaramiteArmorMaterialT1, baraLeggingsT1ID, 2), "baramiteLegsT1");
        GameRegistry.registerItem(baramiteBootsT1 = new ItemBaramiteBootsT1(Material.BaramiteArmorMaterialT1, baraBootsT1ID, 3), "baramiteBootsT1");
	    GameRegistry.registerItem(baramiteHelmT2 = new ItemBaramiteHelmT2(Material.BaramiteArmorMaterialT2, baraHelmetT2ID, 0), "baramiteHelmT2");
        GameRegistry.registerItem(baramiteChestT2 = new ItemBaramiteChestT2(Material.BaramiteArmorMaterialT2, baraChestplateT2ID, 1), "baramiteChestT2");
	    GameRegistry.registerItem(baramiteLegsT2 = new ItemBaramiteLegsT2(Material.BaramiteArmorMaterialT2, baraLeggingsT2ID, 2), "baramiteLegsT2");
	    GameRegistry.registerItem(baramiteBootsT2 = new ItemBaramiteBootsT2(Material.BaramiteArmorMaterialT2, baraBootsT2ID, 3), "baramiteBootsT2");

        // Techarmor related items
        GameRegistry.registerItem(techCore = new ItemTechCore(), "techCore");
        GameRegistry.registerItem(einsteiniumHelmT1 = new ItemEinsteiniumHelmT1(Material.EinsteiniumArmorMaterialT1, einHelmetT1ID, 0), "einsteiniumHelmT1");
        GameRegistry.registerItem(einsteiniumChestT1 = new ItemEinsteiniumChestT1(Material.EinsteiniumArmorMaterialT1, einChestplateT1ID, 1), "einsteiniumChestT1");
        GameRegistry.registerItem(einsteiniumLegsT1 = new ItemEinsteiniumLegsT1(Material.EinsteiniumArmorMaterialT1, einLeggingsT1ID, 2), "einsteiniumLegsT1");
        GameRegistry.registerItem(einsteiniumBootsT1 = new ItemEinsteiniumBootsT1(Material.EinsteiniumArmorMaterialT1, einBootsT1ID, 3), "einsteiniumBootsT1");

        // Diving armor related items
        GameRegistry.registerItem(divingCore = new ItemDivingCore(), "divingCore");
    }



}
