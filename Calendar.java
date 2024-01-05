/** 
 * Prints the calendars of all the years of a given year
 */
public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int dayCount = 1;

	public static void main(String args[]) {
		if (args.length > 0) {


			int yearToPrint = Integer.parseInt(args[0]);

			while ( year != yearToPrint ) {
				
	 			advance();
			}

			while ( year != yearToPrint + 1 ) {
				System.out.print(dayOfMonth + "/" + month + "/" + year);
				if (dayOfWeek == 1) {
					System.out.print(" Sunday");
				}
				System.out.println();
				advance();
			}
		}
	}
	
	// Advances the date (day, month, year) and the day-of-the-week.
	// If the month changes, sets the number of days in this month.
	// Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	private static void advance() {
		if (dayOfWeek == 7) {
			dayOfWeek = 1;
		}
		else {
			dayOfWeek++;
		}

		if (dayOfMonth == nDaysInMonth) {
			dayOfMonth = 1;
			if (month == 12) {
				dayCount = 1;
				month = 1;
				year++;
			}
			else {
				dayCount++;
				month++;
			}
			nDaysInMonth = nDaysInMonth(month, year);
		}
		else {
			dayCount++;
			dayOfMonth++;
		}

	}
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if (year % 100 == 0 && year % 400 == 0) {
			return true;
		}
		return year % 4 == 0;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days = 0;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}
		else if (month == 2) {
			days = 28;
			if (isLeapYear(year)) {
				days++;
			}
		}
		else {
			days = 31;
		}
		return days;
	}
}
