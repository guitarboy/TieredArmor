package net.jumpingjaguar.tieredarmor.init;

import net.jumpingjaguar.tieredarmor.blocks.*;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTiAr baramiteOre = new BlockBaramiteOre();
   /* public static final BlockTiAr einsteiniumOre = new BlockEinsteiniumOre();
    public static final BlockTiAr flametiteOre = new BlockFlametiteOre();
    public static final BlockTiAr molybdeniteOre = new BlockMolybdeniteOre();
    */
    public static void init()
    {
        // Registering blocks
        GameRegistry.registerBlock(baramiteOre, "baramiteOre");
        /*GameRegistry.registerBlock(flametiteOre, "flametiteOre");
        GameRegistry.registerBlock(einsteiniumOre, "einsteiniumOre");
        GameRegistry.registerBlock(molybdeniteOre, "molybdeniteOre");
        */
    }
}
