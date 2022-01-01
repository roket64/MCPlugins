package my.plugins.testplugins.roketplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class Adder01 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                sender.sendMessage("Invalid command.");
                return false;
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("diamonds")) {
                    ItemStack diamonds = new ItemStack(Material.DIAMOND_BLOCK);
                    diamonds.setAmount(64);

                    player.getInventory().addItem(diamonds);
                    return true;
                } else if (args[0].equalsIgnoreCase("golds")) {
                    ItemStack golds = new ItemStack(Material.GOLD_BLOCK);
                    golds.setAmount(64);

                    player.getInventory().addItem(golds);
                    return true;
                } else if (args[0].equalsIgnoreCase("irons")) {
                    ItemStack irons = new ItemStack(Material.IRON_BLOCK);
                    irons.setAmount(64);

                    player.getInventory().addItem(irons);
                    return true;
                } else if (args[0].equalsIgnoreCase("book")) {
                    ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
                    BookMeta bm = (BookMeta) book.getItemMeta();

                    bm.addPage("testLore1\n", "testLore2\n", "testLore3");
                    bm.setAuthor("roket");
                    bm.setTitle("testTitle");
                    book.setItemMeta(bm);

                    ((Player) sender).getInventory().addItem(book);

                } else {
                    sender.sendMessage("Invalid command.");
                    return false;
                }
            } else if (args.length == 2) {
                sender.sendMessage("[01]case2");
                return true;
            } else {
                sender.sendMessage("[01]Too many arguments.");
                return false;
            }
        } else if (!(sender instanceof Player)) {
            sender.sendMessage("플레이어만 해당 명령어를 사용할 수 있습니다.");
            return false;
        }
        return false;
    }
}
