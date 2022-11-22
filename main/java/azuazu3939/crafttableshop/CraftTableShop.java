package azuazu3939.crafttableshop;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;

public final class CraftTableShop extends JavaPlugin {

    private static CraftTableShop instance;
    private File customConfigFile;
    private final SetUpConfig craftDataConfig = new SetUpConfig(this, "CraftData.yml", "CTSData");
    private final SetUpConfig menuConfig = new SetUpConfig(this, "MenuData.yml", "CTSData");
    private final SetUpConfig recipeConfig = new SetUpConfig(this, "CraftRecipe.yml", "CTSData");

    public CraftTableShop() {
        instance = this;}

    public static CraftTableShop getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        craftDataConfig.create();
        menuConfig.create();
        recipeConfig.create();

        createCustomConfig();
        createMenuConfig();
        createRecipeConfig();
        craftDataConfig.saveDefaultConfig();
        menuConfig.saveDefaultConfig();
        recipeConfig.saveDefaultConfig();

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

    private void createRecipeConfig() {

        customConfigFile = new File(getDataFolder(), "CraftRecipe.yml");

        if (customConfigFile.exists()) {

            saveResource("CraftRecipe.yml", true);
        }
    }

    public SetUpConfig getSetUpConfig() {
        return craftDataConfig;
    }

    public SetUpConfig getMenuConfig() {
        return menuConfig;
    }

    public SetUpConfig getCraftRecipeConfig() {
        return recipeConfig;
    }

    @Override
    public void onDisable() {
    }
}
