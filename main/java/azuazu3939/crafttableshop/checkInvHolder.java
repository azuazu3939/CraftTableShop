package azuazu3939.crafttableshop;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.NotNull;

import static azuazu3939.crafttableshop.CTSCancelEvent.CLICK_PLAYER;
import static azuazu3939.crafttableshop.CTSItem.*;
import static azuazu3939.crafttableshop.CTSItemInfo.titleCraftReturner;
import static azuazu3939.crafttableshop.CTSItemInfo.titleSubReturner;

public class checkInvHolder {

    public static Inventory createInvMain() {

        return Bukkit.createInventory(new CTSInvMain(CLICK_PLAYER), 54, "MainCraft");
    }

    public static Inventory createInvSub() {

        return Bukkit.createInventory(new CTSInvSub(CLICK_PLAYER), 54, titleSubReturner());
    }

    public static Inventory createInvCraft() {

        return Bukkit.createInventory(new CTSInvCraft(CLICK_PLAYER), 54, titleCraftReturner());
    }

    public static @NotNull Inventory CTSInventory(Inventory inventory) {

        if (inventory.getHolder() instanceof CTSInvMain) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, itemSlot());
            }

            int count = 0;
            for (int i = 10; i < 44; i++) {

                if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;
                count++;

                if (mainMenuItemList().size() >= count) inventory.setItem(i, mainMenuItemList().get(count - 1));
            }
        }

        if (inventory.getHolder() instanceof CTSInvSub) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, itemSlot());
            }

            int count = 0;
            for (int i = 10; i < 44; i++) {

                if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;

                if (subMenuItemList().size() > count ) inventory.setItem(i, subMenuItemList().get(count));
                count++;
            }
        }

        if (inventory.getHolder() instanceof CTSInvCraft) {

            for (int i = 0; i < 54; i++) {
                inventory.setItem(i, itemSlot());
            }

            int count = 0;
            for (int i = 19; i < 40; i++) {

                if (i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 31 || i == 32|| i == 33 || i == 34 || i == 35 || i == 36) continue;

                if (craftMenuItemList().size() > count) inventory.setItem(i, craftMenuItemList().get(count));
                count++;
            }
            inventory.setItem(34, craftTableShop.getInstance().getConfig().getItemStack(titleCraftReturner() + ".end.Item", itemSlot()));

        }
        return inventory;
    }
}
