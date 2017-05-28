package commands;

import network.ClientGameEngineCallbackServer;
import model.interfaces.GameEngine;

public class AddGameEngineCallbackCommand implements Command {
	
	private int port;
	private String hostname;
	public AddGameEngineCallbackCommand() {
		this.hostname = hostname;
		this.port = port;
	}
	
	
	
	@Override
	public void execute(GameEngine ge) {
		ClientGameEngineCallbackServer cgecs = new ClientGameEngineCallbackServer();
		port = cgecs.getPort();
		
		
	
	}

}
