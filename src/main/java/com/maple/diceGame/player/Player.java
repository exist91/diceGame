package com.maple.diceGame.player;

import com.maple.diceGame.dice.Dice;

public class Player {

	private String name;
	private int totalScore;

	public Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int throwDice() {
		Dice dice = new Dice();

		return dice.draw();
	}

}
