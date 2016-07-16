package net.jumpingjaguar.tieredarmor.init;

import net.jumpingjaguar.tieredarmor.blocks.*;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static Block baramiteOre;
    public static Block einsteiniumOre;
    public static Block flametiteOre;
    public static Block molybdeniteOre;
    public static Block coreEnhancingTable;

    public static void preInit()
    {
        // Registering blocks
        GameRegistry.registerBlock(baramiteOre = new BlockBaramiteOre(), "baramiteOre");
        GameRegistry.registerBlock(flametiteOre = new BlockFlametiteOre(), "flametiteOre");
        GameRegistry.registerBlock(einsteiniumOre = new BlockEinsteiniumOre(), "einsteiniumOre");
        GameRegistry.registerBlock(molybdeniteOre = new BlockmolybdeniteOre(), "molybdeniteOre");
	    GameRegistry.registerBlock(coreEnhancingTable = new BlockCoreEnhancingTable(), "coreEnhancingTable");

    }
}
