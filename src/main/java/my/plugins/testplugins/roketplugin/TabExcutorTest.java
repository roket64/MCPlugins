package my.plugins.testplugins.roketplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class TabExcutorTest implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender,
                                      Command command,
                                      String alias,
                                      String[] args) {
        if (command.getName().equals("adder1")) {
            switch (args.length) {
                case 1:
                    return Arrays.asList("diamonds", "golds", "irons", "book");
                case 2:
                    return Arrays.asList("[1]case2-1", "[1]case2-2");
                default:
                    return null;
            }
        } else if (command.getName().equals("adder2")) {
            switch (args.length) {
                case 1:
                    return Arrays.asList("diamonds", "golds", "irons", "book");
                case 2:
                    return Arrays.asList("[2]case2-1", "[2]case2-2");
                default:
                    return null;
            }
        } else if (command.getName().equals("sethome")){
            return null;
        } else {
            return null;
        }
    }
}
