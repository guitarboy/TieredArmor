package net.jumpingjaguar.tieredarmor.materials;

import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Material {

    //Tool Materials
    public static ToolMaterial TiArMaterial = EnumHelper.addToolMaterial("TiArMaterial", 3, 1300, 10.0F, 8.0F, 10);

    //Armor Materials
    public static ItemArmor.ArmorMaterial TiArArmorMaterial = EnumHelper.addArmorMaterial("BaramiteT1", Reference.MOD_ID + ":baramiteT1", 1300, new int[] {6, 16, 12, 6}, 10);
}
