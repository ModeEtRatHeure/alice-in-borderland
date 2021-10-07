package fr.zedocorp.aib;

import org.bukkit.plugin.java.JavaPlugin;
import fr.zedocorp.aib.events.Events;
import fr.zedocorp.aib.game.Game;


/**
 * @author	baztoul76
 * 			d'autres arrivent ;)
 * 
 * @version	alpha-0.0.1
 */
public class AIB extends JavaPlugin {
	protected Game game;
	@Override
	public void onEnable() {
		System.out.println("plugin AIB activé");
		
		getServer().getPluginManager().registerEvents(new Events(this, game), this);
	}
}
