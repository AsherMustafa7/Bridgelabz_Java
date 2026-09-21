/*
Problem 7 - GCR Level 2 Practice Programs
Create a program to swap two numbers

Hint =>
1. Create a variable number1 and take user input.
2. Create a variable number2 and take user input.
3. Swap number1 and number2 and print the swapped output

I/P => number1, number2
O/P => The swapped numbers are ___ and ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem07_SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter number1: "); // Ask for the first number.
        int number1 = input.nextInt(); // Read the first number.
        System.out.print("Enter number2: "); // Ask for the second number.
        int number2 = input.nextInt(); // Read the second number.
        int temp = number1; // Store number1 temporarily.
        number1 = number2; // Assign number2 to number1.
        number2 = temp; // Assign the original number1 to number2.

        System.out.println("The swapped numbers are " + number1 + " and " + number2); // Display the swapped numbers.
        input.close(); // Close the Scanner object.
    }
}
