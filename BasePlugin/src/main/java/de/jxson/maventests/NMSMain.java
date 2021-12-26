package de.jxson.maventests;

import de.jxson.maventests.api.NMS;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Author: Jason M.
 * de.jxson.mavventests
 * 20.12.2021 at 06:35
 */
public class NMSMain extends JavaPlugin implements Listener {

    private NMS nms;

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Starting Maventests...");
        declareNmsVersion();

        Bukkit.getPluginManager().registerEvents(this, this);

    }

    public void declareNmsVersion() {
        String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        getLogger().info("version - [ " + version + " ] found");
        switch (version) {
            case "v1_17_R1":
                nms = new de.jxson.maventests.api.v1_17_R1.NMSHandler();
                break;
            case "v1_18_R1":
                nms = new de.jxson.maventests.api.v1_18_R1.NMSHandler();
                break;
            default:
                break;
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        nms.sendMessage(event.getPlayer(), "Hallo, du bist gejoint!");

    }

}
