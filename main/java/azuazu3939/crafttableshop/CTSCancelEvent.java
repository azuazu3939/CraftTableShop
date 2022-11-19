package azuazu3939.crafttableshop;

import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

import static azuazu3939.crafttableshop.CTSItem.*;

public class CTSCancelEvent implements Listener {

    static HumanEntity CLICK_PLAYER;

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {

        if (event.getView().getTitle().equals("CTSMenu") || event.getView().getTitle().equals("FFMenu") || event.getView().getTitle().equals("TestItem"))

            event.setCancelled(true);
        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().isSimilar(ItemFF())) {

            CLICK_PLAYER = event.getWhoClicked();
            CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 0.5F, 0.5F);
            CLICK_PLAYER.openInventory(CTSMenu.openMenuFF());
        }
        if (event.getCurrentItem().isSimilar(ItemTest())) {


            CLICK_PLAYER = event.getWhoClicked();
            CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 0.5F, 0.5F);
            CLICK_PLAYER.openInventory(CTSMenu.openTest());
        }
        if (event.getCurrentItem().isSimilar(CTSItemInfo.ItemReturner("ぷ"))) {

            CLICK_PLAYER = event.getWhoClicked();
           if (CheckHasItems.hasItemTestA("Test")) {

               CLICK_PLAYER.sendMessage("おめ");
           }
        }
    }
    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {
        if (event.getView().getTitle().equals("CTSMenu") || event.getView().getTitle().equals("FFMenu") || event.getView().getTitle().equals("TestItem"))

            event.setCancelled(true);
    }
}
