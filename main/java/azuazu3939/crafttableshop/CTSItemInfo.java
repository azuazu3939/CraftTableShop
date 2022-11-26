package azuazu3939.crafttableshop;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;


public class CTSItemInfo {

    private static CTSItemInfo inst;

    public CTSItemInfo(CTSItemInfo ctsItemInfo) {

        inst = ctsItemInfo;
    }
    public static CTSItemInfo getInstance() {
        return inst;
    }

    public boolean itemReturner(ItemStack item, String group) { //そのTitleがある場合trueを返す奴

        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (group == null || group.equals("null")) return false;
        for (String string : info.getConfigurationSection(group).getKeys(false)) {

            if (string == null) continue;
            if (item.isSimilar(CTSItem.getInstance().itemSlot())) return false;
            if (string.equals("a") || string.equals("b") || string.equals("c") || string.equals("d") || string.equals("e") ||
                    string.equals("f") || string.equals("g") || string.equals("h") || string.equals("i") || string.equals("end")) return false;
            if (info.getItemStack(group + "." + string + ".Item").isSimilar(item)) return true;
        }
        return false;
    }

    public String titleSubReturner() {  //次のTitleを返すやつ

        String s = "null";
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        for (String str : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (str == null) continue;
            if (str.equals("Item")) continue;
            if (CTSCancelEvent.CLICK_MENU.equals("MainCraft") && info.getItemStack("MainCraft." + str + ".Item").isSimilar(CTSCancelEvent.CLICK_ITEM)) {

                return "MainCraft." + str;
            }
        }
        return s;
    }

    public String titleCraftReturner() {  //次のTitleを返すやつ

        String s = "null";
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        for (String str : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (str == null) continue;
            if (str.equals("Item")) continue;

            for (String str1 : info.getConfigurationSection("MainCraft." + str).getKeys(false)) {

                if (str1 == null) continue;
                if (str1.equals("Item")) continue;
                if (CTSCancelEvent.CLICK_MENU.equals("MainCraft." + str) && info.getItemStack("MainCraft." + str + "." + str1 + ".Item").isSimilar(CTSCancelEvent.CLICK_ITEM)) {

                    return "MainCraft." + str + "." + str1;
                }
            }
        }
        return s;
    }

    public String checkTitleReturner() { //今のTitleを確認し返す奴

        String s = "null";
        FileConfiguration info = CraftTableShop.getInstance().getConfig();
        String string = CTSCancelEvent.CLICK_MENU;

        if (string.equals("MainCraft")) return "MainCraft";
        if (string == null) return s;
        for (String s1 : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (s1 == null) continue;
            if (!string.equals("MainCraft." + s1)) continue;
            for (String str : info.getConfigurationSection("MainCraft." + s1).getKeys(false)) {

                if (str == null) continue;

                return "MainCraft." + s1;
            }
        }
        for (String s1 : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (s1 == null) continue;
            for (String s2 : info.getConfigurationSection("MainCraft." + s1).getKeys(false)) {

                if (s2 == null) continue;
                if (!string.equals("MainCraft." + s1 + "." + s2)) continue;
                return "MainCraft." + s1 + "." + s2;
            }
        }
        return s;
    }

    public String subOrCraftReturner() {

        String s = "null";
        FileConfiguration info = CraftTableShop.getInstance().getConfig();

        if (checkTitleReturner().equals("MainCraft")) return "true";
        for (String s1 : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (checkTitleReturner().equals("MainCraft." + s1)) return "true2";

            for (String s2 : info.getConfigurationSection("MainCraft." + s1).getKeys(false)) {

                if (checkTitleReturner().equals("MainCraft." + s1 + "." + s2)) return "true3";
            }
        }
        return s;
    }
}
