package me.hugeadventure.motdmanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class MotdManager extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MotdManager Has Sucessfully enabled");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("MotdManager Has Sucessfully Been Disabled");
        // Plugin shutdown logic
    }
}
