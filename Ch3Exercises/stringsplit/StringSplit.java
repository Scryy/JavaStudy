/**
 * 'Chapter 3, Exercise #4'Write a program that reads one
 * line of text input and breaks this up into individual
 * words. 
 */

public class StringSplit {
	public static void main(String[] args) {
		String userInput;
		char ch;			// Container variable for each word
		int N;				// Counter variable
		int wordCounter;		// Counter for iterating through the input
		boolean cReturn;

		while (true) {
			System.out.println("Please enter sentence for splitting: ");
			userInput = TextIO.getln();
			if (userInput == null) {
				System.out.println("No input detected please try again");
				continue;
			}
			else{
				break;
			}
		} // End While
		cReturn = true;

		for ( N = 0; N < userInput.length(); N++) {

			ch = userInput.charAt(N);

			if (Character.isLetter(ch)) {
				System.out.print(ch);
				cReturn = false;
			}
			else {
				if ( cReturn == false){
					System.out.println();
					cReturn = true;
				}
			}
		}
		System.out.println();
	} // End Main
} // End Class
				
