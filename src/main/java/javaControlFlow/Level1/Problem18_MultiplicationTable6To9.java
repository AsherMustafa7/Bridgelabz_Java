/*
Problem 18 - GCR Control Flow Level 1
Create a program to find the multiplication table of a number entered by the user from 6 to 9.

Hint =>
1. Take integer input and store it in the variable number
2. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem18_MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for the number.
        int number = input.nextInt(); // Read the number.

        for (int i = 6; i <= 9; i++) { // Iterate through multipliers six to nine.
            int result = number * i; // Calculate the multiplication result.
            System.out.println(number + " * " + i + " = " + result); // Display the multiplication result.
        }

        input.close(); // Close the Scanner object.
    }
}
