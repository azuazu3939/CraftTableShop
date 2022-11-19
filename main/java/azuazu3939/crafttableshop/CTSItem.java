package azuazu3939.crafttableshop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CTSItem {

    static Material other = Material.valueOf(CraftTableShop.getInstance().getConfig().getString("other", ""));
    static Material free_field = Material.valueOf(CraftTableShop.getInstance().getConfig().getString("free_field", ""));

    static int a = 19;
    static int b = 20;
    static int c = 21;
    static int d = 28;
    static int e = 29;
    static int f = 30;
    static int g = 37;
    static int h = 38;
    static int i = 39;

    public static ItemStack ItemSlot() {

        ItemStack itemStack = new ItemStack(other);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "");
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack ItemFF() {

        ItemStack itemStack = new ItemStack(free_field);
        ItemMeta meta = itemStack.getItemMeta();
        String[] lore = {ChatColor.WHITE + "これをクリックでFFアイテムのクラフトページ表示します。",
                ChatColor.WHITE + "作りたいアイテムをクリックでクラフトページへ。",
                ChatColor.WHITE + "素材が足りている場合は作成を押すとクラフトできます。"};
        meta.setDisplayName(ChatColor.AQUA + "FFクラフト");
        meta.setLore(Arrays.asList(lore));

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack ItemTest() {

        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Testクラフト");

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack ItemStackTest() {

        return CTSItemInfo.ItemReturner("ぺ");
    }

    public static ItemStack ItemStackTest2() {

        return CTSItemInfo.ItemReturner("ぼ");
    }

    private static ItemStack ItemStackTest3() {

        return CTSItemInfo.ItemReturner("ぷ");
    }

    public static Inventory MainMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "CTSMenu");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        inventory.setItem(10, ItemFF());

        return inventory;
    }

    public static Inventory FFMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "FFMenu");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        inventory.setItem(10, ItemTest());

        return inventory;
    }

    public static Inventory TestMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, "TestItem");

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, ItemSlot());
        }

        inventory.setItem(a, ItemStackTest());
        inventory.setItem(b, ItemStackTest2());
        inventory.setItem(c, ItemStackTest());
        inventory.setItem(d, ItemStackTest2());
        inventory.setItem(e, ItemStackTest());
        inventory.setItem(f, ItemStackTest2());
        inventory.setItem(g, ItemStackTest());
        inventory.setItem(h, ItemStackTest2());
        inventory.setItem(i, ItemStackTest());

        inventory.setItem(34, ItemStackTest3());

        return inventory;
    }
}
