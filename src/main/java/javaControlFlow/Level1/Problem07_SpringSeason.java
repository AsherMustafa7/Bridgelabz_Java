/*
Problem 7 - GCR Control Flow Level 1
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.

Hint =>
1. Spring Season is from March 20 to June 20

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem07_SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]); // Read the month from the command line.
        int day = Integer.parseInt(args[1]); // Read the day from the command line.
        boolean spring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20); // Check whether the date falls in spring.

        if (spring) { // Check the spring condition.
            System.out.println("Its a Spring Season"); // Display the spring message.
        } else { // Execute when the date is outside spring.
            System.out.println("Not a Spring Season"); // Display the non-spring message.
        }
    }
}
