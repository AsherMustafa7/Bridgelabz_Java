/*
Problem 1 - GCR Level 2 Practice Programs
Write a program to take 2 numbers and print their quotient and reminder

Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem01_QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter number1: "); // Ask for the first number.
        int number1 = input.nextInt(); // Read the first number.
        System.out.print("Enter number2: "); // Ask for the second number.
        int number2 = input.nextInt(); // Read the second number.
        int quotient = number1 / number2; // Calculate the quotient using division.
        int remainder = number1 % number2; // Calculate the remainder using modulus.

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2); // Display the quotient and remainder.
        input.close(); // Close the Scanner object.
    }
}
