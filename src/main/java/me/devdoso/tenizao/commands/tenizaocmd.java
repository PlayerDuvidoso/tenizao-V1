package me.devdoso.tenizao.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.devdoso.tenizao.items.ItemManager.tenizao1;

public class tenizaocmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /givetenizao - gives tenizao to player
        if (command.getName().equalsIgnoreCase("givetenizao")){
            if (sender instanceof Player && args.length <= 0){
                Player p = (Player) sender;

                p.getInventory().addItem(tenizao1);
                p.sendMessage("§aYou Received Tenizão T1!");
            }
            if (args.length > 0){
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target != null){
                    target.getInventory().addItem(tenizao1);
                    target.sendMessage("§aYou Received Tenizão T1!");
                    sender.sendMessage("§aItems were given!");
                }else{
                    sender.sendMessage("§cInvalid Player!");
                }
            }
            if (!(sender instanceof Player) && args.length <= 0){
                sender.sendMessage("§cYou need to specify one player!");
            }
        }
        return true;
    }
}
