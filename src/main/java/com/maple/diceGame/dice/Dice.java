package com.maple.diceGame.dice;

public class Dice {

	public int draw() {
		return (int) (Math.random() * 1000) % 6 + 1;// 1~6
	}
}
