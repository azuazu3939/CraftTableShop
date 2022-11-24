package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import static azuazu3939.crafttableshop.checkInvHolder.*;

public class CTSMenu {

    public static void openMenu(Player player) {

        player.openInventory(CTSInventory(createInvMain()));
    }

    public static void openMenuSub(HumanEntity player) {

       player.openInventory(CTSInventory(createInvSub()));
    }

    public static void openMenuCraft(HumanEntity player) {

        player.openInventory(CTSInventory(createInvCraft()));
    }
}
