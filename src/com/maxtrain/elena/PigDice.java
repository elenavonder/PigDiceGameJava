package com.maxtrain.elena;

public class PigDice {
	
	//method for one time playing
	public int Play() {
		var score = 0;
		var roll = Roll();
		while (roll != 1) {
			score += roll;
			roll = Roll();
		}
		return score;
	}
	
	//method for rolling the dice
	private int Roll() {
		//this is a static method from the math class
		return (int)(Math.random() * 983421) % 6 + 1;
	}

}
