package me.devdoso.tenizao.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;


import static me.devdoso.tenizao.items.ItemManager.*;

public class onSneak implements Listener {

    @EventHandler
    public void onPickupGold(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if (p.getInventory().getBoots() != null){
            PlayerInventory inventory = p.getInventory();
            ItemStack playerBoots = inventory.getBoots();

            if (p.getInventory().containsAtLeast(upcoin, 10) && playerBoots.getItemMeta().getLore().equals(tenizao1.getItemMeta().getLore())){
                inventory.setBoots(tenizao2);
                for (int i = 0; i < 10; i++){
                    inventory.removeItem(upcoin);
                }
                p.sendMessage("§aTenizão has been upgraded to tier 2");
            }
        }
    }
}
