/**
* Exercise #2. Write a program that simulate a pair of dice rolls.
* Have each pair report their result to console, then add the
* results together. 
**/

public class Dice {
	public static void main(String[] args){
		int x;
		int y;
		int result;
		
		x = (int)(6*Math.random()) + 1;
		y = (int)(6*Math.random()) + 1;

		System.out.printf("Die 1 rolls a %d%n", x);
		System.out.printf("Die 2 rolls a %d%n", y);
		System.out.printf("Result: %d%n", x+y);
	}
}

		
