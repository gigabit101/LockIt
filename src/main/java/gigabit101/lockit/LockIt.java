package gigabit101.lockit;

import gigabit101.lockit.init.ModItems;
import gigabit101.lockit.init.ModRecipes;
import gigabit101.lockit.init.ModelHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
@Mod(modid = LockIt.MOD_ID, name = LockIt.MOD_NAME, version = LockIt.MOD_VERSION, dependencies = "required-after:reborncore")
public class LockIt
{
    public static final String MOD_ID = "lockit";
    public static final String MOD_NAME = "LockIt";
    public static final String MOD_VERSION = "1.0.0";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModRecipes.init();
        //This is lazy
        if(event.getSide() == Side.CLIENT)
        {
            ModelHandler.init();
        }
        MinecraftForge.EVENT_BUS.register(new LockHandler());
    }
}
