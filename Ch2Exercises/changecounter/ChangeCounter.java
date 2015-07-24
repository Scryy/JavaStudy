/**
* Exercise #4. Write a program that asks the user
* how many quarters, nickels, dimes and pennies 
* they have. The program will then tell them in dollars
* how much money they have. 
**/

import java.util.Scanner;

public class ChangeCounter {
	public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in); //Declare the scanner for input
	double pennies;
	double nickels;
	double dimes;
	double quarters;
	double total;

	int pQuantity;				//amount of pennies
	int nQuantity;				//amount of nickels
	int dQuantity;				//amount of dimes
	int qQuantity;				//amount of quarters

	pennies = 0.01;
	nickels = 0.05;
	dimes = 0.10;
	quarters = 0.25;

	System.out.println("Hello there! We're going to count your change.");
	System.out.println();
	
	System.out.print("How many pennies do you have?: ");
	pQuantity = stdin.nextInt();
	System.out.print("How many nickels do you have?: ");
	nQuantity = stdin.nextInt();
	System.out.print("How many dimes do you have?: ");
	dQuantity = stdin.nextInt();
	System.out.print("How many quarters do you have?: ");
	qQuantity = stdin.nextInt();

	total = (pennies * pQuantity) + (nickels * nQuantity) + 
			(dimes * dQuantity) + (quarters * qQuantity);


	System.out.printf("Your total is $%1.2f%n", total);

	}
}
	
	

