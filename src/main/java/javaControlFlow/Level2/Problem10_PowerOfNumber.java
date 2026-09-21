/*
Problem 10 - GCR Control Flow Level 2
Create a program to find the power of a number.

Hint =>
1. Get integer input for two variables named number and power.
2. Create a result variable with an initial value of 1.
3. Run a for loop from i = 1 to i <= power.
4. In each iteration of the loop, multiply the result with the number and assign the value to the result.
5. Finally, print the result

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem10_PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter number: "); // Ask for the number.
        int number = input.nextInt(); // Read the number.
        System.out.print("Enter power: "); // Ask for the power.
        int power = input.nextInt(); // Read the power.
        long result = 1; // Initialize the result to one.

        for (int i = 1; i <= power; i++) { // Repeat multiplication according to the power.
            result *= number; // Multiply result by the number.
        }

        System.out.println(number + " raised to the power " + power + " is " + result); // Display the result.
        input.close(); // Close Scanner.
    }
}
