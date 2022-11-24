package azuazu3939.crafttableshop;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import java.util.*;

import static azuazu3939.crafttableshop.CTSCancelEvent.CLICK_MENU;
import static azuazu3939.crafttableshop.CTSCancelEvent.CLICK_PLAYER;

public class checkHasItems {

    static FileConfiguration info = craftTableShop.getInstance().getConfig();
    static Map<ItemStack, Integer> map = new HashMap<>();
    static List<Integer> amount = new ArrayList<>();

    public static boolean checkFinal() {

        checkA(CLICK_MENU);
        checkB(CLICK_MENU);
        checkC(CLICK_MENU);
        checkD(CLICK_MENU);
        checkE(CLICK_MENU);
        checkF(CLICK_MENU);
        checkG(CLICK_MENU);
        checkH(CLICK_MENU);
        checkI(CLICK_MENU);

        Set<Map.Entry<ItemStack, Integer>> entry = map.entrySet();
        for (Map.Entry<ItemStack, Integer> e : entry) {

            if (info.getItemStack(CLICK_MENU + ".a.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".a.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".b.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".b.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".c.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".c.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".d.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".d.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".e.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".e.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".f.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".f.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".g.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".g.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".h.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".h.Item").isSimilar(e.getKey())) {
                amount.add(1);
                continue;}
            if (info.getItemStack(CLICK_MENU + ".i.Item").getAmount() <= e.getValue() && info.getItemStack(CLICK_MENU + ".i.Item").isSimilar(e.getKey())) {
                amount.add(1);}
        }
        if (map.size() == amount.size() && !map.isEmpty() && !amount.isEmpty()) {
            return true;
        }
        map.clear();
        amount.clear();
        return false;
    }
    public static void checkA(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".a.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("a")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkB(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".b.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("b")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkC(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".c.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("c")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkD(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".d.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("d")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkE(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".e.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("e")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkF(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".f.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("f")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkG(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".g.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("g")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkH(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".h.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("h")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }

    public static void checkI(String clickMenu) {

        ItemStack itemStack = info.getItemStack(clickMenu + ".i.Item");
        if (itemStack == null) return;

        for (String s : info.getConfigurationSection(clickMenu).getKeys(false)) {

            if (s == null) return;
            if (!s.equals("i")) continue;
            itemStack = info.getItemStack(clickMenu + "." + s + ".Item");

            if (itemStack == null) return;
            if (CLICK_PLAYER.getInventory().containsAtLeast(itemStack, itemStack.getAmount())) {

                if (map.containsKey(itemStack)) {
                    map.put(itemStack, map.get(itemStack) + itemStack.getAmount());
                    return;
                }
                map.put(itemStack, itemStack.getAmount());
                return;
            }
            if (CLICK_PLAYER.getInventory().getContents() == null) {
                map.put(itemStack, 0);
                return;
            }
            for (ItemStack item : CLICK_PLAYER.getInventory().getContents()) {
                if (item == null) continue;
                if (item.isSimilar(itemStack)) {
                    map.put(itemStack, item.getAmount());
                    return;
                }
            }
        }
        map.put(itemStack, 0);
    }
}
