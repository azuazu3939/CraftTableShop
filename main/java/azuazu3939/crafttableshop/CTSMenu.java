package azuazu3939.crafttableshop;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CTSMenu {

    public static void openMenuMain(Player player) {

        Inventory inventoryType = CTSItem.MainMenu();

        player.openInventory(inventoryType);
    }

    public static Inventory openMenuSub() {

        Inventory inventory = CTSItem.SubMenu();
        CTSCancelEvent.CLICK_PLAYER.openInventory(inventory);

        return inventory;
    }

    public static Inventory openMenuCraft() {

        Inventory inventory = CTSItem.CraftMenu();
        CTSCancelEvent.CLICK_PLAYER.openInventory(inventory);

        return inventory;
    }
}
