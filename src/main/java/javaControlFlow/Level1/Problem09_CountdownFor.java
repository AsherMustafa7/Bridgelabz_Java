/*
Problem 9 - GCR Control Flow Level 1
Rewrite program 8 to do the countdown using the for-loop

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem09_CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter countdown starting number: "); // Ask for the starting value.
        int counter = input.nextInt(); // Read the countdown value.

        for (int i = counter; i >= 1; i--) { // Count down from the input value to one.
            System.out.println(i); // Print the current countdown value.
        }

        input.close(); // Close the Scanner object.
    }
}
