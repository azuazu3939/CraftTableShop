package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

import static azuazu3939.crafttableshop.CTSItemInfo.subOrCraftReturner;
import static azuazu3939.crafttableshop.checkHasItems.checkFinal;

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

        if (CTSItemInfo.checkTitleReturner().equals("null")) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);

        if (CTSItemInfo.itemReturner(CLICK_ITEM, CLICK_MENU) && subOrCraftReturner().equals("true")) {

            CTSMenu.openMenuSub(CLICK_PLAYER);
        }

        if (CTSItemInfo.itemReturner(CLICK_ITEM, CLICK_MENU) && subOrCraftReturner().equals("true2")) {

            CTSMenu.openMenuCraft(CLICK_PLAYER);
        }
        if (event.getSlot() == 34 && subOrCraftReturner().equals("true3")) {

            if (checkFinal()) CLICK_PLAYER.sendMessage("おめ");
        }
    }

    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {

        if (CTSItemInfo.checkTitleReturner().equals("null")) return;
        if (CLICK_ITEM == null) return;
        if (!CTSItemInfo.checkTitleReturner().equals(CLICK_MENU)) return;

        event.setCancelled(true);
    }
}
