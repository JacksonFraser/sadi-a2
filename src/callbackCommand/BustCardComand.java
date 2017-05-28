package callbackCommand;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class BustCardComand implements CallbackCommand {
	private GameEngine engine;
	private Player player;
	private PlayingCard card;

	public BustCardComand(Player player, PlayingCard card, GameEngine engine) {
		this.player = player;
		this.card = card;
		this.engine = engine;
	}

	@Override
	public void execute(GameEngineCallback gec) {
		gec.bustCard(player, card, engine);
	}

}
