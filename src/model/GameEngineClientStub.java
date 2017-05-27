package model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Deque;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class GameEngineClientStub implements GameEngine {

	private Socket socket;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;
	private GameEngineServerStub gess;
	
	public GameEngineClientStub(GameEngineServerStub gess) {
		this.setGess(gess);
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

	public GameEngineServerStub getGess() {
		return gess;
	}

	public void setGess(GameEngineServerStub gess) {
		this.gess = gess;
	}

}
