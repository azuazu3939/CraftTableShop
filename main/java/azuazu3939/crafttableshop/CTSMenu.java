package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CTSMenu {

    public static void openMenu(Player player) {

        Inventory inventory = CTSItem.MainMenu();

        player.openInventory(inventory);
    }

    public static void openMenuSub(HumanEntity player) {

        Inventory inventory = CTSItem.SubMenu();

        player.openInventory(inventory);
    }

    public static void openMenuCraft(HumanEntity player) {

        Inventory inventory = CTSItem.CraftMenu();

        player.openInventory(inventory);
    }
}
