package gigabit101.lockit.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.key),
                "GGG",
                "I  ",
                "   ",
                'G', new ItemStack(Items.GOLD_NUGGET),
                'I', new ItemStack(Items.IRON_INGOT));

        GameRegistry.addRecipe(new ItemStack(ModItems.padlock),
                "GGG",
                "G G",
                "GRG",
                'G', new ItemStack(Items.GOLD_NUGGET),
                'I', new ItemStack(Items.REDSTONE));
    }
}
