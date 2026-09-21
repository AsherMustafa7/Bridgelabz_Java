/*
Problem 2 - GCR Control Flow Level 3
Create a program to count the number of digits in an integer.

Hint =>
1. Get an integer input for the number variable.
2. Create an integer variable count with value 0.
3. Use a loop to iterate until number is not equal to 0.
4. Remove the last digit from number in each iteration
5. Increase count by 1 in each iteration.
6. Finally display the count to show the number of digits

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem02_CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter an integer: "); // Ask the user for an integer.
        int number = input.nextInt(); // Store the user input.
        int workingNumber = Math.abs(number); // Use the absolute value so negative signs are not counted as digits.
        int count = 0; // Initialize the digit count to zero.

        if (workingNumber == 0) { // Handle zero because its digit loop would otherwise run zero times.
            count = 1; // Zero contains one digit.
        } else {
            while (workingNumber != 0) { // Continue until all digits have been removed.
                workingNumber /= 10; // Remove the last digit.
                count++; // Increase the digit count.
            }
        }

        System.out.println("The number of digits in " + number + " is " + count); // Display the digit count.
        input.close(); // Close the Scanner.
    }
}
