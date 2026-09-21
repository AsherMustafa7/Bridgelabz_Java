/*
Problem 2 - GCR Control Flow Level 2
Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem02_LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a year: "); // Ask for a year.
        int year = input.nextInt(); // Read the year.

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) { // Check all leap-year conditions in one if.
            System.out.println("Year is a Leap Year"); // Display the leap-year result.
        } else { // Execute for an invalid or non-leap year.
            System.out.println("Year is not a Leap Year"); // Display the non-leap result.
        }
        input.close(); // Close Scanner.
    }
}
