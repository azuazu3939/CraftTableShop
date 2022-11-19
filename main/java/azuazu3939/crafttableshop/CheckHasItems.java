package azuazu3939.crafttableshop;

import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CheckHasItems {

    public static boolean hasItemTestA(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".a")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".a." + s);
            if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

            for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

                if (itemStack == null ) continue;

                if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
                int amount = itemStack.getAmount();

                if (!(amount < i) ) return true;
            }
        }
        return false;
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
