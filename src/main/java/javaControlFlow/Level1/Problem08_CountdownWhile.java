/*
Problem 8 - GCR Control Flow Level 1
Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch

Hint =>
1. Create a variable counter to take user inputted value for the countdown.
2. Use the while loop to check if the counter is 1
3. Inside a while loop, print the value of the counter and decrement the counter.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem08_CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter countdown starting number: "); // Ask for the starting value.
        int counter = input.nextInt(); // Read the countdown value.

        while (counter >= 1) { // Continue while the counter has not reached zero.
            System.out.println(counter); // Print the current countdown value.
            counter--; // Decrease the counter by one.
        }

        input.close(); // Close the Scanner object.
    }
}
