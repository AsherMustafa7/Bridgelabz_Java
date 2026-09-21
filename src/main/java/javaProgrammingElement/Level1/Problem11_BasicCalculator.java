/*
Problem 11 - GCR Level 1 Practice Programs
Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem11_BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter number1: "); // Ask for the first number.
        double number1 = input.nextDouble(); // Read the first number.
        System.out.print("Enter number2: "); // Ask for the second number.
        double number2 = input.nextDouble(); // Read the second number.
        double addition = number1 + number2; // Calculate addition.
        double subtraction = number1 - number2; // Calculate subtraction.
        double multiplication = number1 * number2; // Calculate multiplication.
        double division = number1 / number2; // Calculate division.

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division); // Display all results.
        input.close(); // Close the Scanner object.
    }
}
