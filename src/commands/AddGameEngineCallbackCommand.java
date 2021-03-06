package commands;

import java.io.Serializable;

import network.ClientGameEngineCallbackServer;
import network.ServerStubGameEngineCallback;
import model.interfaces.GameEngine;

public class AddGameEngineCallbackCommand implements Command, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int port;
	private String hostname;
	public AddGameEngineCallbackCommand(int port) {
		this.port = port;
	
	}
	
	
	
	@Override
	public void execute(GameEngine ge) {
		ge.addGameEngineCallback(new ServerStubGameEngineCallback(port));
		
		
	
	}

}
