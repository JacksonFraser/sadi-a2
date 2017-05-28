package network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ClientGameEngineCallbackServer {
	private int port;
	private ServerSocket ss;

	public ClientGameEngineCallbackServer() {
		System.out.println("CGECS waiting...");
		try {
			ss = new ServerSocket(0);
			while (true) {
				System.out.println("Waiting for connection ..");
				Socket socket = ss.accept();
				System.out.println("Connected and sending time ..");

				PrintStream output = new PrintStream(socket.getOutputStream());
				output.printf("CGECS received something");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getPort() {
		return ss.getLocalPort();
	}

}
