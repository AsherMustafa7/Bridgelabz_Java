package javaString.Level3;
/*
Question:
Create a program to display a calendar for a given month and year.
Hint:
1. Create a month array and a method to get the month name.
2. Create a days array and a leap year method to get days in the month.
3. Find the first day using the Gregorian calendar algorithm.
4. Use two for loops to display indentation and days.
5. Use percent 3d formatting and move to the next line after Saturday.
Gregorian algorithm:
y0 = y - (14 - m) / 12
x = y0 + y0 / 4 - y0 / 100 + y0 / 400
m0 = m + 12 * ((14 - m) / 12) - 2
d0 = (d + x + 31 * m0 / 12) mod 7
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class CalendarDisplay {
    // Return the name of the requested month.
    public static String getMonthName(int month) {
        // Store all month names.
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // Return the selected month.
        return months[month - 1];
    }
    // Check whether a year is a leap year.
    public static boolean isLeapYear(int year) {
        // Apply the Gregorian leap year rule.
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
    // Return the number of days in the month.
    public static int getNumberOfDays(int month, int year) {
        // Store normal month lengths.
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        // February has 29 days in a leap year.
        if (month == 2 && isLeapYear(year)) return 29;
        // Return the normal number of days.
        return days[month - 1];
    }
    // Find the first day using the supplied Gregorian algorithm.
    public static int getFirstDay(int month, int year) {
        // Use day one of the month.
        int day = 1;
        // Calculate y0.
        int y0 = year - (14 - month) / 12;
        // Calculate x.
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Calculate m0.
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Calculate the day index from Sunday.
        return (day + x + 31 * m0 / 12) % 7;
    }
    // Display the calendar.
    public static void displayCalendar(int month, int year) {
        // Get the month name.
        String monthName = getMonthName(month);
        // Get the number of days.
        int numberOfDays = getNumberOfDays(month, year);
        // Get the first day index.
        int firstDay = getFirstDay(month, year);
        // Print the heading.
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Print indentation before the first day.
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        // Print every day.
        for (int day = 1; day <= numberOfDays; day++) {
            // Print the day using width three.
            System.out.printf("%3d ", day);
            // Move to a new line after Saturday.
            if ((firstDay + day) % 7 == 0) System.out.println();
        }
        // Finish the calendar with a new line.
        System.out.println();
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take month input.
        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        // Take year input.
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        // Validate the month.
        if (month >= 1 && month <= 12) displayCalendar(month, year);
        else System.out.println("Invalid month.");
        // Close Scanner.
        sc.close();
    }
}
