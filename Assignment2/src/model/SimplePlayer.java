package model;

import model.interfaces.Player;

public class SimplePlayer implements Player {
	private String id;
	private String name;
	private int points;

	public SimplePlayer(String id, String name, int points) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.points = points;
	}

	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setPlayerName(String playerName) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		this.points = points;
	}

	@Override
	public String getPlayerId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean placeBet(int bet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getBet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetBet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub
		
	}

}
