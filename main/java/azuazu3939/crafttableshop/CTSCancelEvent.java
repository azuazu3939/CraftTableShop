package azuazu3939.crafttableshop;

import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

import static azuazu3939.crafttableshop.CTSItem.*;

public class CTSCancelEvent implements Listener {

    static HumanEntity CLICK_PLAYER;
    static ItemStack CLICK_ITEM;
    static String CLICKED_MENU;

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {

        CLICK_ITEM = event.getCurrentItem();
        CLICK_PLAYER = event.getWhoClicked();
        CLICKED_MENU = event.getView().getTitle();

        if (event.getView().getTitle().equals("MainMenu") || CTSItem.MainMenuItemName() || CTSItem.SubMenuItemName()) {

            event.setCancelled(true);
        }

        if (event.getCurrentItem() == null) return;
        if (CTSItem.MainMenuClickItemList()) {

            CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5F, 0.5F);
            CLICK_PLAYER.openInventory(CTSMenu.openMenuSub());
        }
        if (CTSItem.SubMenuClickItemList()) {

            CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5F, 0.5F);
            CLICK_PLAYER.openInventory(CTSMenu.openMenuCraft());
        }
        if (CTSItem.CraftMenuItemName() || event.getSlot() == 34) {

           if (CheckHasItems.hasItemTestA(CLICKED_MENU) &&
                   CheckHasItems.hasItemTestB(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestC(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestD(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestE(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestF(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestG(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestH(CLICKED_MENU)&&
                   CheckHasItems.hasItemTestI(CLICKED_MENU)) {

               CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5F, 0.5F);
               CLICK_PLAYER.sendMessage("おめ");
           }
        }
    }
    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {

        if (event.getView().getTitle().equals("Menu") || CTSItem.MainMenuItemName() || CTSItem.SubMenuItemName())

            event.setCancelled(true);
    }
}
