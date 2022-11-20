package azuazu3939.crafttableshop;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;

public final class CraftTableShop extends JavaPlugin {

    private static CraftTableShop instance;
    private File customConfigFile;
    private final SetUpConfig craftDataConfig = new SetUpConfig(this, "CraftData.yml", "CTSData");
    private final SetUpConfig menuConfig = new SetUpConfig(this, "MenuData.yml", "CTSData");

    public CraftTableShop() {instance = this;}

    public static CraftTableShop getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        createCustomConfig();
        createMenuConfig();
        craftDataConfig.create();
        saveDefaultConfig();
        saveConfig();

        Objects.requireNonNull(getServer().getPluginCommand("crafttableshop")).setExecutor(new CTSCommand());

        getServer().getPluginManager().registerEvents(new CTSCancelEvent(), this);
    }

    private void createCustomConfig() {

        customConfigFile = new File(getDataFolder(), "CraftData.yml");

        if (customConfigFile.exists()) {

            saveResource("CraftData.yml", true);
        }
    }

    private void createMenuConfig() {

        customConfigFile = new File(getDataFolder(), "MenuData.yml");

        if (customConfigFile.exists()) {

            saveResource("MenuData.yml", true);
        }
    }

    public SetUpConfig getSetUpConfig() {
        return craftDataConfig;
    }

    public SetUpConfig getMenuConfig() {
        return menuConfig;
    }


    @Override
    public void onDisable() {
    }
}
