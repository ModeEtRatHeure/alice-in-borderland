package fr.zedocorp.aib.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.*;

import fr.zedocorp.aib.util.Static;
// import fr.zedocorp.aib.game.*;

public class Events implements Listener {
	@EventHandler()
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (Static.getOnlinePlayerAmount(Bukkit.getServer()) == 1) {
			//startGameTimer();
		} 
		
		Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + e.getPlayer().getName() + " a rejoint le serveur (" + Static.getOnlinePlayerAmount(Bukkit.getServer()) + "/5)");
	}
}
