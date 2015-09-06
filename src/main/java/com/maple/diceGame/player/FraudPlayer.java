package com.maple.diceGame.player;

import com.maple.diceGame.dice.FraudDice;

public class FraudPlayer extends Player {

	private Player enermy;
	private FraudDice fraudDice;
	
	public FraudPlayer(String name, Player enermy) {
		super(name);
		this.enermy = enermy;
		fraudDice = new FraudDice();
	}

	public String getFraudDiceMode()
	{
		return fraudDice.getMode();
	}
	
	@Override
	public int throwDice() {
		
		if (this.getTotalScore() - enermy.getTotalScore() >= 6) {
			return fraudDice.draw("약함");
		} else if (this.getTotalScore() - enermy.getTotalScore() < 0) {
			return fraudDice.draw("강함");
		} else {
			return fraudDice.draw();
		}
	}
}
