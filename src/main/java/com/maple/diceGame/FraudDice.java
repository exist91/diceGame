package com.maple.diceGame;

public class FraudDice extends Dice {

	private String mode = "일반";

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public int draw(String mode) {
		switch (mode) {
		case "일반": {
			return (int) (Math.random() * 1000) % 6 + 1;// 1~6
		}
		case "강함": {
			return (int) (Math.random() * 1000) % 4 + 3;// 3~6
		}
		case "약함": {
			return (int) (Math.random() * 1000) % 4 + 1;// 1~4
		}
		default: {
			System.out.println("모드 설정이 잘못됨.");
			return -1;
		}
		}
	}

}
