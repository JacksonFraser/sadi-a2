package network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import commands.Command;

public class CGECSThread extends Thread {
	private Socket socket;
	private ServerSocket ss;
	public CGECSThread(ServerSocket ss) {
		this.ss = ss;
		
	}

	public void run() {
		
		
		
		while (true) {
			try {
				socket = ss.accept();
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
