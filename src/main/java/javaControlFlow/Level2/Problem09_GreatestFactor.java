/*
Problem 9 - GCR Control Flow Level 2
Create a program to print the greatest factor of a number beside itself using a loop.

Hint =>
1. Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
2. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
3. Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
4. Display the greatestFactor variable outside the loop

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem09_GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.
        int greatestFactor = 1; // Initialize the greatest factor.

        if (number > 1) { // Check whether the number is greater than one.
            for (int i = number - 1; i >= 1; i--) { // Check from the largest possible factor downward.
                if (number % i == 0) { // Check whether i divides the number.
                    greatestFactor = i; // Store the greatest factor.
                    break; // Stop after finding it.
                }
            }
        }

        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor); // Display the result.
        input.close(); // Close Scanner.
    }
}
