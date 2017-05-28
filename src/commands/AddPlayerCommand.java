package commands;

import model.interfaces.GameEngine;
import model.interfaces.Player;

public class AddPlayerCommand implements Command{
	
	private Player player;
	
	public AddPlayerCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute(GameEngine ge) {
		
		ge.addPlayer(player); 
	}

}
