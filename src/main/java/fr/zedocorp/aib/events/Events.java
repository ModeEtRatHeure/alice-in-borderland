package fr.zedocorp.aib.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import fr.zedocorp.aib.util.Messages;
import fr.zedocorp.aib.util.Static;
import fr.zedocorp.aib.game.Game;
// import fr.zedocorp.aib.game.*;

public class Events implements Listener {
	@SuppressWarnings("unused")
	protected JavaPlugin plugin;
	protected Game game;
	
	public Events(JavaPlugin p, Game g) {
		this.plugin = p;
		this.game = g;
	}
	
	@EventHandler()
	public void onPlayerJoin(PlayerJoinEvent e) {
		/*if (Static.getOnlinePlayerAmount(Bukkit.getServer()) == 1) {
			
		}*/
		
		if (Static.getOnlinePlayerAmount(Bukkit.getServer()) < 4) {
			if (game.getState() == Game.GameState.STARTING.toString()) {
				game.stopWaitingTimer();
			}
		}
		
		if (Static.getOnlinePlayerAmount(Bukkit.getServer()) >= 4) {
			if (game.getState() == Game.GameState.NOT_STARTED.toString()) {
				game.startWaitingTimer();
			}
		}
		
		
		Bukkit.getServer().broadcastMessage(Messages.CHAT_JOIN.toString().replace("%player%", e.getPlayer().getName()).replace("%n%", "" + Static.getOnlinePlayerAmount(Bukkit.getServer())));
	}
}
