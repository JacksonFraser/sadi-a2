package callbackCommand;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;

public class NextCardCallBackCommand implements CallbackCommand {
	private Player player;
	private PlayingCard card;
	private GameEngine engine;
	public NextCardCallBackCommand(Player player, PlayingCard card, GameEngine engine)  {
		this.player = player;
		this.card = card;
		this.engine = engine;
	}
	@Override
	public void execute(GameEngineCallback gec) {

		gec.nextCard(player, card, engine);
	}

}
