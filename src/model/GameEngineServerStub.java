package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class GameEngineServerStub {
	
	public static void main(String[] args)throws Exception {
		System.out.println("waiting...");
		try (ServerSocket serverSocket = new ServerSocket(10013))
		{
			while (true)
			{
				System.out.println("Waiting for connection ..");
				Socket socket = serverSocket.accept();
				System.out.println("Connected and sending time ..");

				PrintStream output = new PrintStream(socket.getOutputStream());
				output.printf("\n%s", new Date());

				System.out.println("Closing connection ...");
				socket.close();
				System.out.println("Done.");
			}
		}
	}
	
}
