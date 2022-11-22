package azuazu3939.crafttableshop;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Bukkit.getTicksPerAmbientSpawns;

public class CTSCommand implements CommandExecutor {

    String string;
    String type;
    String type2;
    Player playername;
    String Id;
    String set;

    //完成
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

        Player player = (Player) sender;
        if (!(player.hasPermission("crafttableshop.command.crafttableshop"))) {
            sender.sendMessage(ChatColor.RED + "権限がありません。");
            return true;
        }

        try {

            string = args[0];

            if (string.equals("reload") || string.equals("Reload") || string.equals("RELOAD")) {

                try {

                    CraftTableShop.getInstance().saveDefaultConfig();
                    CraftTableShop.getInstance().saveConfig();
                    CraftTableShop.getInstance().getSetUpConfig().saveConfig();
                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                    CraftTableShop.getInstance().getMenuConfig().saveConfig();
                    CraftTableShop.getInstance().getMenuConfig().reloadConfig();
                    CraftTableShop.getInstance().getCraftRecipeConfig().reloadConfig();
                    CraftTableShop.getInstance().getSetUpConfig().reloadConfig();
                    player.sendMessage(ChatColor.WHITE + "コンフィグをリロードしました。");
                    return true;

                } catch (Exception e) {
                    howToUse(player);
                    return true;
                }
            }

            if (string.equals("set") || string.equals("Set") || string.equals("SET")) {

                try {

                    type = args[1];
                    Id = args[2];
                    set = args[3];
                    type2 = args[4];

                    FileConfiguration info = CraftTableShop.getInstance().getCraftRecipeConfig().getConfig();

                    for (String string : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData").getKeys(false)) {

                        for (String string2 : CraftTableShop.getInstance().getSetUpConfig().getConfig().getConfigurationSection("CraftData." + string).getKeys(false)) {

                            if (!(Objects.equals(set, string) && Objects.equals(type, string2)) && (!Objects.equals(set, string) && Objects.equals(type, string2)) && (Objects.equals(set, string) && !Objects.equals(type, string2))) continue;

                            switch (Id) {
                                case "a":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".a", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".a." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "b":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".b", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".b." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "c":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".c", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".c." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "d":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".d", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".d." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "e":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".e", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".e." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "f":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".f", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".f." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "g":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".g", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".g." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "h":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".h", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".h." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                                case "i":
                                    if (!CraftTableShop.getInstance().getSetUpConfig().getConfig().contains("CraftData." + set + "." + type2)) {
                                        player.sendMessage(ChatColor.RED + type2 + "はCraftData.ymlに存在しません。");
                                    }
                                    info.set("CraftRecipe." + type + ".i", type2);
                                    player.sendMessage(ChatColor.GREEN + "登録しました。Data CraftRecipe." + type + ".i." + type2);
                                    CraftTableShop.getInstance().getCraftRecipeConfig().saveConfig();
                                    CraftTableShop.getInstance().saveConfig();
                                    return true;
                            }
                        }
                    }

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("setsubmenu") || string.equals("setSubMenu") || string.equals("SetSubMenu") || string.equals("SETSUBMENU")) {

                try {

                    type = args[1];
                    Id = args[2];

                    ItemStack itemStack = player.getInventory().getItemInMainHand();

                    if (itemStack.getType() == Material.AIR) {
                        player.sendMessage(ChatColor.RED + "そのアイテムは登録できません。");
                        return true;
                    }



                    CraftTableShop.getInstance().getMenuConfig().getConfig().set("SubMenu." + type + "." + Id, itemStack);
                    CraftTableShop.getInstance().getMenuConfig().saveConfig();
                    CraftTableShop.getInstance().saveConfig();

                    sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + Id + "という名前で" + type + "に登録しました。");
                    return true;

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }

            if (string.equals("setmainmenu") || string.equals("setMainMenu") || string.equals("SetMainMenu") || string.equals("SETMAINMENU")) {

                try {

                    type = args[1];

                    ItemStack itemStack = player.getInventory().getItemInMainHand();

                    if (itemStack.getType() == Material.AIR) {
                        player.sendMessage(ChatColor.RED + "そのアイテムは登録できません。");
                        return true;
                    }

                    CraftTableShop.getInstance().getMenuConfig().getConfig().set("MainMenu." + type, itemStack);
                    CraftTableShop.getInstance().getMenuConfig().saveConfig();
                    CraftTableShop.getInstance().saveConfig();

                    sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムをMainMenuの" + type + "として登録しました。");
                    return true;

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("add") || string.equals("Add") || string.equals("ADD")) {

                try {

                    type = args[1];
                    Id = args[2];


                    ItemStack itemStack = player.getInventory().getItemInMainHand();

                    if (itemStack.getType() == Material.AIR) {
                        player.sendMessage(ChatColor.RED + "そのアイテムは登録できません。");
                        return true;
                    }

                    CraftTableShop.getInstance().getSetUpConfig().getConfig().set("CraftData." + Id + "." + type, itemStack);
                    CraftTableShop.getInstance().getSetUpConfig().saveConfig();
                    CraftTableShop.getInstance().getMenuConfig().saveConfig();
                    CraftTableShop.getInstance().saveConfig();

                    sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "という名前で" + Id + "に登録しました。");
                    return true;

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }

            if (string.equals("menu") || string.equals("Menu") || string.equals("MENU")) {

                try {

                    type = args[1];

                    playername = getPlayer(type);

                    if (playername == null) {
                        sender.sendMessage("このプレイヤーはログインしていません。");
                        return true;
                    }

                    CTSMenu.openMenuMain(playername);
                    return true;

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }

            if (string.equals("get") || string.equals("Get") || string.equals("GET") || string.equals("give") || string.equals("Give") || string.equals("GIVE")) {

                try {

                    type = args[1];
                    set = args[2];
                    Id = args[3];

                    playername = getPlayer(type);

                    if (playername == null) {
                        sender.sendMessage("このプレイヤーはログインしていません。");
                        return true;
                    }

                    if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet("CraftData." + set + "." + Id))) {
                        playername.sendMessage(ChatColor.RED + set + "." + Id + "というアイテムは登録されていません。");
                        return true;
                    }

                    ItemStack itemStack = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack("CraftData." + set + "." + Id);

                    playername.getInventory().addItem(Objects.requireNonNull(itemStack));
                    playername.sendMessage(ChatColor.GREEN + set + "." + Id + "を取得しました。");
                    return true;
                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("removesub") || string.equals("removeSub") || string.equals("RemoveSub") || string.equals("REMOVESUB")) {

                try {

                    type = args[1];
                    Id = args[2];

                    if (CraftTableShop.getInstance().getMenuConfig().getConfig().isSet("SubMenu." + type)) {

                        player.sendMessage(ChatColor.GREEN + "対象を削除しました。");
                        CraftTableShop.getInstance().getMenuConfig().getConfig().set("SubMenu." + type + "." + Id, null);
                        CraftTableShop.getInstance().getMenuConfig().saveConfig();
                        CraftTableShop.getInstance().saveConfig();
                    }
                    if (CraftTableShop.getInstance().getMenuConfig().getConfig().isSet("SubMenu")) {

                        if (!Id.equals("true")) return true;

                        player.sendMessage(ChatColor.GREEN + "対象をグループごと削除しました。");
                        CraftTableShop.getInstance().getMenuConfig().getConfig().set("SubMenu", null);
                        CraftTableShop.getInstance().getMenuConfig().saveConfig();
                        CraftTableShop.getInstance().saveConfig();
                    }

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("removemain") || string.equals("removeMain") || string.equals("RemoveMain") || string.equals("REMOVEMAIN")) {

                try {
                    type = args[1];

                    if (CraftTableShop.getInstance().getMenuConfig().getConfig().isSet("MainMenu." + type)) {

                        player.sendMessage(ChatColor.GREEN + "対象を削除しました。");
                        CraftTableShop.getInstance().getMenuConfig().getConfig().set("MainMenu." + type, null);
                        CraftTableShop.getInstance().getMenuConfig().saveConfig();
                        CraftTableShop.getInstance().saveConfig();
                    }
                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("remove") || string.equals("Remove") || string.equals("REMOVE")) {

                try {

                    type = args[1];
                    Id = args[2];

                    switch (Id) {
                        case "a":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".a", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "b":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".b", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "c":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".c", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "d":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".d", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "e":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".e", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "f":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".f", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "g":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".g", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "h":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".h", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "i":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type + ".i", null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                        case "true":
                            CraftTableShop.getInstance().getConfig().set("CraftData." + type, null);
                            player.sendMessage(ChatColor.GREEN + "対象をクラフトタイトルを削除しました。");
                            CraftTableShop.getInstance().saveDefaultConfig();
                            CraftTableShop.getInstance().saveConfig();
                            return true;
                    }

                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            return true;
        } catch (Exception e) {

            howToUse(player);
            return true;
        }
    }

    private void howToUse(Player sender) {

        sender.sendMessage("正しく入力しよう！");
        sender.sendMessage("/cts add <ItemName> <ItemPath> メインハンドアイテムを反映。最初にやるやつ");
        sender.sendMessage("/cts reload");
        sender.sendMessage("/cts menu <name>");
        sender.sendMessage("/cts get <name> <ItemPath> <ItemName> addのデータ参照で取得。");
        sender.sendMessage("/cts set <ItemName1> <a-i> <ItemPath> <ItemName2> addのデータが参照で反映。");
        sender.sendMessage("/cts setMainMenu <ItemPath> メインハンドアイテムを反映。");
        sender.sendMessage("/cts setSubMenu <ItemPath> <TitleName> メインハンドアイテムを反映。TitleNameは固有名で。");
        sender.sendMessage("/cts remove <ItemPath> [<a-i> or true] レシピデータを削除。");
        sender.sendMessage("/cts removeMain <ItemPath> MainMenuのデータを削除。");
        sender.sendMessage("/cts removeSub <ItemPath> <TitleName or true>SubMenuのデータを削除。");
        sender.sendMessage("trueで<ItemPath>ごと削除");
        sender.sendMessage("一連流れのクラフトにする場合は全てItemPathは同じにしてください。");
        sender.sendMessage("ItemNameも1~10で記入すること推奨。");
    }
}
