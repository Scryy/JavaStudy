/** 
 * Write an improved version of the MaxDivisors program
 * that puts all of the results in an array, and when 
 * called will print out all integers with the max 
 * number of divisors. Input should be the following:
 *
 * Among integers between 1 and 10000,
 * The maximum number of divisors was 64.
 * Numbers with that many divisors include: 
 * 		7560
 *		9240
 */

public class MaxIntDivisor2 {
	public static void main(String[] args) {
		int N;
		int maxDivisors;
		int[] divisors;

		divisors = new int[10001];
		maxDivisors = 1;
		divisors[1] = 1;


		for (N = 2; N < 10000; N++ ) {
			int divisorCount;
			int D;

			divisorCount = 0;
			for ( D = 1; D <= 10000; D++ ) {
				if (N % D == 0) {
					divisorCount++;
				}
			}	
			divisors[N] = divisorCount;

			if (divisorCount > maxDivisors) {
				maxDivisors = divisorCount;
			}
			
		}
		
		/* Display the results */
		
		System.out.println("\nAmong the integers between 1 and 10000, ");
		System.out.printf("The maximum number of divisors was %d%n", maxDivisors);
		System.out.println("Numbers with that many divisors include: ");

		for (N = 0; N < divisors.length; N ++) {
			if (maxDivisors == divisors[N]) {
				System.out.println("            " + N);
			}
		}

		System.out.println();		// Not necessary. Cleans up my console. 



	} // End Main
} // End class

