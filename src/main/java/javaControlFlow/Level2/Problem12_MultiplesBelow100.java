/*
Problem 12 - GCR Control Flow Level 2
Create a program to find all the multiple of a number taken as user input below 100.

Hint =>
1. Get input value for a variable named number.
2) Run a for loop backward: from i = 100 to i = 1.
3. Inside the loop, check if i perfectly divide the number.
4. If true, print the number and continue the loop.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem12_MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter a number: "); // Ask for a number.
        int number = input.nextInt(); // Read the number.

        System.out.println("Multiples of " + number + " below 100 are:"); // Display the heading.
        for (int i = 99; i >= 1; i--) { // Check numbers below 100 in reverse order.
            if (i % number != 0) { // Check whether i is not a multiple.
                continue; // Skip non-multiples.
            }
            System.out.println(i); // Display the multiple.
        }
        input.close(); // Close Scanner.
    }
}
