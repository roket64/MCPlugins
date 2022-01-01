package my.plugins.testplugins.roketplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class VimPrac implements TabExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("adder1")){
           switch (args.length){
               case 0:
                   return Arrays.asList("case1", "case2");
               case 1:
                   return Arrays.asList("case1", "case2");
               case 2:
                   return Arrays.asList("case1", "case2");
               default:
                   return null;
           }
        }else {
            return null;
        }
    }
}