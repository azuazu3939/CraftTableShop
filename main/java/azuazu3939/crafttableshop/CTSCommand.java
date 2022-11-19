package azuazu3939.crafttableshop;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.items.MythicItem;
import io.lumine.xikage.mythicmobs.util.jnbt.CompoundTag;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static org.bukkit.Bukkit.getPlayer;

public class CTSCommand implements CommandExecutor {

    String string;
    String type;
    Player playername;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;
        if (!(player.hasPermission("crafttableshop.command.crafttableshop"))) {
            sender.sendMessage(ChatColor.RED + "権限がありません。");
            return true;
        }

        try {
            string = args[0];
            if (string.equals("reload") || string.equals("Reload") || string.equals("RELOAD")) {

                CraftTableShop.getInstance().saveConfig();
                CraftTableShop.getInstance().saveDefaultConfig();
                CraftTableShop.getInstance().reloadConfig();
                player.sendMessage(ChatColor.WHITE + "コンフィグをリロードしました。");
                return true;
            }
        } catch (Exception e) {
            sender.sendMessage("正しく入力しよう！");
            return true;
        }

        try {
            string = args[0];
            type = args[1];
        } catch (Exception e) {
            sender.sendMessage("正しく入力しよう！");
            return true;
        }

        if (string.equals("add") || string.equals("Add") || string.equals("ADD")) {

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
                    CraftTableShop.getInstance().saveConfig();
                    CraftTableShop.getInstance().saveDefaultConfig();

                    sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "という名前で登録しました。(MythicMobs)");
                    return true;
                }
            }
            CraftTableShop.getInstance().getSetUpConfig().getConfig().set(type, itemStack);
            CraftTableShop.getInstance().saveConfig();
            CraftTableShop.getInstance().saveDefaultConfig();

            sender.sendMessage(ChatColor.GREEN + "手に持っているアイテムを" + type + "という名前で登録しました。");
            return true;
        }

        if (string.equals("get") || string.equals("Get") || string.equals("GET") || string.equals("give") || string.equals("Give") || string.equals("GIVE")) {

            if (!(CraftTableShop.getInstance().getSetUpConfig().getConfig().isSet(type))) {
                player.sendMessage(ChatColor.RED + type + "というアイテムは登録されていません。");
                return true;
            }

            ItemStack itemStack = CraftTableShop.getInstance().getSetUpConfig().getConfig().getItemStack(type);

            for (MythicItem mythicItem : MythicMobs.inst().getItemManager().getItems()) {

                if (Objects.equals(CraftTableShop.getInstance().getSetUpConfig().getConfig().getString(type), mythicItem.getInternalName())) {

                    player.getInventory().addItem(MythicMobs.inst().getItemManager().getItemStack(mythicItem.getInternalName()));
                    sender.sendMessage(ChatColor.GREEN + type + "を取得しました。(MythicMobs)");
                    return true;
                }
            }
            player.getInventory().addItem(Objects.requireNonNull(itemStack));
            sender.sendMessage(ChatColor.GREEN + type + "を取得しました。");
            return true;

        }
        try {
            playername = getPlayer(string);
            if (playername == null) {
                sender.sendMessage("このプレイヤーはログインしていません。");
                return true;
            }

        } catch (Exception e) {
            sender.sendMessage("このプレイヤーはログインしていません。");
            return true;
        }
        if (type.equals("menu") || type.equals("Menu") || type.equals("MENU")) {
            CTSMenu.openMenuMain(playername);
            return true;
        }

        return true;

    }
}
