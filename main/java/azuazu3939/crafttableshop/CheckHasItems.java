package azuazu3939.crafttableshop;

import com.sun.source.tree.BreakTree;

import java.util.Objects;

public class CheckHasItems {

    //完璧
    public static boolean hasItemTestA(String configString, int amount, String itemString) {

        /* int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".a");
        if (amount < i) return false;
        if (CraftTableShop.getInstance().getConfig().isSet(configString + ".a." + i) &&
                Objects.equals(CraftTableShop.getInstance().getConfig().getString(configString + ".a." + i), itemString)) {

            return true;
        } */
        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".a");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".a." + i);
    }

    public static boolean hasItemTestB(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".b");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".b." + i + "." + itemString);
    }

    public static boolean hasItemTestC(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".c");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".c." + i + "." + itemString);
    }

    public static boolean hasItemTestD(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".d");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".d." + i + "." + itemString);
    }

    public static boolean hasItemTestE(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".e");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".e." + i + "." + itemString);
    }

    public static boolean hasItemTestF(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".f");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".f." + i + "." + itemString);
    }

    public static boolean hasItemTestG(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".g");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".g." + i + "." + itemString);
    }

    public static boolean hasItemTestH(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".h");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".h." + i + "." + itemString);
    }

    public static boolean hasItemTestI(String configString, int amount, String itemString) {

        int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".i");
        if (amount < i) return false;
        return CraftTableShop.getInstance().getConfig().isSet(configString + ".i." + i + "." + itemString);
    }
}
