package net.jumpingjaguar.tieredarmor.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.jumpingjaguar.tieredarmor.mob.EntityBaragon;
import net.jumpingjaguar.tieredarmor.mob.ModelBaragon;
import net.jumpingjaguar.tieredarmor.mob.RenderBaragon;

public class ClientProxy extends CommonProxy
{
    public static void registerRendering() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBaragon.class, new RenderBaragon(new ModelBaragon(), 0));
    }
}
