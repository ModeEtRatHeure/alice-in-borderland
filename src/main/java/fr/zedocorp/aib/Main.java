package fr.zedocorp.aib;

import org.bukkit.plugin.java.JavaPlugin;
import fr.zedocorp.aib.events.Events;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("plugin AIB activé");
		
		getServer().getPluginManager().registerEvents(new Events(), this);
	}
}
