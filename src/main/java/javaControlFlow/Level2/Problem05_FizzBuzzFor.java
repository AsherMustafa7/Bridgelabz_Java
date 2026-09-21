/*
Problem 5 - GCR Control Flow Level 2
Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".

Hint =>
1. Write the program and use for loop

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem05_FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a positive integer: "); // Ask for a positive integer.
        int number = input.nextInt(); // Read the number.

        if (number > 0) { // Check for a positive input.
            for (int i = 0; i <= number; i++) { // Loop from zero to the input.
                if (i % 3 == 0 && i % 5 == 0) { // Check multiples of both three and five.
                    System.out.println("FizzBuzz"); // Print FizzBuzz.
                } else if (i % 3 == 0) { // Check multiples of three.
                    System.out.println("Fizz"); // Print Fizz.
                } else if (i % 5 == 0) { // Check multiples of five.
                    System.out.println("Buzz"); // Print Buzz.
                } else { // Execute for all other numbers.
                    System.out.println(i); // Print the number.
                }
            }
        } else { // Execute for non-positive input.
            System.out.println("Please enter a positive integer."); // Display invalid input.
        }
        input.close(); // Close Scanner.
    }
}
