/** 
* Exercise #3. Write a program that asks the 
* user for their name and greets them. However
* have the name be returned in all caps. 
*/

import java.util.Scanner;

public class Greeter {
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in); //Creates the scanner
		String user;
	
		System.out.println("What is your name?");	
		user = stdin.next();
		System.out.println("Hello, " + user.toUpperCase() + ", nice to meet you!");
	}
}
		
