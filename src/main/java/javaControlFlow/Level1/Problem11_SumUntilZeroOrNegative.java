/*
Problem 11 - GCR Control Flow Level 1
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement

Hint =>
1. Use infinite while loop as in while (true)
2. Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem11_SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        double total = 0.0; // Initialize the total sum to zero.

        while (true) { // Create an infinite loop.
            System.out.print("Enter a number (0 or negative to stop): "); // Ask for a number.
            double number = input.nextDouble(); // Read the number.

            if (number <= 0) { // Check whether the entered number is zero or negative.
                break; // Stop the loop when the number is zero or negative.
            }

            total += number; // Add the positive number to the total.
        }

        System.out.println("The total sum is " + total); // Display the total sum.
        input.close(); // Close the Scanner object.
    }
}
