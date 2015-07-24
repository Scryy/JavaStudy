/**
 * 'Chapter3 Exercise #1' Write a program that simulates
 * a pair of rolling dice, caluclating how long it takes
 * to get a pair of snake eyes. Count every die roll until
 * your simulator rolls a pair of snake eyes. Once snake 
 * eyes are rolled, print out how many rolls it took for
 * you to roll a pair of ones. 
 */

public class SnakeEyes {
	public static void main(String[] args) {
		int results, count;			// Declare variables for results and count
		int dieOne, dieTwo;			// Declare variables for the die
		int N;					// Declare variable for iteration

		count = 0;
			
		for ( N = 0; N >= 0; N++ ) {

			dieOne = (int)(6*Math.random()) +1;		// Randomizes die rolls between 1-6
			dieTwo = (int)(6*Math.random()) +1;
			results = dieOne + dieTwo;			// Adds the results together

			if ( results == 2) {
				System.out.printf("%nDie One: %d%n", dieOne);
				System.out.printf("Die two: %d%n", dieTwo);

				/* Display how many rolls it took to get snake eyes! */

				System.out.printf("You rolled snake eyes after %d rolls!%n", count);
				System.out.println();
				
				/* End the loop */

				break;
			}
			else {
				count++;
			}
		}
				
		
	} // End of main ()
} // End of class
