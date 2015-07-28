/**
 * 'Chapter 3, Exercise #7C" Modify the birthdaycount
 * program so that it runs until you have found a 
 * birthday for each day of the year. After program
 * finishes execution, print out how many tries it
 * took to find a birthday for each year. 
 */

public class BdayTestThree {
	public static void main(String[] args) {
		int[] used;
		int birthday;
		int daysRecorded;
		int count;

		used = new int[365];
		count = 0;		
		daysRecorded = 0;

		while (true) {
			birthday = (int)(365*Math.random());

			if ( used[birthday] == 0 ) {	// If the current birthday hasn't been found
							// Add 1 to the day, 1 to the number of days
							// that have been recorded. Regardless, count
							// will increase by 1 in both cases of our loop
				used[birthday]++;
				daysRecorded++;
				count++;
			}
			else {
				count++;
				continue;
			}

			if (daysRecorded == 365 )	// Once the amount of days with a birthday hits 365
							// Break out of the loop
				break;
		}
		
		/* Print the results, counting the amount of tries before all days were fille */

		System.out.println();
		System.out.printf("It took %d tries to fill all days with a birthday.%n", count);
	} // End Main
} // End Class
