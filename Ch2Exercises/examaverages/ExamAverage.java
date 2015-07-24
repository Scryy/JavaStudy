/**
* Exercise #7.
* Create and use a text file named, testdata.txt
* which contains the following: On the first line
* is the student's first and last name. The next 
* three lines each contain a grade that was received
* on an exam. Write a program that will read the info
* and print a a message containing the name of the 
* student and the average grade of 3 exams. 
*/

public class ExamAverage {
	public static void main(String[] args) {
		
		String name;
		int gradeA, gradeB, gradeC;
		double average;

		TextIO.readFile("testdata.txt"); //Source file for data
	
		name = TextIO.getln();
		gradeA = TextIO.getlnInt();
		gradeB = TextIO.getlnInt();
		gradeC = TextIO.getlnInt();
		
		average = (gradeA + gradeB + gradeC) / 3.0;  //Compute the averages
		
		System.out.println("Student name: " + name);
		System.out.printf("Average grade: %1.1f%n", average);
		/* I originally had this written out with %d and was
		was receiving an exception error. As the value of average
		is going to have a decimal, it must be formatted as a float.
		Output is formatted to a single decimal remainder as GPA's are
		written on a 1.1 basis. */
		

	}
}
