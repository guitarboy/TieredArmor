package net.jumpingjaguar.tieredarmor.items;

import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiArArmor;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorTiAr extends ItemArmor {

    protected String texturePath = Reference.MOD_ID + ":textures/models/armor/";

    public ArmorTiAr(ArmorMaterial material, int id, int armorSlot) {
        super(material, id, armorSlot);
        setCreativeTab(CreativeTabTiArArmor.TiAr_ARMORTAB);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModItems.baramiteHelmT1 || stack.getItem() == ModItems.baramiteChestT1 || stack.getItem() == ModItems.baramiteBootsT1) {
            return texturePath + "baramiteT1_layer_1.png";
        }
        else if (stack.getItem() == ModItems.baramiteLegsT1) {
            return texturePath + "baramiteT1_layer_2.png";
        }
        else if (stack.getItem() == ModItems.einsteiniumHelmT1 || stack.getItem() == ModItems.einsteiniumChestT1 || stack.getItem() == ModItems.einsteiniumBootsT1) {
            return texturePath + "einsteiniumT1_layer_1.png";
        }
        else if (stack.getItem() == ModItems.einsteiniumLegsT1) {
            return texturePath + "einsteiniumT1_layer_2.png";
        }
        else {
            return null;
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
