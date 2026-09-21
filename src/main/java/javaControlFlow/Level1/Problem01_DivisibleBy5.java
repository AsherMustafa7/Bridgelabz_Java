/*
Problem 1 - GCR Control Flow Level 1
Write a program to check if a number is divisible by 5

I/P => number
O/P => Is the number ___ divisible by 5? ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem01_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask the user for a number.
        int number = input.nextInt(); // Read the number.
        boolean divisible = number % 5 == 0; // Check whether the number is divisible by 5.

        System.out.println("Is the number " + number + " divisible by 5? " + divisible); // Display the result.
        input.close(); // Close the Scanner object.
    }
}
