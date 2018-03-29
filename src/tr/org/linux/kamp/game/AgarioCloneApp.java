package tr.org.linux.kamp.game;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import tr.org.linux.kamp.game.logic.GameLogic;
import tr.org.linux.kamp.game.model.Difficulty;

public class AgarioCloneApp {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic("Oyun Paneli", Color.BLUE, Difficulty.EISY);
		gameLogic.startApplication();
	}

}
