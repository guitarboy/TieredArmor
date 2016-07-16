package net.jumpingjaguar.tieredarmor.materials;

import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Material {

    //Tool Materials
    public static ToolMaterial BaramiteMaterial = EnumHelper.addToolMaterial("BaramiteMaterial", 2, 3000, 6.0F, 2.5F, 13);
    public static ToolMaterial EinsteiniumMaterial = EnumHelper.addToolMaterial("EinsteiniumMaterial", 4, 2000, 12.0F, 6.0F, 9);
    public static ToolMaterial FlametiteMaterial = EnumHelper.addToolMaterial("FlametiteMaterial", 5, 1300, 15.0F, 8.0F, 8);
    public static ToolMaterial MolybdeniteMaterial = EnumHelper.addToolMaterial("MolybdeniteMaterial", 3, 1684, 10.0F, 4.0F, 26);

    //Armor Materials
    public static ItemArmor.ArmorMaterial BaramiteArmorMaterialT1 = EnumHelper.addArmorMaterial("BaramiteT1", Reference.MOD_ID + ":baramiteT1", 1300, new int[] {6, 16, 12, 6}, 10);
    public static ItemArmor.ArmorMaterial BaramiteArmorMaterialT2 = EnumHelper.addArmorMaterial("BaramiteT2", Reference.MOD_ID + ":baramiteT2", 2600, new int[] {8, 19, 16, 8}, 14);
    public static ItemArmor.ArmorMaterial EinsteiniumArmorMaterialT1 = EnumHelper.addArmorMaterial("EinsteiniumT1", Reference.MOD_ID + ":einsteiniumT1", 2500, new int[] {5, 16, 13, 5}, 9);
    public static ItemArmor.ArmorMaterial EinsteiniumArmorMaterialT2 = EnumHelper.addArmorMaterial("EinsteiniumT2", Reference.MOD_ID + ":einsteiniumT2", 3750, new int[] {8, 17, 14, 8}, 12);
    public static ItemArmor.ArmorMaterial FlametiteArmorMaterialT1 = EnumHelper.addArmorMaterial("FlametiteT1", Reference.MOD_ID + ":flametiteT1", 3100, new int[] {9, 18, 14, 9}, 8);
    public static ItemArmor.ArmorMaterial FlametiteArmorMaterialT2 = EnumHelper.addArmorMaterial("FlametiteT2", Reference.MOD_ID + ":flametiteT2", 4500, new int[] {12, 20, 18, 12}, 10);
}
