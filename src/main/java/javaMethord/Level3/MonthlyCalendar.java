/*
Question:
8. Create a program to display a calendar for a given month and year. Take month and year from the user and display the calendar for that month. The example for 07 2005 should display July 2005 in calendar format.

Hints:
1. Write a method to get the month name using a month array.
2. Write a method to get the number of days using a days array. For February check leap year.
3. Define a leap year method.
4. Write a method to get the first day using the Gregorian calendar algorithm.
5. Display the calendar using two for loops.
6. Use field width 3 for the days and move to the next line after Saturday.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class MonthlyCalendar {

    // Store the names of all months.
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Store the number of days in every month.
    private static final int[] DAYS = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Get the month name.
    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Check whether the year is a leap year.
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    // Get the number of days in the selected month.
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS[month - 1];
    }

    // Find the first day using the Gregorian calendar algorithm.
    public static int getFirstDay(int month, int year) {
        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + 31 * m0 / 12) % 7;
    }

    // Display the complete calendar.
    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Display the calendar heading.
        System.out.println();
        System.out.println("      " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Add indentation before the first day.
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", "");
        }

        // Display every day.
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the month and year from the user.
        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Validate the month.
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
        } else {
            // Display the requested calendar.
            displayCalendar(month, year);
        }

        // Close the scanner.
        sc.close();
    }
}
