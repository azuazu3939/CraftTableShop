package azuazu3939.crafttableshop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CTSItem {

    static Material other = Material.GRAY_STAINED_GLASS_PANE;

    public static ItemStack itemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ArrayList<ItemStack> mainMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>();
        FileConfiguration info = craftTableShop.getInstance().getConfig();

        for (String string : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (string == null) continue;

            ItemStack itemStack = info.getItemStack("MainCraft." + string + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public static ArrayList<ItemStack> subMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = craftTableShop.getInstance().getConfig();

        if (CTSItemInfo.titleReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.titleReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.titleReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public static ArrayList<ItemStack> craftMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = craftTableShop.getInstance().getConfig();

        if (CTSItemInfo.titleReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.titleReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;
            if (s.equals("end")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.titleReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }


    public static Inventory mainMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "MainCraft");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, itemSlot());
        }

        int count = 0;
        int i;
        for (i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;
            count++;

            if (mainMenuItemList().size() >= count) inventory.setItem(i, mainMenuItemList().get(count - 1));
        }
        return inventory;
    }

    public static Inventory subMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CTSItemInfo.titleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, itemSlot());
        }

        int count = 0;
        for (int i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;

            if (subMenuItemList().size() > count ) inventory.setItem(i, subMenuItemList().get(count));
            count++;
        }
        return inventory;
    }

    public static Inventory craftMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CTSItemInfo.titleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, itemSlot());
        }

        int count = 0;
        for (int i = 19; i < 40; i++) {

            if (i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 31 || i == 32|| i == 33 || i == 34 || i == 35 || i == 36) continue;

            if (craftMenuItemList().size() > count) inventory.setItem(i, craftMenuItemList().get(count));
            count++;
        }
        inventory.setItem(34, craftTableShop.getInstance().getConfig().getItemStack(CTSItemInfo.titleReturner() + ".end.Item", itemSlot()));
        return inventory;
    }
}
