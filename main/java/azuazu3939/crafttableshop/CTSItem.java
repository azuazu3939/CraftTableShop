package azuazu3939.crafttableshop;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
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

        if (CTSItemInfo.titleSubReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.titleSubReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.titleSubReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public static ArrayList<ItemStack> craftMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = craftTableShop.getInstance().getConfig();

        if (CTSItemInfo.titleCraftReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.titleCraftReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;
            if (s.equals("end")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.titleCraftReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }
}
