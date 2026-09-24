/*
 * Question:
 * Write a program that takes a year as input and outputs whether the year
 * is a leap year or not.
 *
 * Hints:
 * 1. The program works only for year greater than or equal to 1582,
 *    corresponding to a year in the Gregorian calendar.
 * 2. A leap year is divisible by 4 and not divisible by 100,
 *    or it is divisible by 400.
 * 3. Write a method to check for a leap year using these conditions.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class LeapYearChecker {

    // Check whether the given year is a leap year.
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the year from the user.
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year from 1582 onwards.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
