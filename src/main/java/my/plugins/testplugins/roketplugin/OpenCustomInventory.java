package my.plugins.testplugins.roketplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class OpenCustomInventory extends Event {
    public static final HandlerList handlers = new HandlerList();
    public Player player;

    public OpenCustomInventory(Player player) {
        this.player = player;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
