/*
Problem 15 - GCR Control Flow Level 1
Rewrite program 14 using for loop

Hint =>
1. Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem15_FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a natural number: "); // Ask for a natural number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is a positive natural number.
            long factorial = 1; // Initialize the factorial to one.

            for (int counter = 1; counter <= number; counter++) { // Iterate from one to the input number.
                factorial *= counter; // Multiply the factorial by the current counter.
            }

            System.out.println("The factorial of " + number + " is " + factorial); // Display the factorial.
        } else { // Execute when the number is not a natural number.
            System.out.println("Please enter a positive natural number."); // Display an invalid-input message.
        }

        input.close(); // Close the Scanner object.
    }
}
