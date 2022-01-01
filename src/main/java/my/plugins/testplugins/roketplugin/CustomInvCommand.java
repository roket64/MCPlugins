package my.plugins.testplugins.roketplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CustomInvCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
           OpenCustomInventory event = new OpenCustomInventory((Player)sender);
            Bukkit.getPluginManager().callEvent(event);
            return true;
        }
        else if (!(sender instanceof  Player)){
            sender.sendMessage("Only players can use this command.");
            return false;
        }
        return false;
    }
}
