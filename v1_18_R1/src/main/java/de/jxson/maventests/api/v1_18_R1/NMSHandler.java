package de.jxson.maventests.api.v1_18_R1;

import de.jxson.maventests.api.NMS;
import org.bukkit.craftbukkit.v1_18_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Author: Jason M.
 * de.jxson.maventests.api
 * 20.12.2021 at 06:37
 */
public class NMSHandler implements NMS {

    public void sendMessage(Player player, String message) {
        ((CraftPlayer) player).sendMessage("v1_18_R1: "+ message);
    }
}
