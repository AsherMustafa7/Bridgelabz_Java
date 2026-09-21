/*
Problem 3 - GCR Control Flow Level 3
Create a program to check if a number taken from the user is a Harshad Number.

Hint =>
1. A Harshad number is an integer which is divisible by the sum of its digits.

For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).

2. Get an integer input for the number variable.
3. Create an integer variable sum with initial value 0.
4. Create a while loop to access each digit of the number.
5. Inside the loop, add each digit of the number to sum.
6. Check if the number is perfectly divisible by the sum.
7. If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem03_HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a positive integer: "); // Ask for a positive integer.
        int number = input.nextInt(); // Store the user input.
        int originalNumber = number; // Preserve the original number.
        int sum = 0; // Initialize the digit sum to zero.

        if (number > 0) { // Check that the input is positive.
            while (number != 0) { // Process every digit.
                int digit = number % 10; // Extract the last digit.
                sum += digit; // Add the digit to the sum.
                number /= 10; // Remove the last digit.
            }

            if (originalNumber % sum == 0) { // Check divisibility by the sum of digits.
                System.out.println(originalNumber + " is a Harshad Number"); // Display Harshad result.
            } else { // Execute when the number is not divisible by its digit sum.
                System.out.println(originalNumber + " is not a Harshad Number"); // Display non-Harshad result.
            }
        } else { // Execute for zero or negative input.
            System.out.println("Please enter a positive integer."); // Display an input message.
        }

        input.close(); // Close the Scanner.
    }
}
