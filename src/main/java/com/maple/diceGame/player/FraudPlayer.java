package com.maple.diceGame.player;

import com.maple.diceGame.dice.FraudDice;

public class FraudPlayer extends Player {

	private Player enermy;

	public FraudPlayer(String name, Player enermy) {
		super(name);
		this.enermy = enermy;
	}

	@Override
	public int throwDice() {
		FraudDice fDice = new FraudDice();

		if (this.getTotalScore() - enermy.getTotalScore() >= 6) {
			return fDice.draw("약함");
		} else if (this.getTotalScore() - enermy.getTotalScore() < 0) {
			return fDice.draw("강함");
		} else {
			return fDice.draw();
		}
	}
}
