/*
Problem 12 - GCR Control Flow Level 1
Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.

Hint =>
1. Take the user input number and check whether it's a Natural number
2. If it's a natural number Compute using formulae as well as compute using while loop
3. Compare the two results and print the result

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem12_NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a natural number: "); // Ask for a natural number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is a positive natural number.
            int formulaSum = number * (number + 1) / 2; // Calculate the sum using the formula.
            int whileSum = 0; // Initialize the while-loop sum.
            int counter = 1; // Start counting from one.

            while (counter <= number) { // Continue until the counter reaches the input number.
                whileSum += counter; // Add the current number to the sum.
                counter++; // Move to the next number.
            }

            System.out.println("Sum using formula = " + formulaSum); // Display the formula result.
            System.out.println("Sum using while loop = " + whileSum); // Display the while-loop result.
            System.out.println("Both computations are correct: " + (formulaSum == whileSum)); // Compare both results.
        } else { // Execute when the input is not a natural number.
            System.out.println("The number " + number + " is not a natural number"); // Display the invalid input.
        }

        input.close(); // Close the Scanner object.
    }
}
