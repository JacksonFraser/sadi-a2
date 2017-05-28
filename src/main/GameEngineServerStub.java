package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

import network.ClientThread;
import model.GameEngineCallbackImpl;
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
		System.out.println("waiting...");
		try (ServerSocket serverSocket = new ServerSocket(10101))
		{
			while (true)
			{
				System.out.println("Waiting for connection ..");
				Socket socket = serverSocket.accept();
				System.out.println("Client #"+numClients+" has joined");

				new ClientThread(socket).start();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

