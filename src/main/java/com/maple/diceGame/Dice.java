package com.maple.diceGame;

public class Dice {

	public int draw(String mode) {
		
		return (int) (Math.random() * 1000) % 6 + 1;// 1~6
	}
}
