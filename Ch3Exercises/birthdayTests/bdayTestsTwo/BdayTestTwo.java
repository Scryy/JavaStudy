/**
 * 'Chapter 3, Exercise #7B', Write a program
 * that chooses a full 365 random birthdays, 
 * Print out how many duplicate birthdays there
 * are in total. 
 */

public class BdayTestTwo {
	public static void main(String[] args) {
		int[] used;			// FOr recording the possible birthday
						// that have been seen so far. A value
						// of true in used[i] means that a person
						// whose birthday is the i-th day of the
						// year has been found. 

		int count;			// The number of people who have been checked
		int day;			
	
		used = new int[365];	// Initially, all entries are false.

		count = 0;

		for ( day = 0; day < 365; day++) {
			int birthday;		
			birthday = (int)(Math.random()*365);
			used[birthday]++;
			
		
		}
		for (day = 0; day < 365; day++ ) {
			if ( used[day] == 2 || used[day] == 3) {
				count++;
			}
			else {
				continue;
			}
		}

		System.out.println();
		System.out.printf("There were %d days with duplicate birthdays%n", count);
	}
}
