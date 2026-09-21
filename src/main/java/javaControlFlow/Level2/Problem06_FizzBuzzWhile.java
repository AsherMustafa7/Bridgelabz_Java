/*
Problem 6 - GCR Control Flow Level 2
Rewrite the program 5 FizzBuzz using while loop

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem06_FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a positive integer: "); // Ask for a positive integer.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check for a positive input.
            int i = 0; // Start counting at zero.
            while (i <= number) { // Loop through the numbers.
                if (i % 3 == 0 && i % 5 == 0) { // Check multiples of both three and five.
                    System.out.println("FizzBuzz"); // Print FizzBuzz.
                } else if (i % 3 == 0) { // Check multiples of three.
                    System.out.println("Fizz"); // Print Fizz.
                } else if (i % 5 == 0) { // Check multiples of five.
                    System.out.println("Buzz"); // Print Buzz.
                } else { // Execute for all other numbers.
                    System.out.println(i); // Print the number.
                }
                i++; // Move to the next number.
            }
        } else { // Execute for non-positive input.
            System.out.println("Please enter a positive integer."); // Display invalid input.
        }
        input.close(); // Close Scanner.
    }
}
