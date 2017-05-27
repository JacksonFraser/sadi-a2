package view;


import model.GameEngineCallbackImpl;
import model.GameEngineClientStub;
import model.GameEngineImpl;
import model.GameEngineServerStub;
import model.interfaces.GameEngine;

public class GUIClient {
	public static void main(String[] args) {
		System.out.println("here");
		final GameEngine gameEngine1 = new GameEngineClientStub();
		final GameEngine gameEngine2 = new GameEngineClientStub();
		//final GameEngine gameEngine2 = new GameEngineClientStub();
	/*	AppFrame appFrame1 = new AppFrame(gameEngine1);
		gameEngine1.addGameEngineCallback(new GameEngineCallbackImpl(appFrame1));
		AppFrame appFrame2 = new AppFrame(gameEngine2); 
		
	*/
	}

}
