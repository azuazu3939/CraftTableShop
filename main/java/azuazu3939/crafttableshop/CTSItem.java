package azuazu3939.crafttableshop;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CTSItem {

    private static CTSItem inst;

    public CTSItem(CTSItem ctsItem) {

        inst = ctsItem;
    }
    public static CTSItem getInstance() {
        return inst;
    }
    Material other = Material.GRAY_STAINED_GLASS_PANE;

    public ItemStack itemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public ArrayList<ItemStack> mainMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>();
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        for (String string : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (string == null) continue;

            ItemStack itemStack = info.getItemStack("MainCraft." + string + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public ArrayList<ItemStack> subMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (CTSItemInfo.getInstance().titleSubReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.getInstance().titleSubReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.getInstance().titleSubReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }

    public ArrayList<ItemStack> craftMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>(0);
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (CTSItemInfo.getInstance().titleCraftReturner().equals("null")) return list;
        for (String s : info.getConfigurationSection(CTSItemInfo.getInstance().titleCraftReturner()).getKeys(false)) {

            if (s == null) continue;
            if (s.equals("Item")) continue;
            if (s.equals("end")) continue;

            ItemStack itemStack = info.getItemStack(CTSItemInfo.getInstance().titleCraftReturner() + "." + s + ".Item");

            list.add(itemStack);
        }
        return list;
    }
}
