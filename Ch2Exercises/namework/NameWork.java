/**
* Exercise #6. Write a program that asks the 
* user for their first and last name seperated
* by a space. Break the input into two strings
* First + Last. Finally output the number of 
* chars in each name, and output the users
* initials. Use the custom class TextIO. 
*/

public class NameWork {
	public static void main(String[] args) {
		String userName;
		String firstName;
		String lastName;
		int nameSpace;

		System.out.println("What is your name?");
		userName = TextIO.getln();
		nameSpace = userName.indexOf(' ');

		firstName = userName.substring(0,nameSpace);
		lastName = userName.substring(nameSpace+1);
		System.out.println("Your first name is " + firstName + ", there are " + firstName.length() + " Characters in your first name.");
		System.out.println("Your last name is " + lastName + ", there are " + lastName.length() + " Characters in your last name.");
		System.out.println("Your initials are " + firstName.charAt(0)+lastName.charAt(0));

	}
}

		
		
		

