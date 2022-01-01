package my.plugins.testplugins.roketplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class RoketPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled.");

        getCommand("adder1").setExecutor(new Adder01());
        getCommand("adder1").setTabCompleter(new TabExcutorTest());

        getCommand("adder2").setExecutor(new Adder02());
        getCommand("adder2").setTabCompleter(new TabExcutorTest());

        getCommand("custominventory").setExecutor(new CustomInvCommand());
        getServer().getPluginManager().registerEvents(new CustomInventory(), this);

        getCommand("sethome").setExecutor(new SetHome());
        getCommand("tph").setExecutor(new GoHome());
    }
    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled.");
    }
}
