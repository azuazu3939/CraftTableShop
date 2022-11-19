package azuazu3939.crafttableshop;

import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CheckHasItems {

    //だいたい完成
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

    public static boolean hasItemTestB(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".b")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".b." + s);
            if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

            for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

                if (itemStack == null) continue;

                if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
                int amount = itemStack.getAmount();

                if (!(amount < i)) return true;
            }
        }
        return false;
    }

    public static boolean hasItemTestC(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".c")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".c." + s);
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

    public static boolean hasItemTestD(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".d")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".d." + s);
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

    public static boolean hasItemTestE(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".e")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".e." + s);
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

    public static boolean hasItemTestF(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".f")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".f." + s);
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

    public static boolean hasItemTestG(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".g")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".g." + s);
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

    public static boolean hasItemTestH(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".h")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".h." + s);
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

    public static boolean hasItemTestI(String configString) {

        for (String s : Objects.requireNonNull(CraftTableShop.getInstance().getConfig().getConfigurationSection(configString + ".i")).getKeys(false)) {

            int i = CraftTableShop.getInstance().getConfig().getInt(configString + ".i." + s);
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
}
