package network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.interfaces.GameEngine;
import commands.Command;

public class GESSThread extends Thread {
	private Socket socket;
	private GameEngine gameEngine;
	private int port;
	private ServerStubGameEngineCallback ssgec;
	public GESSThread(Socket clientSocket, GameEngine gameEngine) {
		this.socket = clientSocket;
		this.gameEngine = gameEngine;
	}

	public void run() {
		try {
		ObjectInputStream inputStream = new ObjectInputStream(
				socket.getInputStream());
		ObjectOutputStream outputStream = new ObjectOutputStream(
				socket.getOutputStream());
		port = (int) inputStream.readObject();
		ssgec = new ServerStubGameEngineCallback(port);
		
		
		while (true) {
				System.out.println(inputStream.readObject());
				Command command = (Command) inputStream.readObject();
				command.execute(gameEngine);
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}