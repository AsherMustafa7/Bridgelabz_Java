/*
Problem 6 - GCR Control Flow Level 1
Write a program to check whether a number is positive, negative, or zero.

Hint =>
1. Get integer input from the user and store it in the number variable.
2. If the number is positive, print positive.
3. If the number is negative, print negative.
4. If the number is zero, print zero.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem06_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is positive.
            System.out.println("positive"); // Display positive.
        } else if (number < 0) { // Check whether the number is negative.
            System.out.println("negative"); // Display negative.
        } else { // Execute when the number is zero.
            System.out.println("zero"); // Display zero.
        }

        input.close(); // Close the Scanner object.
    }
}
