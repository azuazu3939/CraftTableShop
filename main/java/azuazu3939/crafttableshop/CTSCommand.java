package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import io.lumine.xikage.mythicmobs.util.jnbt.CompoundTag;
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

public class CTSCommand implements CommandExecutor {

    String string;
    String type;
    Player playername;
    String Id;
    String set;
    int amount;
  //完成
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;
        if (!(player.hasPermission("crafttableshop.command.crafttableshop"))) {
            sender.sendMessage(ChatColor.RED + "権限がありません。");
            return true;
        }

        string = args[0];


        if (string.equals("reload") || string.equals("Reload") || string.equals("RELOAD")) {

            try {

                CraftTableShop.getInstance().saveConfig();
                CraftTableShop.getInstance().saveDefaultConfig();
                CraftTableShop.getInstance().reloadConfig();
                player.sendMessage(ChatColor.WHITE + "コンフィグをリロードしました。");
                return true;

            } catch (Exception e) {

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
                return true;
            }
        }

        if (string.equals("set") || string.equals("Set") || string.equals("SET")) {

            try {

                type = args[1];
                Id = args[2];
                set = args[3];
                amount = Integer.parseInt(args[4]);


                FileConfiguration info = CraftTableShop.getInstance().getConfig();

                switch (Id) {
                    case "a":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".a." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "b":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".b." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "c":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".c." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "d":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".d." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "e":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".e." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "f":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".f." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "g":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".g." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "h":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".h." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                    case "i":
                        if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(set))) {
                            player.sendMessage(ChatColor.RED + set + "はCraftData.ymlに存在しません。");
                            return true;
                        }
                        info.set(type + ".i." + set, amount);
                        player.sendMessage(ChatColor.GREEN + "登録しました。Data " + type + "." + "a." + set + "." + amount);
                        CraftTableShop.getInstance().saveConfig();
                        CraftTableShop.getInstance().saveDefaultConfig();
                        return true;
                }
            } catch (Exception e) {

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
                return true;
            }
        }

        if (string.equals("add") || string.equals("Add") || string.equals("ADD")) {

            try {

                type = args[1];


                ItemStack itemStack = player.getInventory().getItemInMainHand();

                if (itemStack.getType() == Material.AIR) {
                    player.sendMessage(ChatColor.RED + "そのアイテムは登録できません。");
                    return true;
                }

                CompoundTag tag = MythicMobs.inst().getVolatileCodeHandler().getItemHandler().getNBTData(itemStack);

                for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                    if (tag.containsKey("MYTHIC_TYPE")) {
                        String mm = mythicItem.getInternalName();
                        if (!tag.getString("MYTHIC_TYPE").equals(mm)) continue;

                        CraftTableShop.getInstance().getSetUpConfig().getConfig().set(type, mm);
                        CraftTableShop.getInstance().getSetUpConfig().saveConfig();
                        CraftTableShop.getInstance().saveConfig();

                        sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "という名前で登録しました。(MythicMobs)");
                        return true;
                    }
                }
                CraftTableShop.getInstance().getSetUpConfig().getConfig().set(type, itemStack);
                CraftTableShop.getInstance().getSetUpConfig().saveConfig();
                CraftTableShop.getInstance().saveConfig();

                sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "という名前で登録しました。");
                return true;

            } catch (Exception e) {

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
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

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
                return true;
            }
        }

        if (string.equals("get") || string.equals("Get") || string.equals("GET") || string.equals("give") || string.equals("Give") || string.equals("GIVE")) {

            try {

                type = args[1];
                Id = args[2];

                playername = getPlayer(type);

                if (playername == null) {
                    sender.sendMessage("このプレイヤーはログインしていません。");
                    return true;
                }

                if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(Id))) {
                    playername.sendMessage(ChatColor.RED + Id + "というアイテムは登録されていません。");
                    return true;
                }

                ItemStack itemStack = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack(Id);

                for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                    if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString(Id), mythicItem.getInternalName())) {

                        playername.getInventory().addItem(MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName()));
                        playername.sendMessage(ChatColor.GREEN + Id + "を取得しました。(MythicMobs)");
                        return true;
                    }
                }

                playername.getInventory().addItem(Objects.requireNonNull(itemStack));
                playername.sendMessage(ChatColor.GREEN + Id + "を取得しました。");
                return true;
            } catch (Exception e) {

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
                return true;
            }
        }
        if (string.equals("remove") || string.equals("Remove") || string.equals("REMOVE")) {

            try {

                type = args[1];
                Id = args[2];

                switch (Id) {
                    case "a":
                        CraftTableShop.getInstance().getConfig().set(type + ".a", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "b":
                        CraftTableShop.getInstance().getConfig().set(type + ".b", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "c":
                        CraftTableShop.getInstance().getConfig().set(type + ".c", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "d":
                        CraftTableShop.getInstance().getConfig().set(type + ".d", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "e":
                        CraftTableShop.getInstance().getConfig().set(type + ".e", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "f":
                        CraftTableShop.getInstance().getConfig().set(type + ".f", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "g":
                        CraftTableShop.getInstance().getConfig().set(type + ".g", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "h":
                        CraftTableShop.getInstance().getConfig().set(type + ".h", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "i":
                        CraftTableShop.getInstance().getConfig().set(type + ".i", null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトスロットを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                    case "true":
                        CraftTableShop.getInstance().getConfig().set(type, null);
                        player.sendMessage(ChatColor.GREEN + "対象をクラフトタイトルを削除しました。");
                        CraftTableShop.getInstance().saveDefaultConfig();
                        CraftTableShop.getInstance().saveConfig();
                        return true;
                }

            } catch (Exception e) {

                sender.sendMessage("正しく入力しよう！");
                sender.sendMessage("/cts reload");
                sender.sendMessage("/cts set <string:path1> <a-i> <string:path2> <amount>");
                sender.sendMessage("/cts add <string:path>");
                sender.sendMessage("/cts menu <name>");
                sender.sendMessage("/cts get <name> <string:path>");
                sender.sendMessage("/cts remove <string:path1> [<string:path2> or true]");
                sender.sendMessage("trueで<string:path1>を削除");
                return true;
            }
        }
        return true;
    }
}
