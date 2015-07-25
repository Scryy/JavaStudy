/**
 * 'Chapter 3, Exercise #5' Write a program that reads 
 * information from a files, 'sales.dat' and reports the
 * total amount of sales, and how many states did not
 * have sales data to process. Be sure to also close the
 * file at the end of the program using TextIO.eoda()
 */

public class SalesData {
	public static void main(String[] args) {
		int cityCount;
		int noData;
		int count;
		double totalSales;
		String currentLine;
		String citySales;
		int seperator;

		TextIO.readFile("salesdata.dat");		// Open the data file

		cityCount = 0;
		totalSales = 0;
		noData = 0;

		while ( !TextIO.eof() ) {		// The file will remain open as long as there is data

			currentLine = TextIO.getln();
			seperator = currentLine.indexOf(':');
			citySales = currentLine.substring(seperator+2); // 2 is used to account for whitespace
			cityCount++;

			if ( Character.isDigit(citySales.charAt(0))) {	// Check for a number, or its invalid
				totalSales = Double.parseDouble(citySales) + totalSales;
			}
			else{
				noData++;
				System.out.println(currentLine);
			}
		 
		} // End while loop

		System.out.println("Your total sales are: " + totalSales);
		System.out.printf("You had %d states with no useable data.%n", noData);

	} // End main
}// End class			
