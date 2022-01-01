package my.plugins.testplugins.roketplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class Adder02 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            switch (args.length) {
                case 0:
                    sender.sendMessage("Invalid command.");
                    return false;
                case 1:
                    switch (args[0]){
                        case "diamonds":
                            ItemStack diamonds = new ItemStack(Material.DIAMOND_BLOCK);
                            diamonds.setAmount(64);

                            player.getInventory().addItem(diamonds);
                            return true;
                        case "golds":
                            ItemStack golds = new ItemStack(Material.GOLD_BLOCK);
                            golds.setAmount(64);

                            player.getInventory().addItem(golds);
                            return true;
                        case "irons":
                            ItemStack irons = new ItemStack(Material.IRON_BLOCK);
                            irons.setAmount(64);

                            player.getInventory().addItem(irons);
                            return true;
                        case "book":
                            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
                            BookMeta bm = (BookMeta) book.getItemMeta();

                            bm.addPage("testLore1\n", "testLore2\n", "testLore3\n");
                            bm.setAuthor("roket");
                            bm.setTitle("testTitle");
                            book.setItemMeta(bm);

                            ((Player) sender).getInventory().addItem(book);
                            return true;
                        default:
                            return false;
                    }
                case 2:
                    sender.sendMessage("[02]case2");
                    return true;
                default:
                    sender.sendMessage("[02]Too many arguments.");
                    return false;
            }
        } else if (!(sender instanceof Player)) {
            sender.sendMessage("플레이어만 해당 명령어를 사용할 수 있습니다.");
            return false;
        }
        return false;
    }
}
