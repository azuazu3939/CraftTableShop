package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Objects;

public class CTSItem {

    static Material other = Material.valueOf(CraftTableShop.getInstance().getMenuConfig().getConfig().getString("other", "GRAY_STAINED_GLASS_PANE"));
    static ItemStack itemStackA = CraftMenuItemA();
    static ItemStack itemStackB = CraftMenuItemB();
    static ItemStack itemStackC = CraftMenuItemC();
    static ItemStack itemStackD = CraftMenuItemD();
    static ItemStack itemStackE = CraftMenuItemE();
    static ItemStack itemStackF = CraftMenuItemF();
    static ItemStack itemStackG = CraftMenuItemG();
    static ItemStack itemStackH = CraftMenuItemH();
    static ItemStack itemStackI = CraftMenuItemI();

    public static ItemStack ItemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ArrayList<ItemStack> MainMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>();

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            if (string == null) continue;

            ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu." + string);

            list.add(itemStack);
        }
        return list;
    }


    public static ArrayList<ItemStack> SubMenuItemList() {

        ArrayList<ItemStack> list = new ArrayList<>();

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (string == null) continue;

            for (String string2 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + string).getKeys(false)) {

                if (string2 == null) continue;
                if (!SubTitleReturner().equalsIgnoreCase(string)) continue;

                ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu." + string + "." + string2, ItemSlot());

                list.add(itemStack);
            }
        }
        return list;
    }

    public static ItemStack CraftMenuItemA() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".a")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".a"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemB() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".b")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".b"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemC() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".c")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".c"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemD() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".d")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".d"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemE() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".e")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".e"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemF() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".f")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".f"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemG() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".g")) == null) continue;
                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".g"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemH() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".h")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".h"));
            }
        }
        return ItemSlot();
    }

    public static ItemStack CraftMenuItemI() {

        for (String link : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (link == null) continue;

            for (String string3 : CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getConfigurationSection("CraftRecipe").getKeys(false)) {

                if (string3 == null) continue;
                if (CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".i")) == null) continue;

                return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + link + "." + CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + string3 + ".i"));
            }
        }
        return ItemSlot();
    }

    public static Inventory MainMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "CTSMenu");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        int count = 0;
        int i;
        for (i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36 || i == 44 || i == 45) continue;
            count++;

            if (MainMenuItemList().size() >= count) inventory.setItem(i, MainMenuItemList().get(count - 1));
        }
        return inventory;
    }

    public static Inventory SubMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, SubTitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        int count = 0;
        int i;
        for (i = 10; i < 44; i++) {

            if (i == 17 || i == 18 || i == 26 || i == 27 || i == 35 || i == 36 || i == 44 || i == 45) continue;
            count++;

            if (SubMenuItemList().size() >= count) inventory.setItem(i, SubMenuItemList().get(count - 1));
        }
        return inventory;
    }
    public static Inventory CraftMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, CraftTitleReturner());

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (CTSItemInfo.StringReturner() == null) continue;
            if (!string.equals(CTSItemInfo.StringReturner())) continue;
            if (!CTSItemInfo.StringReturner().equals(CTSCancelEvent.CLICKED_MENU)) continue;

            inventory.setItem(19, itemStackA);
            inventory.setItem(20, itemStackB);
            inventory.setItem(21, itemStackC);
            inventory.setItem(28, itemStackD);
            inventory.setItem(29, itemStackE);
            inventory.setItem(30, itemStackF);
            inventory.setItem(37, itemStackG);
            inventory.setItem(38, itemStackH);
            inventory.setItem(39, itemStackI);

            inventory.setItem(32, ItemSlot());
            ItemStack itemStack = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + string + "." + CTSItemInfo.StringReturnerToItem());
            inventory.setItem(34, itemStack);
        }
        return inventory;
    }

    public static boolean MainMenuItemName() {

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            if (s == null) continue;
            if (CTSCancelEvent.CLICKED_MENU.equals(s)) {

                return true;
            }
        }
        return false;
    }

    public static boolean SubMenuItemName() {


        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (s == null) continue;

            for (String s1 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + s).getKeys(false)) {

                if (s1 == null) continue;
                if (CTSCancelEvent.CLICKED_MENU.equals(s1)) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean CraftMenuItemName() {

        for (String s : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (String s1 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + s).getKeys(false)) {

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + s + "." + s1))) {

                    return true;
                }

                for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                    if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString("CraftData." + s + "." + s1), mythicItem.getInternalName())) {

                        if (MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName()).isSimilar(CTSCancelEvent.CLICK_ITEM))
                            return true;
                    }
                }
            }
        }
        return false;
    }

    //下は動作確認
    public static boolean MainMenuClickItemList() {


        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu" + "." + string);

            if (CTSCancelEvent.CLICK_ITEM.isSimilar(itemStack)) {
                return true;
            }
        }
        return false;
    }

    //下は動作確認
    public static boolean SubMenuClickItemList() {

        for (String string : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            for (String string2 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu" + "." + string).getKeys(false)) {

                ItemStack itemStack = CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu" + "." + string + "." + string2);

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(itemStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    //下は動作確認
    public static String SubTitleReturner() {

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("MainMenu").getKeys(false)) {

            if (s == null) continue;

            if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("MainMenu." + s))) {

                return s;
            }
        }
        return "これをTitleにしないで";
    }

    //下は動作確認
    public static String CraftTitleReturner() {

        for (String s : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu").getKeys(false)) {

            if (s == null) continue;

            for (String s1 : CraftTableShop.getInstance().getMenuConfig().getConfig().getConfigurationSection("SubMenu." + s ).getKeys(false)) {

                if (s1 == null) continue;

                if (CTSCancelEvent.CLICK_ITEM.isSimilar(CraftTableShop.getInstance().getMenuConfig().getConfig().getItemStack("SubMenu." + s + "." + s1))) {

                    return s1;
                }
            }
        }
        return "これをTitleにしないで";
    }
}
