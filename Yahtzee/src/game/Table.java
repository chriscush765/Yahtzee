package game;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private List<Player> players = new ArrayList<Player>();
	
	/**
	 * Prepares the game for play
	 */
	public void setupGame(){
		players.clear();
		for(int i=1;i<=4;i++) {
			
			players.add(new Player(UI.getPlayerName(i)));
			
		}
		
		runGame();
	}
	
	/**
	 * Main loop of the game
	 */
	public void runGame()
	{
		System.out.println("WALCOM 2 YATZIE");
		for (Player p : players) 
		{
			p.act();
		}
	}
	
	/**
	 * Runs when game is over
	 * Displays scores and bonuses, compares players, ask if they want to play again
	 */
	public void endGame()
	{
		for(Player p : players)
		{
			//How do we want the return? IDK if we should syso or return scores and make the method not void
			p.getNumericScore();
		}
	}
	
	
	
}
