package network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket;

	public ClientThread(Socket clientSocket) {
		this.socket = clientSocket;
	}

	public void run() {
		while (true) {
			try {
				ObjectInputStream inputStream = new ObjectInputStream(
						socket.getInputStream());
				ObjectOutputStream outputStream = new ObjectOutputStream(
						socket.getOutputStream());
				
			
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}
}