package me.devdoso.tenizao.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack tenizao1;
    public static ItemStack tenizao2;
    public static ItemStack upcoin;

    public static void init(){
        createTenizao1();
        createTenizao2();
        createUpcoin();
    }

    private static void createTenizao1(){
        ItemStack item = new ItemStack(Material.GOLD_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Tenizão T1");
        List<String> lore = new ArrayList<>();
        lore.add("§7Tenizão grants you jump boost!");
        lore.add("§7Tier 1 - Jump Boost 2");
        meta.setLore(lore);
        meta.spigot().setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        tenizao1 = item;
    }
    private static void createTenizao2(){
        ItemStack item = new ItemStack(Material.GOLD_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Tenizão T2");
        List<String> lore = new ArrayList<>();
        lore.add("§7Tenizão grants you jump boost!");
        lore.add("§7Tier 2 - Jump Boost 4");
        meta.setLore(lore);
        meta.spigot().setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        tenizao2 = item;
    }
    private static void createUpcoin(){
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Upgrade Coin");
        List<String> lore = new ArrayList<>();
        lore.add("§7This coin is used to upgrade Tenizão!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        upcoin = item;
    }
}
