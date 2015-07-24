/**
 * 'Chapter 3, Exercise #3' Write a program that can
 * take simple exprerssions such as; 17 + 3, 3.1459 *
 * 4.7. The input will always consist of a number, an
 * operator and then another number. Your program should
 * read an expression, print it's value, read another 
 * expression, etc. Until told to terminate. 
 */

public class SimpleCalc {
	public static void main(String[] args) {
		double opOne;
		double opTwo;
		char operand;
		double result;

		while (true) {

			System.out.print("Enter your first value or 0 to exit: ");
			System.out.println();
			opOne = (double)TextIO.getDouble();
			if (opOne == 0 ) {
				break;
			}

			System.out.print("Enter your operand:E.G + - * or / ");

			operand = TextIO.getChar();
			opTwo = (double)TextIO.getDouble();
			


	
			switch (operand) {
				case '+':
					result = opOne + opTwo;
					break;
				case '-':
					result = opOne - opTwo;
					break;
				case '*':
					result = opOne * opTwo;
					break;
				case '/': 
					result = opOne * opTwo;
					break;
				default: 
					System.out.println("Incorrect operand entered. Program aborting");
					continue;
			}

			System.out.println(" Result " + result);

	} // End while

}
}
