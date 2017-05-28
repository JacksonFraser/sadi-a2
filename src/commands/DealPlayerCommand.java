package commands;

import model.interfaces.GameEngine;
import model.interfaces.Player;

public class DealPlayerCommand implements Command{
	
	private Player player;
	private int delay;
	
	public DealPlayerCommand(Player player, int delay) {
		this.player = player;
		this.delay = delay;
	}
	
	@Override
	public void execute(GameEngine ge) {
		
		ge.dealPlayer(player, delay);
	}

}
