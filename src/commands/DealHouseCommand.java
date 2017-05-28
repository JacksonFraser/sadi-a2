package commands;

import java.io.Serializable;

import model.interfaces.GameEngine;

public class DealHouseCommand implements Command, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int delay;
	
	public DealHouseCommand(int delay){
		this.delay = delay;
	}
	@Override
	public void execute(GameEngine ge) {
		ge.dealHouse(delay);
	}

}
