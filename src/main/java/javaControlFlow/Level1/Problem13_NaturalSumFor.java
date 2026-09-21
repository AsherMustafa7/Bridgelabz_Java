/*
Problem 13 - GCR Control Flow Level 1
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.

Hint =>
1. Take the user input number and check whether it's a Natural number
2. If it's a natural number Compute using formulae as well as compute using for loop
3. Compare the two results and print the result

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem13_NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a natural number: "); // Ask for a natural number.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check whether the number is a positive natural number.
            int formulaSum = number * (number + 1) / 2; // Calculate the sum using the formula.
            int forSum = 0; // Initialize the for-loop sum.

            for (int counter = 1; counter <= number; counter++) { // Iterate from one to the input number.
                forSum += counter; // Add the current number to the sum.
            }

            System.out.println("Sum using formula = " + formulaSum); // Display the formula result.
            System.out.println("Sum using for loop = " + forSum); // Display the for-loop result.
            System.out.println("Both computations are correct: " + (formulaSum == forSum)); // Compare both results.
        } else { // Execute when the input is not a natural number.
            System.out.println("The number " + number + " is not a natural number"); // Display the invalid input.
        }

        input.close(); // Close the Scanner object.
    }
}
