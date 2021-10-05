package fr.zedocorp.aib.util;

import org.bukkit.Server;

public class Static {
	public static int getOnlinePlayerAmount(Server s) {
		return s.getOnlinePlayers().size();
	}
}
