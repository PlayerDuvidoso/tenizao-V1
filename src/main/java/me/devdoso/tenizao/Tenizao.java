package me.devdoso.tenizao;

import me.devdoso.tenizao.commands.tenizaocmd;
import me.devdoso.tenizao.commands.upcoincmd;
import me.devdoso.tenizao.items.ItemManager;
import me.devdoso.tenizao.listeners.onJump;
import me.devdoso.tenizao.listeners.onSneak;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tenizao extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Tenizao]: Has Started!");
        ItemManager.init();



        getServer().getPluginManager().registerEvents(new onJump(), this);
        getServer().getPluginManager().registerEvents(new onSneak(), this);

        getCommand("givetenizao").setExecutor(new tenizaocmd());
        getCommand("uptenizao").setExecutor(new tenizaocmd());
        getCommand("giveupcoin").setExecutor(new upcoincmd());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
