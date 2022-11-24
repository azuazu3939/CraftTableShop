package azuazu3939.crafttableshop;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class craftTableShop extends JavaPlugin {

    private static craftTableShop instance;

    public craftTableShop() {
        instance = this;}

    public static craftTableShop getInstance() {
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
