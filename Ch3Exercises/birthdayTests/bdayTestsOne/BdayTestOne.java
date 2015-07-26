/**
 * 'Chapter 3, Exercise #7.A' How many random people
 * do you have to select before you find three 
 * duplicate birthdays. All three people have to be
 * born on the same day, and month but not necessarily
 * the same year. 
 */

public class BdayTestOne {
	public static void main(String[] args) {
		int[] used;			// FOr recording the possible birthday
						// that have been seen so far. A value
						// of true in used[i] means that a person
						// whose birthday is the i-th day of the
						// year has been found. 

		int count;			// The number of people who have been checked
		int bdayCount;			// Our counter for three birthdays
		int bdayValue;

		used = new int[365];	// Initially, all entries are false.

		count = 0;
		bdayCount = 0;

		while (true) {
				
			int birthday;		
			birthday = (int)(Math.random()*365);
			count++;

			System.out.printf("Person %d has birthday number %d", count, birthday);
			System.out.println();
			
			if ( used[birthday] == 2 ) {
				break;
			}
			used[birthday]++;
		
		
		} // end while loop

		System.out.println();
		System.out.printf("Found three duplicates after %d tries%n", count);
	}
}
