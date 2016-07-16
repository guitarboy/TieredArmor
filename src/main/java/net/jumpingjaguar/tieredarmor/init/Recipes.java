package net.jumpingjaguar.tieredarmor.init;

import net.jumpingjaguar.tieredarmor.handler.ConfigurationHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        // Adds smelting recipes
        GameRegistry.addSmelting(ModBlocks.baramiteOre, new ItemStack(ModItems.baramiteIngot), 0.8f);
        GameRegistry.addSmelting(ModBlocks.einsteiniumOre, new ItemStack(ModItems.einsteiniumIngot), 1.0f);
        GameRegistry.addSmelting(ModBlocks.flametiteOre, new ItemStack(ModItems.flametiteIngot), 1.0f);

        // Adds shaped recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.baramiteCore), " x ", "xzx", " x ", 'x', ModItems.baramiteIngot, 'z', Items.bread);
        GameRegistry.addRecipe(new ItemStack(ModItems.flametiteCore), " x ", "xzx", " x ", 'x', ModItems.flametiteIngot, 'z', Items.blaze_rod);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.baramiteSword), "x", "x", "z", 'x', ModItems.baramiteIngot, 'z', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.baramitePickaxe), "xxx", " z ", " z ", 'x', ModItems.baramiteIngot, 'z', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.baramiteShovel), "x", "z", "z", 'x', ModItems.baramiteIngot, 'z', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gappaArrow), "x", "s", "z", 'x', ModItems.gabarasTooth, 's', "stickWood", 'z', ModItems.gappasFeather));
        GameRegistry.addRecipe(new ItemStack(ModItems.baramiteChestT1), "x x", "xcx", "xxx", 'x', ModItems.baramiteIngot, 'c', ModItems.baramiteCore);
        GameRegistry.addRecipe(new ItemStack(ModItems.baramiteChestT2), "x x", "xcx", "xxx", 'x', ModItems.baramiteIngot, 'c', ModItems.baramiteChestT1);

        // Adds shapeless recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.blackLeather), new ItemStack(Items.leather), "dyeBlack"));

        // Mobdrop recipes
        if(ConfigurationHandler.enableDropRecipes)
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.gappasFeather), new ItemStack(Items.feather), "dyeBlue"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.baragonsHorn), new ItemStack(ModItems.gabarasTooth), "dyeYellow"));
        }

        // Techarmor recipes
        if(ConfigurationHandler.enableTechArmor)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.techCore), " x ", "xzx", " x ", 'x', ModItems.einsteiniumIngot, 'z', Items.redstone);
            GameRegistry.addRecipe(new ItemStack(ModItems.einsteiniumHelmT1), "xzx", "x x", 'x', ModItems.einsteiniumIngot, 'z', ModItems.techCore);
            GameRegistry.addRecipe(new ItemStack(ModItems.einsteiniumChestT1), "x x", "xzx", "xxx", 'x', ModItems.einsteiniumIngot, 'z', ModItems.techCore);
            GameRegistry.addRecipe(new ItemStack(ModItems.einsteiniumLegsT1), "xzx", "x x", "x x", 'x', ModItems.einsteiniumIngot, 'z', ModItems.techCore);
            GameRegistry.addRecipe(new ItemStack(ModItems.einsteiniumBootsT1), "x x", "xzx", 'x', ModItems.einsteiniumIngot, 'z', ModItems.techCore);
        }

        // Diving armor recipes
        if(ConfigurationHandler.enableDivingArmor)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.divingCore), " x ", "xzx", " x ", 'x', ModItems.molybdeniteIngot, 'z', Items.fish);
        }
    }
}