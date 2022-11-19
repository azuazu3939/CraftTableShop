package azuazu3939.crafttableshop;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CTSMenu {

    public static void openMenuMain(Player player) {

        Inventory inventoryType = CTSItem.MainMenu();

        player.openInventory(inventoryType);
    }

    public static Inventory openMenuFF() {

        Inventory inventory = CTSItem.FFMenu();
        CTSCancelEvent.CLICK_PLAYER.openInventory(inventory);

        return inventory;
    }

    public static Inventory openTest() {

        Inventory inventory = CTSItem.TestMenu();
        CTSCancelEvent.CLICK_PLAYER.openInventory(inventory);

        return inventory;
    }
}
