/*
Problem 4 - GCR Control Flow Level 2
Write a Program to check if the given number is a prime number or not

Hint =>
1. A number that can be divided exactly only by itself and 1 are Prime Numbers,
2. Prime Numbers checks are done for numbers greater than 1
3. Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
4. Use isPrime boolean variable to store the result

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem04_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.
        boolean isPrime = number > 1; // A prime number must be greater than one.

        if (isPrime) { // Check divisors only for numbers greater than one.
            for (int i = 2; i < number; i++) { // Test possible divisors.
                if (number % i == 0) { // Check whether i divides the number.
                    isPrime = false; // Mark the number as not prime.
                    break; // Stop after finding a divisor.
                }
            }
        }

        if (isPrime) { // Check the final result.
            System.out.println(number + " is a prime number"); // Display prime.
        } else { // Execute when not prime.
            System.out.println(number + " is not a prime number"); // Display not prime.
        }
        input.close(); // Close Scanner.
    }
}
