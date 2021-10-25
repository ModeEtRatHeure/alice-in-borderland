package fr.zedocorp.aib.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

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
	protected int remainingTime;
	protected Timer timer;
	
	public Game() {
		remainingTime = 30;
		
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				remainingTime--;
				if (remainingTime <= 0) {
					startGame();
					stopWaitingTimer();
				}
			}
		});
		timer.setRepeats(false);
	}
	
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
		
	}
	
	public void stopWaitingTimer() {
		if (state != GameState.STARTING.toString()) return;
		timer.stop();
		remainingTime = 30;
	}
	
	public void startGame() {
		
	}
}
