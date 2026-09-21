/*
Problem 5 - GCR Control Flow Level 3
Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):

y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31*m0 / 12) mod 7

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem05_DayOfWeek {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]); // Read the month from the first command-line argument.
        int day = Integer.parseInt(args[1]); // Read the day from the second command-line argument.
        int year = Integer.parseInt(args[2]); // Read the year from the third command-line argument.

        int y0 = year - (14 - month) / 12; // Calculate the adjusted year.
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Calculate the year component.
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Calculate the adjusted month.
        int d0 = (day + x + 31 * m0 / 12) % 7; // Calculate the day of the week.

        System.out.println(d0); // Display 0 for Sunday through 6 for Saturday.
    }
}
