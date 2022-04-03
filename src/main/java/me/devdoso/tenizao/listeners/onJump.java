package me.devdoso.tenizao.listeners;

import me.devdoso.tenizao.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class onJump implements Listener {

    @EventHandler
    public void onJump(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        if (p.getInventory().getBoots() != null) {
            if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(ItemManager.tenizao1.getItemMeta().getDisplayName())) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 10, 1));
            }
            if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(ItemManager.tenizao2.getItemMeta().getDisplayName())) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 10, 3));
            }

        }
    }
}
