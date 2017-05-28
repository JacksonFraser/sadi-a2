package commands;

import java.io.Serializable;

import model.interfaces.GameEngine;

public class CalculateResultCommand implements Command, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CalculateResultCommand(){
		
	}
	@Override
	public void execute(GameEngine ge) {
		ge.calculateResult();
	}

}
