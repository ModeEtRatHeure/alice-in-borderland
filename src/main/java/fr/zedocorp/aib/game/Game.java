package fr.zedocorp.aib.game;

public class Game {
	public enum GameState {
		NOT_STARTED("not_started"),
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
	
	protected String state;
	
	public void setState(String state) {
		switch (state) {
			case "not_started":
				this.state = state;
				break;
			case "starting":
				this.state = state;
				break;
			case "started":
				this.state = state;
				break;
			default:
				break;
		}
	}
	
	public String getState() {
		return state;
	}
	
	public void startWaitingTimer() {
		if (state != GameState.NOT_STARTED.toString()) return;
	}
	
	public void stopWaitingTimer() {
		if (state != GameState.STARTING.toString()) return;
	}
}
