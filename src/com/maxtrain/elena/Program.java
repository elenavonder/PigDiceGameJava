package com.maxtrain.elena;

public class Program {

	public static void main(String[] args) {
		
		var pigdice = new PigDice();
		var hiScore = 400;
		var games = 1;
		var score = pigdice.Play();
		
		while (score <= hiScore) {
			score = pigdice.Play();
			games++;
		}
		//System.out.println("Game high score is " + score + " after " + games + " games.");
		var message = String.format("Game high score is %d after %d games.", score, games);
        System.out.println(message);
	}

}
