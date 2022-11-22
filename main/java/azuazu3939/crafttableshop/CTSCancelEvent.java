package azuazu3939.crafttableshop;

import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

public class CTSCancelEvent implements Listener {

    static HumanEntity CLICK_PLAYER;
    static ItemStack CLICK_ITEM;
    static String CLICKED_MENU;

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {

        CLICK_ITEM = event.getCurrentItem();
        CLICK_PLAYER = event.getWhoClicked();
        CLICKED_MENU = event.getView().getTitle();

        if (CLICK_ITEM == null) return;
        if (CLICKED_MENU == null) return;
        if ((event.getView().getTitle().equals("CTSMenu") || CTSItem.MainMenuItemName() || CTSItem.SubMenuItemName())) {

            event.setCancelled(true);

            if (CTSItem.MainMenuClickItemList()) {

                CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 1F, 1.5F);
                CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 1F, 1.5F);
                CLICK_PLAYER.openInventory(CTSMenu.openMenuSub());
            }
            if (CTSItem.SubMenuClickItemList()) {

                CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 1F, 1.5F);
                CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 1F, 1.5F);
                CLICK_PLAYER.openInventory(CTSMenu.openMenuCraft());
            }
            if (CTSItem.CraftMenuItemName() || event.getSlot() == 34) {

                for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

                    if (string == null) continue;

                    for (String string2 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + string).getKeys(false)) {

                        if (string2 == null) continue;

                        if (CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + string + "." + string2))) {

                            if (CheckHasItems.hasItemTestA(string) &&
                                    CheckHasItems.hasItemTestB(string) &&
                                    CheckHasItems.hasItemTestC(string) &&
                                    CheckHasItems.hasItemTestD(string) &&
                                    CheckHasItems.hasItemTestE(string) &&
                                    CheckHasItems.hasItemTestF(string) &&
                                    CheckHasItems.hasItemTestG(string) &&
                                    CheckHasItems.hasItemTestH(string) &&
                                    CheckHasItems.hasItemTestI(string)) {

                                CLICK_PLAYER.getWorld().playSound(CLICK_PLAYER.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5F, 0.5F);
                                CLICK_PLAYER.sendMessage("おめ");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInvDrag(InventoryDragEvent event) {

        if (event.getView().getTitle().equals("Menu") || CTSItem.MainMenuItemName() || CTSItem.SubMenuItemName())

            event.setCancelled(true);
    }
}
