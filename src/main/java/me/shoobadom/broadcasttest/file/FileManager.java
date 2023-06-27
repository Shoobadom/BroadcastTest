package me.shoobadom.broadcasttest.file;

import me.shoobadom.broadcasttest.BroadcastTest;

public class FileManager {
    private static String pref = "";
    public static void setup(BroadcastTest instance) {
        instance.saveDefaultConfig();
        pref = instance.getConfig().getString("prefix");
    }
    public static String getPrefix() {
        return pref;
    }
}
