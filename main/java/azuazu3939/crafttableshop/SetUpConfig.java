package azuazu3939.crafttableshop;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class SetUpConfig {
    private final CraftTableShop plugin;
    private final String path;
    private final String folderpath;
    private File file;
    private FileConfiguration config;

    public SetUpConfig(CraftTableShop plugin, String path, String folder) {
        this.plugin = plugin;
        this.path = path;
        this.folderpath = folder;
        this.file = null;
        this.config = null;
    }

    public void create() {
        this.file = new File(plugin.getDataFolder() + File.separator + this.folderpath, this.path);
        if(!this.file.exists()) {
            getConfig().options().copyDefaults(true);
            saveConfig();
        }
    }

    public FileConfiguration getConfig() {
        if(this.config == null) {
            reloadConfig();
        }
        return this.config;
    }

    public void reloadConfig() {
        if(this.config == null) {
            this.file = new File(plugin.getDataFolder() + File.separator + this.folderpath, this.path);
        }
        this.config = YamlConfiguration.loadConfiguration(this.file);
    }

    public void saveConfig() {
        try {
            this.config.save(this.file);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public void saveDefaultConfig() {
        if(this.file == null) {
            this.file = new File(plugin.getDataFolder() + File.separator + this.folderpath, this.path);
        }
        if(!this.file.exists()) {
            plugin.saveResource(this.path, false);
        }
    }

    public String getPath() {
        return this.path;
    }

    public String getFolderPath() {
        return folderpath;
    }
}
