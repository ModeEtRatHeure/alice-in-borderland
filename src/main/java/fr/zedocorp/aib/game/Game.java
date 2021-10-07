package fr.zedocorp.aib.game;

import fr.zedocorp.aib.util.Static;
import org.bukkit.Bukkit;

public class Game {
	public enum GameState {
		STARTING("starting"),
		STARTED("started");
		
		private String name;
		
		GameState(String name) {
			this.name = name;
		}
		
		public String toString() {
			return this.name;
		}
	}
	
	public void startWaitingTimer() {
		Bukkit.getServer().broadcastMessage("en attente de joueurs");
		while (Static.getOnlinePlayerAmount(Bukkit.getServer()) != 20) {
			
		}
	}
}
