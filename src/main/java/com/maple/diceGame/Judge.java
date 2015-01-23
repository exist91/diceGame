package com.maple.diceGame;

import java.util.ArrayList;
import java.util.List;

import com.maple.diceGame.player.Player;

public class Judge {

	private Recoder recoder;
	private List<Player> players = new ArrayList<Player>();
	private int round;

	public Judge(Recoder recoder, int round) {
		this.recoder = recoder;
		this.round = round;
	}

	public void registerPlayer(Player player) {
		this.players.add(player);
	}

	public void setRound(int round) {
		this.round = round;
	}

	public void progressGame() {
		for (int i = 0; i < this.round; i++) {
			for (Player player : players) {
				player.setTotalScore(player.getTotalScore()
						+ player.throwDice());
			}
			recoder.printGameState(players);
		}

		judgeWinner();
	}

	public void judgeWinner() {
		Player winner = new Player(null);

		for (Player player : players) {
			if (player.getTotalScore() > winner.getTotalScore()) {
				winner = player;
			}
		}

		recoder.printWinner(winner);
	}

}
