package net.jumpingjaguar.tieredarmor.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.jumpingjaguar.tieredarmor.creativeTab.CreativeTabTiAr;
import net.jumpingjaguar.tieredarmor.init.ModItems;
import net.jumpingjaguar.tieredarmor.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorTiAr extends ItemArmor {

    protected String texturePath = Reference.MOD_ID + ":textures/models/armor/";

    public ArmorTiAr(ArmorMaterial material, int id, int armorSlot) {
        super(material, id, armorSlot);
        setCreativeTab(CreativeTabTiAr.TiAr_TAB);

        this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModItems.baramiteLegsT1 || stack.getItem() == ModItems.baramiteHelmT1 || stack.getItem() == ModItems.baramiteBootsT1) {
            return texturePath + "baramiteT1_layer_1.png";
        }
        else if (stack.getItem() == ModItems.baramiteLegsT1) {
            return texturePath + "baramiteT1_layer_2.png";
        }
        else if (stack.getItem() == ModItems.einsteiniumHelmT1 || stack.getItem() == ModItems.einsteiniumChestT1 || stack.getItem() == ModItems.einsteiniumBootsT1) {
            return texturePath + "einsteiniumT1_layer_1";
        }
        else if (stack.getItem() == ModItems.einsteiniumLegsT1) {
            return texturePath + "einsteiniumT1_layer_2";
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

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
