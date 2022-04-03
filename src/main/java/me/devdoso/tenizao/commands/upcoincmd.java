package me.devdoso.tenizao.commands;

import me.devdoso.tenizao.utils.IntegerCheck;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.devdoso.tenizao.items.ItemManager.upcoin;

public class upcoincmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (sender instanceof Player){
            if (cmd.getName().equalsIgnoreCase("giveupcoin")) {

                // /giveupcoin <Player> - Gives the player one Upgrade Coin.
                if (args.length > 0) {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    target.getInventory().addItem(upcoin);
                }else{
                    sender.sendMessage("§cYou need to specify a player!");
                }
                if (args.length > 1){
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (IntegerCheck.isInteger(args[1])) {
                        int amount = Integer.parseInt(args[1]);
                        for (int i = 0; i < amount - 1; i++) {
                            target.getInventory().addItem(upcoin);
                        }
                    }else{
                        sender.sendMessage("§cYou need to provide a valid number!");
                    }
                }
            }
        }
        return true;
    }
}
