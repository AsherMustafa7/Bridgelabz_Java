/*
Problem 11 - GCR Control Flow Level 2
Create a program to find the factors of a number taken as user input.

Hint =>
1. Get the input value for a variable named number.
2) Run a for loop from i = 1 to i < number.
3. In each iteration of the loop, check if number is perfectly divisible by i.
4. If true, print the value of i.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem11_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.

        System.out.println("Factors of " + number + " excluding itself are:"); // Display the heading.
        for (int i = 1; i < number; i++) { // Check numbers below the input.
            if (number % i == 0) { // Check whether i is a factor.
                System.out.println(i); // Display the factor.
            }
        }
        input.close(); // Close Scanner.
    }
}
