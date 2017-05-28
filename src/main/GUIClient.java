package main;


import view.AppFrame;
import network.GameEngineClientStub;
import model.GameEngineCallbackImpl;
import model.GameEngineImpl;
import model.interfaces.GameEngine;

public class GUIClient {
	public static void main(String[] args) {
	//	GameEngineClientStub gecs2 = new GameEngineClientStub();
		new AppFrame();
		//new AppFrame(gecs2);
		//final GameEngine gameEngine2 = new GameEngineClientStub();
	/*	AppFrame appFrame1 = new AppFrame(gameEngine1);
		gameEngine1.addGameEngineCallback(new GameEngineCallbackImpl(appFrame1));
		AppFrame appFrame2 = new AppFrame(gameEngine2); 
		
	*/
	}

}
