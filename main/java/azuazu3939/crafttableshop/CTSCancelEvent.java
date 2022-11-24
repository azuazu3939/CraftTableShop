package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

public class CTSCancelEvent implements Listener {

    static HumanEntity CLICK_PLAYER;
    static ItemStack CLICK_ITEM;
    static String CLICK_MENU;

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {

        CLICK_ITEM = event.getCurrentItem();
        CLICK_PLAYER = event.getWhoClicked();

        if (event.getView().getTitle() == null) return;

        CLICK_MENU = event.getView().getTitle();

        if (CTSItemInfo.checkTitleReturner() == null || CTSItemInfo.checkTitleReturner().equals("null")) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);

        if (CTSItemInfo.titleReturner() == null || CTSItemInfo.titleReturner().equals("null")) return;
        if (CTSItemInfo.itemReturner(CLICK_ITEM, CLICK_MENU) || CTSItemInfo.subOrCraftReturner().equals("true") && !CTSItemInfo.subOrCraftReturner().equals("true2")) {

            CLICK_PLAYER.sendMessage("おめ");
            CTSMenu.openMenuSub(CLICK_PLAYER);
            return;
        }

        if (CTSItemInfo.itemReturner(CLICK_ITEM, CLICK_MENU) || CTSItemInfo.subOrCraftReturner().equals("true2") && !CTSItemInfo.subOrCraftReturner().equals("true")) {

            CLICK_PLAYER.sendMessage("おめ");
            CTSMenu.openMenuCraft(CLICK_PLAYER);
        }
    }

    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {

        if (CTSItemInfo.checkTitleReturner() == null || CTSItemInfo.checkTitleReturner().equals("null")) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);
    }
}
