package commands;

import model.interfaces.GameEngine;

public class CalculateResultCommand implements Command {

	public CalculateResultCommand(){
		
	}
	@Override
	public void execute(GameEngine ge) {
		ge.calculateResult();
	}

}
