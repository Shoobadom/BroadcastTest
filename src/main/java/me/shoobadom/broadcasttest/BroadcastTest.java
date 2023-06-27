package me.shoobadom.broadcasttest;

import me.shoobadom.broadcasttest.cmd.MainCommand;
import me.shoobadom.broadcasttest.file.FileManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BroadcastTest extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic
        FileManager.setup(this);

        MainCommand cmds = new MainCommand();
        getCommand("broadcast").setExecutor(cmds);
    }
}
