package azuazu3939.crafttableshop;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CraftTableShop extends JavaPlugin {

    private static CraftTableShop instance;

    public CraftTableShop() {
        instance = this;}

    public static CraftTableShop getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        saveDefaultConfig();
        saveConfig();

        Objects.requireNonNull(getServer().getPluginCommand("crafttableshop")).setExecutor(new CTSCommand());

        getServer().getPluginManager().registerEvents(new CTSCancelEvent(), this);
    }
}
