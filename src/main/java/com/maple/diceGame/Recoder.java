package com.maple.diceGame;

import java.util.List;

import com.maple.diceGame.player.FraudPlayer;
import com.maple.diceGame.player.Player;

public class Recoder {

	public void printGameState(List<Player> players) {
		System.out.print("[ ");
		for (Player player : players) {
			if (player instanceof FraudPlayer) {
				System.out.print(player.getName() + " : "
						+ player.getTotalScore() + "[" + player.getFraudDiceMode());
			} else {
				System.out.print(player.getName() + " : "
						+ player.getTotalScore() + " ");

			}
		}
		System.out.println("]");
	}

	public void printWinner(Player player) {
		System.out.println("승자는 " + player.getName() + "입니다.");
	}
}
