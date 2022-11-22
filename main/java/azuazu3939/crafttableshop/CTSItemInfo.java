package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;


public class CTSItemInfo {
    //完璧
    public static ItemStack ItemReturner(String itemString) {

        for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString("CraftData." + string + "." + itemString), mythicItem.getInternalName())) {

                    return MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName());
                }
            }
        }
        return CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack(itemString);
    }
    public static String StringReturner() {

        String s = null;

        FileConfiguration info = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig();

        for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (String string2 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + string).getKeys(false)) {

                for (String string3 : info.getConfigurationSection("CraftRecipe").getKeys(false)) {

                    if (string3 == null) continue;
                    if (!(string3.equals(string2))) continue;

                    return string;
                }
            }
        }
        return s;
    }

    public static String StringReturnerToItem() {

        String s = null;

        FileConfiguration info = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig();

        for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

            for (String string2 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + string).getKeys(false)) {

                for (String string3 : info.getConfigurationSection("CraftRecipe").getKeys(false)) {

                    if (string3 == null) continue;
                    if (!(string3.equals(string2))) continue;

                    return string2;
                }
            }
        }
        return s;
    }
}
