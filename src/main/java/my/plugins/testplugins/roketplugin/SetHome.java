package my.plugins.testplugins.roketplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHome implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Location ploc = player.getLocation();

        if (!(player instanceof Player)) {
            sender.sendMessage("플레이어만 해당 명령어를 사용할 수 있습니다.");
            return false;
        } else {
            Location bloc = ploc.clone().add(0, -1, 0);

            if (bloc.getBlock().getType() == Material.AIR) {
                player.sendMessage(ChatColor.RED + "공중에서는 해당 명령어를 사용할 수 없습니다.");
                return false;
            } else {
                Location home = ploc;
                player.sendMessage("홈이 설정되었습니다.");
                return true;
            }
        }
    }
}
