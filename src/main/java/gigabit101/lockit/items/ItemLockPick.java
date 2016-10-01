package gigabit101.lockit.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ItemLockPick extends ItemLockIt
{
    public ItemLockPick()
    {
        super("lockpick");
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(worldIn.getTileEntity(pos) != null)
        {
            TileEntity tile = worldIn.getTileEntity(pos);
            if(tile.getTileData().hasKey("lock"))
            {
                tile.getTileData().removeTag("lock");
                return EnumActionResult.PASS;
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("Creative Only");
        tooltip.add("Shift Click on a Locked Tile to remove the lock");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
