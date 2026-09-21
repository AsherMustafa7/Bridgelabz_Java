/*
Problem 6 - GCR Control Flow Level 3
Write a program to create a calculator using switch...case.

Hint =>
1. Create two double variables named first and second and a String variable named op.
2. Get input values for all variables.
3. The input for the operator can only be one of the four values: "+", "-", "*" or "/".
4. Run a for loop from i = 1 to i < number.
5. Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
6. If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
7. If op is neither of those 4 values, print Invalid Operator.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem06_SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter the first number: "); // Ask for the first number.
        double first = input.nextDouble(); // Read the first number.
        System.out.print("Enter the second number: "); // Ask for the second number.
        double second = input.nextDouble(); // Read the second number.
        System.out.print("Enter operator (+, -, *, /): "); // Ask for the operator.
        String op = input.next(); // Read the operator.

        switch (op) { // Select an operation based on the operator.
            case "+": // Handle addition.
                System.out.println("Result: " + (first + second)); // Display the addition result.
                break; // Exit the switch.
            case "-": // Handle subtraction.
                System.out.println("Result: " + (first - second)); // Display the subtraction result.
                break; // Exit the switch.
            case "*": // Handle multiplication.
                System.out.println("Result: " + (first * second)); // Display the multiplication result.
                break; // Exit the switch.
            case "/": // Handle division.
                if (second != 0) { // Check that the divisor is not zero.
                    System.out.println("Result: " + (first / second)); // Display the division result.
                } else { // Execute when the divisor is zero.
                    System.out.println("Cannot divide by zero."); // Display the division error.
                }
                break; // Exit the switch.
            default: // Handle any unsupported operator.
                System.out.println("Invalid Operator"); // Display the invalid operator message.
        }

        input.close(); // Close the Scanner.
    }
}
