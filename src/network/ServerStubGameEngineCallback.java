package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import callbackCommand.BustCardComand;
import callbackCommand.CallbackCommand;
import callbackCommand.NextCardCallBackCommand;

public class ServerStubGameEngineCallback implements GameEngineCallback {

	private Socket socket;
	private ObjectOutputStream output;
	private int port;
	public ServerStubGameEngineCallback(int port) {
		System.out.println("PORT NUMBER HELLO "+port);	
		this.port = port;
	
		try {
			socket = new Socket("localhost",port);
			output = new ObjectOutputStream(socket.getOutputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@Override
	public void nextCard(Player player, PlayingCard card, GameEngine engine) {
		CallbackCommand nextCard = new NextCardCallBackCommand(player, card, engine);
		
		try {
			this.output.writeObject(nextCard);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bustCard(Player player, PlayingCard card, GameEngine engine) {
		CallbackCommand bustCard = new BustCardComand(player, card, engine);
		
		try{
			this.output.writeObject(bustCard);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void result(Player player, int result, GameEngine engine) {
		System.out.println("HELLO");		
	}

	@Override
	public void nextHouseCard(PlayingCard card, GameEngine engine) {
		System.out.println("HELLO");		
	}

	@Override
	public void houseBustCard(PlayingCard card, GameEngine engine) {
		System.out.println("HELLO");		
	}

	@Override
	public void houseResult(int result, GameEngine engine) {
		System.out.println("HELLO");		
	}

}
