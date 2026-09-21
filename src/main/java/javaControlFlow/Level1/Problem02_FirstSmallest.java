/*
Problem 2 - GCR Control Flow Level 1
Write a program to check if the first is the smallest of the 3 numbers.

I/P => number1, number2, number3
O/P => Is the first number the smallest? ____

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem02_FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter number1: "); // Ask for the first number.
        int number1 = input.nextInt(); // Read the first number.
        System.out.print("Enter number2: "); // Ask for the second number.
        int number2 = input.nextInt(); // Read the second number.
        System.out.print("Enter number3: "); // Ask for the third number.
        int number3 = input.nextInt(); // Read the third number.
        boolean smallest = number1 <= number2 && number1 <= number3; // Check whether the first number is the smallest.

        System.out.println("Is the first number the smallest? " + smallest); // Display the result.
        input.close(); // Close the Scanner object.
    }
}
