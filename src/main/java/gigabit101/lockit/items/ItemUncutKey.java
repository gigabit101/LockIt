package gigabit101.lockit.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ItemUncutKey extends ItemLockIt
{
    public ItemUncutKey()
    {
        super("uncutkey");
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("Craft with a key to create a copy");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
