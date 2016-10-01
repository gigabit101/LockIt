package gigabit101.lockit.items;

import gigabit101.lockit.LockIt;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ItemLockIt extends Item
{
    public ItemLockIt(String name)
    {
        setUnlocalizedName(LockIt.MOD_ID + "." + name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.MISC);
    }
}
