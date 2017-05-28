package network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ClientGameEngineCallbackServer {
	private int port;
	private ServerSocket ss;

	public ClientGameEngineCallbackServer(ServerSocket ss) {
		new CGECSThread().start();
		
	}

	public int getPort() {
		return ss.getLocalPort();
	}

}
