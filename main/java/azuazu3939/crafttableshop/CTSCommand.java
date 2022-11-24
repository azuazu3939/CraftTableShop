package azuazu3939.crafttableshop;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Bukkit.getPlayer;

public class CTSCommand implements CommandExecutor {

    String string;
    String type;
    Player playername;
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

                    reload();
                    player.sendMessage(ChatColor.WHITE + "コンフィグをリロードしました。");
                    return true;

                } catch (Exception e) {
                    howToUse(player);
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

                    craftTableShop.getInstance().getConfig().set("MainCraft." + type + ".Item", itemStack);
                    reload();

                    sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "に登録しました。");
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

                    CTSMenu.openMenu(playername);
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

                    playername = getPlayer(type);

                    if (playername == null) {
                        sender.sendMessage("このプレイヤーはログインしていません。");
                        return true;
                    }

                    if (!(craftTableShop.getInstance().getConfig().isSet("MainCraft." + set + ".Item"))) {
                        playername.sendMessage(ChatColor.RED + set + "は登録されていません。");
                        return true;
                    }

                    ItemStack itemStack = craftTableShop.getInstance().getConfig().getItemStack("MainCraft." + set + ".Item");

                    playername.getInventory().addItem(itemStack);
                    playername.sendMessage(ChatColor.GREEN + set + "内のアイテムを取得しました。");
                    return true;
                } catch (Exception e) {

                    howToUse(player);
                    return true;
                }
            }
            if (string.equals("remove") || string.equals("Remove") || string.equals("REMOVE")) {

                try {

                    type = args[1];

                    craftTableShop.getInstance().getConfig().set(type, null);
                    reload();
                    return true;

                } catch (Exception e) {

                    player.sendMessage(ChatColor.RED + type + "という名前のデータがありません。");
                    howToUse(player);
                    return true;
                }
            }
        } catch (Exception e) {

            howToUse(player);
            return true;
        }
        return false;
    }

    private void howToUse(Player sender) {

        sender.sendMessage("正しく入力しよう！");
        sender.sendMessage("/cts add <ItemPath> メインハンドアイテムを反映。最初にやるやつ");
        sender.sendMessage("/cts reload");
        sender.sendMessage("/cts menu <name>");
        sender.sendMessage("/cts get <name> <ItemPath>");
        sender.sendMessage("/cts remove <ItemPath>");
    }

    private void reload() {

        craftTableShop.getInstance().saveConfig();
        craftTableShop.getInstance().saveDefaultConfig();
        craftTableShop.getInstance().reloadConfig();
    }
}
