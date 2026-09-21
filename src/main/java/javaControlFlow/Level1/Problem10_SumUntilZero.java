/*
Problem 10 - GCR Control Flow Level 1
Write a program to find the sum of numbers until the user enters 0

Hint =>
1. Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
2. Use the while loop to check if the user entered is 0
3. If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
4. The loop will continue till the user enters zero and outside the loop display the total value

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem10_SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        double total = 0.0; // Initialize the total sum to zero.
        System.out.print("Enter a number (0 to stop): "); // Ask for the first number.
        double number = input.nextDouble(); // Read the first number.

        while (number != 0) { // Continue until the user enters zero.
            total += number; // Add the entered number to the total.
            System.out.print("Enter a number (0 to stop): "); // Ask for the next number.
            number = input.nextDouble(); // Read the next number.
        }

        System.out.println("The total sum is " + total); // Display the total sum.
        input.close(); // Close the Scanner object.
    }
}
