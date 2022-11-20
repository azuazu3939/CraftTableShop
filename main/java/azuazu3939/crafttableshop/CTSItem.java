package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class CTSItem {

    static Material other = Material.valueOf(CraftTableShop.getInstance().getMenuConfig().getConfig().getString("other", "GRAY_STAINED_GLASS_PANE"));

    public static ItemStack ItemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack MainMenuItemList() {

        ItemStack itemStack = CTSItem.ItemSlot();

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu." + string, ItemSlot());

            return itemStack;
        }
        return itemStack;
    }

    public static ItemStack SubMenuItemList() {

        ItemStack itemStack = CTSItem.ItemSlot();

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            for (String string2 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + string).getKeys(false)) {

                itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu." + string + "." + string2, ItemSlot());

                return itemStack;
            }
        }
        return itemStack;
    }

    private static ItemStack CraftMenuItemList() {

        ItemStack itemStack = CTSItem.ItemSlot();

        for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (String s : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + string).getKeys(false)) {

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + string + "." + s))) {

                    itemStack = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + string + "." + s);

                    return itemStack;
                }
            }
        }
        return itemStack;
    }

    public static Inventory MainMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "MainMenu");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        for (int i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36 || i == 44 || i == 45) continue;
            inventory.setItem(i, MainMenuItemList());
        }
        return inventory;
    }

    public static Inventory SubMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, SubTitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        for (int i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36 || i == 44 || i == 45) continue;

            inventory.setItem(i, SubMenuItemList());
        }

        return inventory;
    }
    public static Inventory CraftMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CraftTitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        for (int i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36 || i == 44 || i == 45) continue;

            inventory.setItem(i, CraftMenuItemList());
        }

        return inventory;
    }

    public static boolean MainMenuItemName() {

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu." + s))) {

                return true;
            }
        }
        return false;
    }

    public static boolean SubMenuItemName() {


        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            for (String s1 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + s).getKeys(false)) {

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu." + s + "." + s1))) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean CraftMenuItemName() {

        for (String s : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (String s1 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + s).getKeys(false)) {

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + s + "." + s1))) {

                    return true;
                }

                for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                    if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString("CraftData." + s + "." + s1), mythicItem.getInternalName())) {

                        if (MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName()).isSimilar(CTSCancelEvent.CLICK_ITEM))
                            return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean MainMenuClickItemList() {


        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu" + "." + string);

            if (CTSCancelEvent.CLICK_ITEM.isSimilar(itemStack)) {
                return true;
            }
        }
        return false;
    }

    public static boolean SubMenuClickItemList() {

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            for (String string2 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu" + "." + string).getKeys(false)) {

                ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu" + "." + string + "." + string2);

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(itemStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String SubTitleReturner() {

        String string = null;

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu." + s))) {
                string = s;

                return string;
            }
        }
        return string;
    }

    public static String CraftTitleReturner() {

        String string = null;

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            for (String s1 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + s ).getKeys(false)) {

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu." + s + "." + s1))) {

                    string = s;

                    return string;
                }
            }
        }
        return string;
    }
}
