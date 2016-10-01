package gigabit101.lockit.init;

import gigabit101.lockit.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gigabit101 on 01/10/2016.
 */
public class ModItems
{
    public static Item lockpick;
    public static Item uncutkey;
    public static Item key;
    public static Item padlock;

    public static void init()
    {
        lockpick = new ItemLockPick();
        GameRegistry.register(lockpick);

        uncutkey = new ItemUncutKey();
        GameRegistry.register(uncutkey);

        key = new ItemKey();
        GameRegistry.register(key);

        padlock = new ItemPadLock();
        GameRegistry.register(padlock);
    }
}
