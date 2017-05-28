package commands;

import model.interfaces.GameEngine;

public interface Command {
	
	
	public void execute(GameEngine ge);
}
