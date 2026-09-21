/*
Problem 4 - GCR Control Flow Level 3
Create a program to check if a number is an Abundant Number.

Hint =>
1. An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,

Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12

2. Get an integer input for the number variable.
3. Create an integer variable sum with initial value 0.
4. Run a for loop from i = 1 to i < number.
5. Inside the loop, check if number is divisible by i.
6. If true, add i to sum.
7. Outside the loop Check if sum is greater than number.
8. If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem04_AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a positive integer: "); // Ask for a positive integer.
        int number = input.nextInt(); // Store the user input.
        int sum = 0; // Initialize the sum of proper divisors.

        if (number > 0) { // Check that the number is positive.
            for (int i = 1; i < number; i++) { // Check every possible proper divisor.
                if (number % i == 0) { // Check whether i divides the number.
                    sum += i; // Add the divisor to the sum.
                }
            }

            if (sum > number) { // Check whether the divisor sum is greater than the number.
                System.out.println(number + " is an Abundant Number"); // Display abundant result.
            } else { // Execute when the divisor sum is not greater.
                System.out.println(number + " is not an Abundant Number"); // Display non-abundant result.
            }
        } else { // Execute for invalid input.
            System.out.println("Please enter a positive integer."); // Display an input message.
        }

        input.close(); // Close the Scanner.
    }
}
