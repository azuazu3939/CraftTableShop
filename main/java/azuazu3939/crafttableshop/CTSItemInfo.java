package azuazu3939.crafttableshop;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;


public class CTSItemInfo {
    //完璧

    public static boolean itemReturner(ItemStack item, String group) { //そのTitleがある場合trueを返す奴

        FileConfiguration info = craftTableShop.getInstance().getConfig();

        if (group == null) return false;
        for (String string : info.getConfigurationSection(group).getKeys(false)) {

            if (string == null) continue;
            if (string.equals("a") || string.equals("b") || string.equals("c") || string.equals("d") || string.equals("e") ||
                    string.equals("f") || string.equals("g") || string.equals("h") || string.equals("i") || string.equals("end")) return false;
            if (info.getItemStack(group + "." + string + ".Item").isSimilar(item)) return true;
        }
        return false;
    }

    public static String titleReturner() {  //次のTitleを返すやつ

        String s = "null";
        FileConfiguration info = craftTableShop.getInstance().getConfig();
        String string = CTSCancelEvent.CLICK_MENU;

        for (String str : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (str == null) continue;
            if (str.equals("Item")) continue;
            if (string.equals("MainCraft")) {

                if (info.getItemStack("MainCraft." + str + ".Item").isSimilar(CTSCancelEvent.CLICK_ITEM))
                    return "MainCraft." + str;
            }
            for (String str1 : info.getConfigurationSection("MainCraft." + str).getKeys(false)) {

                if (str1 == null) continue;
                if (str1.equals("Item")) continue;
                if (string.equals("MainCraft." + str)) {
                    if (info.getItemStack("MainCraft." + str + "." + str1 + ".Item").isSimilar(CTSCancelEvent.CLICK_ITEM))
                        return "MainCraft." + str + "." + str1;
                }
                if (string.equals("MainCraft." + str + "." + str1)) return s;
            }
        }

        return s;
    }

    public static String checkTitleReturner() { //今のTitleを確認し返す奴

        String s = "null";
        FileConfiguration info = craftTableShop.getInstance().getConfig();
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

    public static String subOrCraftReturner() {

        String s = "null";
        FileConfiguration info = craftTableShop.getInstance().getConfig();

        for (String s1 : info.getConfigurationSection("MainCraft").getKeys(false)) {

            if (checkTitleReturner().equals("MainCraft." + s1)) return "true";
            for (String s2: info.getConfigurationSection("MainCraft." + s1).getKeys(false)) {

                if (checkTitleReturner().equals("MainCraft." +s1 + "." + s2)) return "true2";
            }
        }
        return s;
    }
}
