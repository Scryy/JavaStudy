/**
 * 'Chapter 3, Exercise #2' Write a program that finds
 * a number betwen 1-10000 with the largest number of 
 * Divisors. Report the number and every divisor that 
 * it has
 */

public class MaxIntDivisor {
	public static void main(String[] args) {
		int N;
		int maxInt;
		int maxDivisors;


		maxInt = 1;
		maxDivisors = 1;

		for (N = 2; N < 10000; N++ ) {
			int divisorCount;
			int D;

			divisorCount = 0;
			for ( D = 1; D <= 10000; D++ ) {
				if (N % D == 0) {
					divisorCount++;
				}
			
			maxInt = N;
			maxDivisors = divisorCount;
			}
		}
		
		/* Display the results */
		
		System.out.printf("Number with the max divisors: %d%n", maxInt);
		System.out.printf("%d has %d divisors.%n", maxInt, maxDivisors);



	} // End Main
} // End class

