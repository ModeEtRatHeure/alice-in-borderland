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
		e.setJoinMessage(Messages.CHAT_JOIN.toString().replace("%player%", e.getPlayer().getName()).replace("%n%", "" + Static.getOnlinePlayerAmount(Bukkit.getServer())));
		/*if (Static.getOnlinePlayerAmount(Bukkit.getServer()) == 1) {
			System.out.println("premier joueur connecté");
			Bukkit.getServer().broadcastMessage("premier joueur connecté");
		} else */if (Static.getOnlinePlayerAmount(Bukkit.getServer()) < 4) {
			if (game.getState() == Game.GameState.STARTING.toString()) {
				//game.stopWaitingTimer();
			}
		} else if (Static.getOnlinePlayerAmount(Bukkit.getServer()) >= 4) {
			System.out.println("lancement");
			Bukkit.getServer().broadcastMessage("lancement");
			if (game.getState() == Game.GameState.NOT_STARTED.toString()) {
				game.startWaitingTimer();
			}
		}
	}
}
