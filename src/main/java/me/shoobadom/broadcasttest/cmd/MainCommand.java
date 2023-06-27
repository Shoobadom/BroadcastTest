package me.shoobadom.broadcasttest.cmd;

import me.shoobadom.broadcasttest.file.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class MainCommand implements CommandExecutor {
    private final String pref = FileManager.getPrefix();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("broadcast")) {
            return true;
        }
        if (args.length < 2) {
            sender.sendMessage(ChatColor.RED + "You need more arguments: /broadcast <perm> <msg>");
            return true;
        }

        String[] mesAsA = Arrays.copyOfRange(args, 1, args.length );
        StringBuilder mes = new StringBuilder();
        for (String s : mesAsA) {
            mes.append(" "+s);
        }
        String m = mes.toString();

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.hasPermission(args[0])) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&',pref+m));
            }
        }
        return true;
    }
}
