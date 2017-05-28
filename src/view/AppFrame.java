package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import network.ClientGameEngineCallbackServer;
import network.GameEngineClientStub;
import network.ServerStubGameEngineCallback;
import model.EditorModel;
import model.GameEngineCallbackImpl;
import model.GameEngineImpl;
import model.SimplePlayer;
import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;

public class AppFrame extends JFrame {
	/**
	 * Main program frame
	 */
	private static final long serialVersionUID = 1L;
	private MenuBar menuBar = new MenuBar();
	private ToolBar toolbar = new ToolBar(this);
	private EditorPanel editorPanel = new EditorPanel();
	private StatusBar statusBar = new StatusBar();
	private GameEngineImpl gameEngine = new GameEngineImpl();
	private GameEngineCallbackImpl gec;
	private GameEngineClientStub gecs;
	private ClientGameEngineCallbackServer cgecs;
	private ServerStubGameEngineCallback ssgec;
	private SimplePlayer player;
	private int bet;

	public AppFrame() {
		super("SADI Assignment 1");
		//gec = new GameEngineCallbackImpl(this);
		gecs = new GameEngineClientStub();
		gecs.addGameEngineCallback(ssgec);
		setLayout(new BorderLayout());
		setJMenuBar(menuBar);
		this.add(toolbar, BorderLayout.NORTH);
		this.add(editorPanel, BorderLayout.CENTER);
		this.add(statusBar, BorderLayout.SOUTH);
		setVisible(true);
		setBounds(100, 100, 640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GameEngineCallback gec = new GameEngineCallbackImpl(this);
		// gameEngine.addGameEngineCallback(gec);

	}

	public void setGameEnginePlayer(SimplePlayer player) {
		gameEngine.addPlayer(player);
	}

	public void getPlayerName() {
		if (this.player != null)
			System.out.println(player.getPlayerName());
	}

	public SimplePlayer getPlayer() {
		return player;
	}

	public void setPlayer(SimplePlayer player) {
		this.player = player;
	}

	public GameEngine getGameEngine() {
		return gecs;
	}

	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public EditorPanel getEditorPanel() {
		return editorPanel;
	}
}
