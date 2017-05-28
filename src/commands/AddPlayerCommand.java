package commands;

import java.io.Serializable;

import model.interfaces.GameEngine;
import model.interfaces.Player;

public class AddPlayerCommand implements Command, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Player player;
	
	public AddPlayerCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute(GameEngine ge) {
		
		ge.addPlayer(player); 
	}

}
