/*
Problem 14 - GCR Control Flow Level 1
Write a Program to find the factorial of an integer entered by the user.

Hint =>
1. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
2. Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
3. Using a while loop, compute the factorial.
4. Print the factorial at the end.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem14_FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a positive integer: "); // Ask for a positive integer.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is positive.
            long factorial = 1; // Initialize the factorial to one.
            int counter = 1; // Start multiplying from one.

            while (counter <= number) { // Continue until the counter reaches the number.
                factorial *= counter; // Multiply the factorial by the current counter.
                counter++; // Move to the next number.
            }

            System.out.println("The factorial of " + number + " is " + factorial); // Display the factorial.
        } else { // Execute when the number is not positive.
            System.out.println("Please enter a positive integer."); // Display an invalid-input message.
        }

        input.close(); // Close the Scanner object.
    }
}
