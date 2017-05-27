package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Deque;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class GameEngineClientStub implements GameEngine, Serializable {

	private Socket socket;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;

	public GameEngineClientStub() {
		try {
			connection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void dealPlayer(Player player, int delay) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dealHouse(int delay) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}
	public void connection() throws Exception{
		System.out.println("Connecting ..");
		//		final String hostname = "time-c.nist.gov";
		//		final int port = 13;
		final String hostname = "localhost";
		final int port = 10013;

		// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (Socket s = new Socket(hostname, port);
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));)
		{
			System.out.println(hostname + " says: ");

			String msg;
			while ((msg = br.readLine()) != null)
				System.out.println(msg);

		}

		System.out.println("Closing ..");
	}

}
