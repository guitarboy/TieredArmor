package net.jumpingjaguar.tieredarmor.mob;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.jumpingjaguar.tieredarmor.TieredArmor;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityTiAr {

    public static void init() {
        RegisterEntity();
    }

    public static void  RegisterEntity() {

        CreateEntity(EntityBaragon.class, "Baragon", 0x461C02, 0xE5A72B);
    }

    public static void CreateEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, TieredArmor.instance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.monster, BiomeGenBase.forest);

        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
