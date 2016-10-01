package gigabit101.lockit;

import gigabit101.lockit.items.ItemKey;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import reborncore.common.util.ItemNBTHelper;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class LockHandler
{
    @SubscribeEvent
    public void onBlockClicked(PlayerInteractEvent.RightClickBlock event)
    {
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        EntityPlayer player = event.getEntityPlayer();

        if(!world.isRemote && world.getTileEntity(pos) != null)
        {
            TileEntity tile = world.getTileEntity(pos);
            if(tile.getTileData().hasKey("lock"))
            {
                String locker = tile.getTileData().getString("lock");
                if(!hasKey(player, event.getHand(), locker) || !player.getDisplayNameString().contains(locker))
                {
                    player.addChatComponentMessage(new TextComponentString("Owned by " + locker));
                    event.setCanceled(true);
                }
            }
        }
    }

    public boolean hasKey(EntityPlayer player, EnumHand hand, String locker)
    {
        if(player.getHeldItem(hand) != null && player.getHeldItem(hand).getItem() instanceof ItemKey)
        {
            ItemStack key = player.getHeldItem(hand);
            if(ItemNBTHelper.verifyExistance(key, "lock"))
            {
                if(ItemNBTHelper.getString(key, "lock", "").contains(locker))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
