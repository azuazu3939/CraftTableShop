package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.utils.adventure.text.format.Style;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class CheckInvHolder {

    private static CheckInvHolder holder;

    public CheckInvHolder(CheckInvHolder invHolder) {
        holder = invHolder;
    }

    public static CheckInvHolder getInstance() {
        return holder;
    }

    public Inventory createInvMain(String title, Player player) {

        return Bukkit.createInventory(new CTSInvMain(player), 54, title);
    }

    public Inventory createInvSub(String title, Player player) {

        return Bukkit.createInventory(new CTSInvSub(player), 54, title);
    }

    public Inventory createInvCraft(String title, Player player) {

        return Bukkit.createInventory(new CTSInvCraft(player), 54, title);
    }

    public Inventory CTSInventory(Inventory inventory) {

        if (inventory.getHolder() instanceof CTSInvMain) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, CTSItem.getInstance().itemSlot());
            }

            int count = 0;
            for (int i = 10; i < 44; i++) {

                if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;
                count++;

                if (CTSItem.getInstance().mainMenuItemList().size() >= count) inventory.setItem(i, CTSItem.getInstance().mainMenuItemList().get(count - 1));
            }
        }

        if (inventory.getHolder() instanceof CTSInvSub) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, CTSItem.getInstance().itemSlot());
            }

            int count = 0;
            for (int i = 10; i < 44; i++) {

                if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;

                if (CTSItem.getInstance().subMenuItemList().size() > count ) inventory.setItem(i, CTSItem.getInstance().subMenuItemList().get(count));
                count++;
            }
        }

        if (inventory.getHolder() instanceof CTSInvCraft) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, CTSItem.getInstance().itemSlot());
            }

            int count = 0;
            for (int i = 19; i < 40; i++) {

                if (i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 31 || i == 32|| i == 33 || i == 34 || i == 35 || i == 36) continue;

                if (CTSItem.getInstance().craftMenuItemList().size() > count) inventory.setItem(i, CTSItem.getInstance().craftMenuItemList().get(count));
                count++;
            }
            inventory.setItem(34, CraftTableShop.getInstance().getConfig().getItemStack(CTSItemInfo.getInstance().titleCraftReturner() + ".end.Item", CTSItem.getInstance().itemSlot()));

        }
        return inventory;
    }
}
