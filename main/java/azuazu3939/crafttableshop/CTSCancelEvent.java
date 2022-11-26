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

        if (CTSItemInfo.getInstance().checkTitleReturner().equals("null") || CTSItemInfo.getInstance().checkTitleReturner().equals(null)) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.getInstance().checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);

        if (CTSItemInfo.getInstance().itemReturner(CLICK_ITEM, CLICK_MENU) && CTSItemInfo.getInstance().subOrCraftReturner().equals("true")) {

            CTSMenu.getInstance().openMenuSub(CLICK_PLAYER);
        }

        if (CTSItemInfo.getInstance().itemReturner(CLICK_ITEM, CLICK_MENU) && CTSItemInfo.getInstance().subOrCraftReturner().equals("true2")) {

            CTSMenu.getInstance().openMenuCraft(CLICK_PLAYER);
        }
        if (event.getSlot() == 34 && CTSItemInfo.getInstance().subOrCraftReturner().equals("true3")) {

            if (CheckHasItems.getInstance().checkFinal()) CLICK_PLAYER.sendMessage("おめ");
        }
    }

    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {

        if (CTSItemInfo.getInstance().checkTitleReturner().equals("null")) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.getInstance().checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);
    }
}
