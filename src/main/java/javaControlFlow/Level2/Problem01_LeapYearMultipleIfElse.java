/*
Problem 1 - GCR Control Flow Level 2
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

Hint =>
1. The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
2. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
3. Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem01_LeapYearMultipleIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a year: "); // Ask for a year.
        int year = input.nextInt(); // Read the year.
        boolean leapYearMultiple = false; // Store the result of the multiple-if-else approach.

        if (year < 1582) { // Check whether the year is before the Gregorian calendar.
            leapYearMultiple = false; // Mark the year as invalid for this program.
        } else if (year % 400 == 0) { // Check whether the year is divisible by 400.
            leapYearMultiple = true; // A year divisible by 400 is a leap year.
        } else if (year % 100 == 0) { // Check whether the year is divisible by 100.
            leapYearMultiple = false; // A century year not divisible by 400 is not a leap year.
        } else if (year % 4 == 0) { // Check whether the year is divisible by 4.
            leapYearMultiple = true; // A year divisible by 4 is a leap year.
        } else { // Execute when none of the conditions are satisfied.
            leapYearMultiple = false; // Mark the year as not a leap year.
        }

        boolean leapYearLogical = year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)); // Check using logical operators.
        System.out.println("Using multiple if-else: " + (year >= 1582 && leapYearMultiple ? "Year is a Leap Year" : "Year is not a Leap Year")); // Display the first result.
        System.out.println("Using logical condition: " + (year >= 1582 && leapYearLogical ? "Year is a Leap Year" : "Year is not a Leap Year")); // Display the second result.
        input.close(); // Close Scanner.
    }
}
