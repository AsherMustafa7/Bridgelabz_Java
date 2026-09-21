/*
Problem 4 - GCR Control Flow Level 1
Write a program to check for the natural number and write the sum of n natural numbers

Hint =>
1. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
2. A sum of n natural numbers is n * (n+1) / 2

I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise
The number ___ is not a natural number

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem04_NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is a positive natural number.
            int sum = number * (number + 1) / 2; // Calculate the sum using the formula.
            System.out.println("The sum of " + number + " natural numbers is " + sum); // Display the sum.
        } else { // Execute when the number is not a positive natural number.
            System.out.println("The number " + number + " is not a natural number"); // Display the invalid input.
        }

        input.close(); // Close the Scanner object.
    }
}
