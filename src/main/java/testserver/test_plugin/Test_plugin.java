package testserver.test_plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands() {
        
    }
}
