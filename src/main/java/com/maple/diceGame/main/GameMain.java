package com.maple.diceGame.main;

import com.maple.diceGame.Judge;
import com.maple.diceGame.Recoder;
import com.maple.diceGame.player.FraudPlayer;
import com.maple.diceGame.player.Player;

public class GameMain {

	public static void main(String[] args) {

		Recoder recoder = new Recoder();
		Judge judge = new Judge(recoder, 5);
		
		Player playerA = new Player("김형종");
		FraudPlayer playerB = new FraudPlayer("김주연", playerA);
		
		judge.registerPlayer(playerA);
		judge.registerPlayer(playerB);
		
		judge.progressGame();

	}

}
