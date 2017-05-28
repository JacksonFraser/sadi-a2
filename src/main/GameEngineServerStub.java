package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import network.GESSThread;
import model.GameEngineImpl;
import model.interfaces.GameEngine;

public class GameEngineServerStub {
	private int numClients = 1;
	private final GameEngine gameEngine = new GameEngineImpl();
	public static void main(String[] args)throws Exception {
		final GameEngineServerStub gess = new GameEngineServerStub();
	}
	
	
	public GameEngineServerStub() throws IOException{
		handleClients();
	}
	private void handleClients() throws IOException{
		try (ServerSocket serverSocket = new ServerSocket(10101))
		{
			
			while (true)
			{
				System.out.println("GESS waiting for connection ..");
				Socket socket = serverSocket.accept();
				System.out.println("Client #"+numClients+" has joined");
				System.out.println();
				numClients++;
				new GESSThread(socket,gameEngine).run();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

