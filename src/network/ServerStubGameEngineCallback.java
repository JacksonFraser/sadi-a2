package network;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class ServerStubGameEngineCallback implements GameEngineCallback {

	@Override
	public void nextCard(Player player, PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bustCard(Player player, PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void result(Player player, int result, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextHouseCard(PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void houseBustCard(PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void houseResult(int result, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}

}