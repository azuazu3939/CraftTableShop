package azuazu3939.crafttableshop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class CraftTableShop extends JavaPlugin {

    private static CraftTableShop ctsInstance;

    @Override
    public void onLoad() {
        ctsInstance = this;
    }

    @Override
    public void onEnable() {

        this.getCommand("crafttableshop").setExecutor(new CTSCommand());

        Bukkit.getPluginManager().registerEvents(new CTSCancelEvent(), this);

        this.saveDefaultConfig();
        this.saveConfig();
    }

    @NotNull
    public static CraftTableShop getInstance() {
        return Objects.requireNonNull(ctsInstance, "CraftTableShop is not loaded!");
    }
}
