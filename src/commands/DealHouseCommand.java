package commands;

import model.interfaces.GameEngine;

public class DealHouseCommand implements Command {
	private int delay;
	
	public DealHouseCommand(int delay){
		this.delay = delay;
	}
	@Override
	public void execute(GameEngine ge) {
		ge.dealHouse(delay);
	}

}
