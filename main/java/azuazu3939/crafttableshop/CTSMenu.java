package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

public class CTSMenu {

    private static CTSMenu menu;

    public CTSMenu(CTSMenu ctsMenu) {
       menu = ctsMenu;
    }
    public static CTSMenu getInstance() {
        return menu;
    }

    public void openMenu(Player player) {

        player.openInventory(CheckInvHolder.getInstance().CTSInventory(CheckInvHolder.getInstance().createInvMain()));
    }

    public void openMenuSub(HumanEntity player) {

       player.openInventory(CheckInvHolder.getInstance().CTSInventory(CheckInvHolder.getInstance().createInvSub()));
    }

    public void openMenuCraft(HumanEntity player) {

        player.openInventory(CheckInvHolder.getInstance().CTSInventory(CheckInvHolder.getInstance().createInvCraft()));
    }
}
