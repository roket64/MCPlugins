package my.plugins.testplugins.roketplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Objects;

public class CustomInventory implements Listener {
    private Inventory inv;

    public CustomInventory() {
        inv = Bukkit.createInventory(null, 27, "items");
        ItemStack bed = new ItemStack(Material.RED_BED, 1);
        ItemMeta bedMeta = bed.getItemMeta();
        bedMeta.setDisplayName("testName");
        bedMeta.setLore(Arrays.asList("testLore1\n", "testLore2\n"));
        bed.setItemMeta(bedMeta);

        inv.addItem(bed);
    }

    @EventHandler
    public void onOpenCustomInventory(OpenCustomInventory e) {
        e.player.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getInventory() != inv) {
            return;
        }
        e.setCancelled(true);
        ItemStack clickItem = e.getCurrentItem();
        if (clickItem == null || clickItem.getType() == Material.AIR) {
            return;
        } else if (Objects.requireNonNull(clickItem.getItemMeta()).hasDisplayName()) {
            Player player = (Player) e.getWhoClicked();
            player.sendMessage("Clicked the bed.");
            player.closeInventory();
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent e) {
        if (e.getInventory() == inv) {
            e.setCancelled(true);
        }
    }
}