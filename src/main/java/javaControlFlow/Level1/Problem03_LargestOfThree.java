/*
Problem 3 - GCR Control Flow Level 1
Write a program to check if the first, second, or third number is the largest of the three.

I/P => number1, number2, number3
O/P =>
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem03_LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter number1: "); // Ask for the first number.
        int number1 = input.nextInt(); // Read the first number.
        System.out.print("Enter number2: "); // Ask for the second number.
        int number2 = input.nextInt(); // Read the second number.
        System.out.print("Enter number3: "); // Ask for the third number.
        int number3 = input.nextInt(); // Read the third number.
        boolean firstLargest = number1 >= number2 && number1 >= number3; // Check whether the first number is largest.
        boolean secondLargest = number2 >= number1 && number2 >= number3; // Check whether the second number is largest.
        boolean thirdLargest = number3 >= number1 && number3 >= number2; // Check whether the third number is largest.

        System.out.println("Is the first number the largest? " + firstLargest); // Display the first result.
        System.out.println("Is the second number the largest? " + secondLargest); // Display the second result.
        System.out.println("Is the third number the largest? " + thirdLargest); // Display the third result.
        input.close(); // Close the Scanner object.
    }
}
