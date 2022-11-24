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

    public static ItemStack ItemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ArrayList<ItemStack> MainMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>();
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        for (String string : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (string == null) continue;

            ItemStack itemStack = info.getItemStack("MainCraft." + string + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public static ArrayList<ItemStack> SubMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (CTSItemInfo.TitleReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.TitleReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.TitleReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public static ArrayList<ItemStack> CraftMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (CTSItemInfo.TitleReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.TitleReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;
            if (s.equals("end")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.TitleReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }


    public static Inventory MainMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "MainCraft");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        int count = 0;
        int i;
        for (i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;
            count++;

            if (MainMenuItemList().size() >= count) inventory.setItem(i, MainMenuItemList().get(count - 1));
        }
        return inventory;
    }

    public static Inventory SubMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CTSItemInfo.TitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        int count = 0;
        for (int i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36) continue;

            if (SubMenuItemList().size() > count ) inventory.setItem(i, SubMenuItemList().get(count));
            count++;
        }
        return inventory;
    }

    public static Inventory CraftMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CTSItemInfo.TitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        int count = 0;
        for (int i = 19; i < 40; i++) {

            if (i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 31 || i == 32|| i == 33 || i == 34 || i == 35 || i == 36) continue;

            if (CraftMenuItemList().size() > count) inventory.setItem(i, CraftMenuItemList().get(count));
            count++;
        }
        inventory.setItem(34, CraftTableShop.getInstance().getConfig().getItemStack(CTSItemInfo.TitleReturner() + ".end.Item", ItemSlot()));
        return inventory;
    }
}
