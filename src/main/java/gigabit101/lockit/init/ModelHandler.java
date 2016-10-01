package gigabit101.lockit.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
@SideOnly(Side.CLIENT)
public class ModelHandler
{
    public static void init()
    {
        registerItemModel(ModItems.key, 0);
        registerItemModel(ModItems.lockpick, 0);
        registerItemModel(ModItems.padlock, 0);
        registerItemModel(ModItems.uncutkey, 0);
    }

    static void registerItemModel(Item i, int meta)
    {
        ResourceLocation loc = i.getRegistryName();
        ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "inventory"));
    }

    static void registerItemModel(Block b, int meta)
    {
        registerItemModel(Item.getItemFromBlock(b), meta);
    }

}
