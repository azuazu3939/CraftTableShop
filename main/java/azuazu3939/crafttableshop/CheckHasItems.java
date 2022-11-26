package azuazu3939.crafttableshop;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckHasItems {

    private static CheckHasItems instance;

    public CheckHasItems(CheckHasItems event) {

        instance = event;
    }
    public static CheckHasItems getInstance() {
        return instance;
    }
    FileConfiguration info = CraftTableShop.getInstance().getConfig();
    Map<ItemStack, Integer> maps = new HashMap<>();
    Map<ItemStack, Integer> map2 = new HashMap<>();
    List<Integer> checkAmount = new ArrayList<>();

    List<Integer> count = new ArrayList<>();
    int checker = 0;
    int checkerA = 0;
    int checkerB = 0;
    int checkerC = 0;
    int checkerD = 0;
    int checkerE = 0;
    int checkerF = 0;
    int checkerG = 0;
    int checkerH = 0;
    int checkerI = 0;

    private boolean superCheck(ItemStack itemStack, ItemStack itemStack2) {

        if (!itemStack.getItemMeta().getDisplayName().equals(itemStack2.getItemMeta().getDisplayName())) return false;
        if (!itemStack.getType().equals(itemStack2.getType())) return false;
        if (!itemStack.getItemMeta().getItemFlags().equals(itemStack2.getItemMeta().getItemFlags())) return false;
        if (!itemStack.getItemMeta().getPersistentDataContainer().equals(itemStack2.getItemMeta().getPersistentDataContainer())) return false;
        return itemStack.getItemMeta().getEnchants().equals(itemStack2.getItemMeta().getEnchants());
    }

    public boolean checkFinal() {

        invNoLoopItemContents();

        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".a.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".b.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".c.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".d.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".e.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".f.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".g.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".h.Item")) {

            checkAmount.add(1);
        }
        if (info.isItemStack(CTSCancelEvent.CLICK_MENU + ".i.Item")) {

            checkAmount.add(1);
        }
        checkerA=0;
        checkerB=0;
        checkerC=0;
        checkerD=0;
        checkerE=0;
        checkerF=0;
        checkerG=0;
        checkerH=0;
        checkerI=0;

        CTSCancelEvent.CLICK_PLAYER.sendMessage(map2.size() + "+" + count.size() + "=" + checkAmount.size() + "(" + maps.size() + ")");
        if (map2.size() + count.size() == checkAmount.size() && !map2.isEmpty() && !checkAmount.isEmpty()) {
            maps.clear();
            map2.clear();
            count.clear();
            checkAmount.clear();
            return true;
        }
        maps.clear();
        map2.clear();
        count.clear();
        checkAmount.clear();
        return false;
    }

    public void invNoLoopItemContents() {

        for (ItemStack item : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (item == null) continue;

            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".a.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".a.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".b.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".b.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".c.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".c.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".d.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".d.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".e.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".e.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".f.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".f.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".g.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".g.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".h.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".h.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
            if (info.isSet(CTSCancelEvent.CLICK_MENU + ".i.Item")) if (superCheck(info.getItemStack(CTSCancelEvent.CLICK_MENU + ".i.Item"), item)) {

                if (checkCancel(item)) count.add(1);
            }
        }
    }

    public boolean checkCancel(ItemStack item) {

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".a.Item").isSimilar(item) && checkerA == 0) {

            checker++;
            checkerA++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".a.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".b.Item").isSimilar(item) && checkerB == 0) {

            checker++;
            checkerB++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".b.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".c.Item").isSimilar(item) && checkerC == 0) {

            checker++;
            checkerC++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".c.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".d.Item").isSimilar(item) && checkerD == 0) {

            checker++;
            checkerD++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".d.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".e.Item").isSimilar(item) && checkerE == 0) {

            checker++;
            checkerE++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".e.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".f.Item").isSimilar(item) && checkerF == 0) {

            checker++;
            checkerF++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".f.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".g.Item").isSimilar(item) && checkerG == 0) {

            checker++;
            checkerG++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".g.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".h.Item").isSimilar(item) && checkerH == 0) {

            checker++;
            checkerH++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".h.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }

        if (checker < 9 && info.getItemStack(CTSCancelEvent.CLICK_MENU + ".i.Item").isSimilar(item) && checkerI == 0) {

            checker++;
            checkerI++;

            ItemStack itemStack = info.getItemStack(CTSCancelEvent.CLICK_MENU + ".i.Item");

            if (maps.containsKey(itemStack) && !maps.isEmpty() && map2.containsKey(item) && !map2.isEmpty() && maps.get(itemStack) <= map2.get(item)) {

                int in = maps.get(itemStack) + item.getAmount();
                maps.remove(itemStack);
                maps.put(itemStack, in);

                return true;
            }

            if (maps.isEmpty() || !maps.containsKey(itemStack)) maps.put(itemStack, itemStack.getAmount());
            if (map2.isEmpty() || !map2.containsKey(item)) map2.put(item, item.getAmount());

            return false;
        }
        return false;
    }
}
