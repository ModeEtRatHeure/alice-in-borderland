package fr.zedocorp.aib.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;

import fr.zedocorp.aib.util.*;
// import fr.zedocorp.aib.game.*;

public class Events implements Listener {
	@SuppressWarnings("unused")
	private JavaPlugin plugin;
	
	public Events(JavaPlugin p) {
		this.plugin = p;
	}
	
	@EventHandler()
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (Static.getOnlinePlayerAmount(Bukkit.getServer()) == 1) {
			//startGameTimer();
		} 
		
		Bukkit.getServer().broadcastMessage(Messages.CHAT_JOIN.toString().replace("%player%", e.getPlayer().getName()).replace("%n%", "" + Static.getOnlinePlayerAmount(Bukkit.getServer())));
	}
}
