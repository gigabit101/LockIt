package gigabit101.lockit.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import reborncore.common.util.ItemNBTHelper;

import java.util.List;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ItemKey extends ItemLockIt
{
    public ItemKey()
    {
        super("key");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        if(!ItemNBTHelper.verifyExistance(itemStackIn, "lock"))
        {
            ItemNBTHelper.setString(itemStackIn, "lock", playerIn.getDisplayNameString());
            return ActionResult.newResult(EnumActionResult.PASS, itemStackIn);
        }
        return ActionResult.newResult(EnumActionResult.FAIL, itemStackIn);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        if(ItemNBTHelper.verifyExistance(stack, "lock"))
        {
            tooltip.add("Bound To " + ItemNBTHelper.getString(stack, "lock", ""));
        }
        else
        {
            tooltip.add("Right Click to bind to player");
        }
    }
}
