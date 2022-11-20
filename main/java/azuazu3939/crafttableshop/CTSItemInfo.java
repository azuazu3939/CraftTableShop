package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;


public class CTSItemInfo {
    //完璧
    public static ItemStack ItemReturner(String itemString) {

        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet("CraftData." + itemString))) return null;

        for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

            if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString("CraftData." + itemString), mythicItem.getInternalName())) {

                return MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName());
            }
        }
        return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack(itemString);
    }
}
