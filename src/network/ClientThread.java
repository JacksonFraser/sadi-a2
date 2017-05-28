package network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.interfaces.GameEngine;
import commands.Command;

public class ClientThread extends Thread {
	private Socket socket;
	private GameEngine gameEngine;
	public ClientThread(Socket clientSocket, GameEngine gameEngine) {
		this.socket = clientSocket;
		this.gameEngine = gameEngine;
	}

	public void run() {
		while (true) {
			try {
				ObjectInputStream inputStream = new ObjectInputStream(
						socket.getInputStream());
				ObjectOutputStream outputStream = new ObjectOutputStream(
						socket.getOutputStream());
				
				Command command = (Command) inputStream.readObject();
				command.execute(gameEngine);
				
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}
}