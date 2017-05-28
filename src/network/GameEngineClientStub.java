package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Deque;

import commands.AddGameEngineCallbackCommand;
import commands.AddPlayerCommand;
import commands.CalculateResultCommand;
import commands.Command;
import commands.DealHouseCommand;
import commands.DealPlayerCommand;
import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class GameEngineClientStub implements GameEngine, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Socket socket;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;
	private ClientGameEngineCallbackServer cgecs;
	private int port;
	public GameEngineClientStub() {
		try {
			Socket socket = new Socket("localhost", 10101);
			outputStream = new ObjectOutputStream(socket.getOutputStream());
			inputStream = new ObjectInputStream(socket.getInputStream());
			
			
			ServerSocket ss = new ServerSocket(0);
			int port = ss.getLocalPort();
			outputStream.writeObject(port);
		
			new Thread() {
				public void run() {
					cgecs = new ClientGameEngineCallbackServer(ss);
				}
			}.start();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getPort() {
		return port;
	}

	@Override
	public void dealPlayer(Player player, int delay) {
		
		Command dealPlayerCommand = new DealPlayerCommand(player, delay);
		try {
			this.outputStream.writeObject(dealPlayerCommand);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void dealHouse(int delay) {
		Command dealHouseCommand = new DealHouseCommand(delay);
		try {
			this.outputStream.writeObject(dealHouseCommand);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addPlayer(Player player) {
		Command addPlayer = new AddPlayerCommand(player);
		try {
			this.outputStream.writeObject(addPlayer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Player getPlayer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removePlayer(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void calculateResult() {
		Command calculateResult = new CalculateResultCommand();
		try {
			this.outputStream.writeObject(calculateResult);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		Command addGameEngineCallback = new AddGameEngineCallbackCommand(port);
		try{
			this.outputStream.writeObject(addGameEngineCallback);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public void removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean placeBet(Player player, int bet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Deque<PlayingCard> getShuffledDeck() {
		return null;
	}
	
}
