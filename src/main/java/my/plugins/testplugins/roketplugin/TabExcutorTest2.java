package my.plugins.testplugins.roketplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class TabExcutorTest2 implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender,
                                      Command command,
                                      String alias,
                                      String[] args) {
        if (command.getName().equals("adder01")) {
            if (args.length == 1) {
                return Arrays.asList("[1]case0-1", "[1]case0-2");
            } else if (args.length == 2) {
                return Arrays.asList("[1]case2-1", "[1]case2-2");
            } else {
                return null;
            }
        } else if (command.getName().equals("adder02")) {
            if (args.length == 1) {
                return Arrays.asList("[2]case1-1", "[2]case1-2");
            } else if (args.length == 2) {
                return Arrays.asList("[2]case2-1", "[2]case2-2");
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
