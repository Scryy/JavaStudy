/**
* Exercise #5.
* Write a program that tells the user how many eggs
* they have in gross, dozen and the remainder.
* Example: If you have N eggs, you have N/12 Eggs with 
* N%12 eggs leftover. Gross = 12 Dozen, Dozen = 12
*/

import java.util.Scanner;

public class EggCounter {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int eggs;
		int gross;
		int aboveGross;
		int dozens;
		int leftover;

		System.out.print("How many eggs do you have?: ");
		eggs = stdin.nextInt();

		gross = eggs / 144;		// Calculate gross
		aboveGross = eggs % 144;	// Calculate gross remainder

		dozens = aboveGross / 12;	// Calculate dozen, using gross remainder
		leftover = aboveGross % 12;	// Calculate raminder using dozen remainder


		System.out.printf("You have %d gross %d dozen and %d %n", gross, dozens, leftover);
	}
}
