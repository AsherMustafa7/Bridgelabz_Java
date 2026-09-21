/*
Problem 16 - GCR Control Flow Level 1
Create a program to print odd and even numbers between 1 to the number entered by the user.

Hint =>
1. Get an integer input from the user, assign to a variable number and check for Natural Number
2. Using a for loop, iterate from 1 to the number
3. In each iteration of the loop, print the number is odd or even number

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem16_OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a natural number: "); // Ask for a natural number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is a positive natural number.
            for (int i = 1; i <= number; i++) { // Iterate from one to the input number.
                if (i % 2 == 0) { // Check whether the current number is even.
                    System.out.println(i + " is an even number"); // Display the even number.
                } else { // Execute when the current number is odd.
                    System.out.println(i + " is an odd number"); // Display the odd number.
                }
            }
        } else { // Execute when the input is not a natural number.
            System.out.println("Please enter a positive natural number."); // Display an invalid-input message.
        }

        input.close(); // Close the Scanner object.
    }
}
