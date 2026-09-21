/*
Problem 1 - GCR Control Flow Level 3
Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code

Hint =>
1. Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
2. Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
3. Use the while loop till the originalNumber is not equal to zero
4. In the while loop find the reminder number by using the modulus operator as in number % 10. Find the cube of the number and add it to the sum variable
5. Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
6. Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem01_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask the user for a number.
        int number = input.nextInt(); // Store the user input.
        int originalNumber = number; // Preserve the original number for comparison.
        int workingNumber = number; // Create a copy that can be reduced digit by digit.
        int sum = 0; // Initialize the sum of cubes to zero.

        if (number >= 0) { // Check that the number is non-negative.
            while (workingNumber != 0) { // Process each digit until no digits remain.
                int digit = workingNumber % 10; // Find the last digit using modulus.
                int cube = digit * digit * digit; // Find the cube of the digit.
                sum += cube; // Add the cube to the sum.
                workingNumber /= 10; // Remove the last digit using integer division.
            }

            if (sum == originalNumber) { // Compare the calculated sum with the original number.
                System.out.println(originalNumber + " is an Armstrong Number"); // Display Armstrong result.
            } else { // Execute when the values are different.
                System.out.println(originalNumber + " is not an Armstrong Number"); // Display non-Armstrong result.
            }
        } else { // Execute for negative input.
            System.out.println("Please enter a non-negative integer."); // Display an input message.
        }

        input.close(); // Close the Scanner.
    }
}
