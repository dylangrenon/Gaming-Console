package com.udemy.learnSpringFramework.game;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class GameRunner {
		
	
	@Autowired
	
	private GamingConsole game;
		
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
		
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();	
	}

}
