package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.skills.SkillTrigger;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class CheckHasItems {

    //だいたい完成
    public static boolean hasItemTestA(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".a");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }


    public static boolean hasItemTestB(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".b");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestC(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".c");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestD(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".d");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestE(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".e");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestF(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".f");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestG(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".g");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestH(String type) {

        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".h");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }

    public static boolean hasItemTestI( String type) {


        String s = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig().getString("CraftRecipe." + CTSItemInfo.StringReturnerToItem() + ".i");

        int i = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + type + "." + s).getAmount();
        if (!(CTSCancelEvent.CLICK_PLAYER.getInventory().contains(CTSItemInfo.ItemReturner(s)))) return false;

        for (ItemStack itemStack : CTSCancelEvent.CLICK_PLAYER.getInventory().getContents()) {

            if (itemStack == null) continue;

            if (!(CTSItemInfo.ItemReturner(s).isSimilar(itemStack))) continue;
            int amount = itemStack.getAmount();

            if (!(amount < i)) return true;
        }
        return false;
    }
}
