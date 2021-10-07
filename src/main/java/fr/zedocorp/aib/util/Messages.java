package fr.zedocorp.aib.util;

import java.io.IOException;
import java.util.Properties;

public enum Messages {
	CHAT_JOIN("chat.join"),
	CHAT_QUIT("chat.leave");
	
	private String msg;
	private Properties props;
	
	Messages(String name) {
		this.msg = name;
		
		props = new Properties();
		try {
			props.load(this.getClass().getResource("/fr.properties").openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return props.getProperty(msg);
	}
	
	public String getKey() {
		return this.msg;
	}
}
