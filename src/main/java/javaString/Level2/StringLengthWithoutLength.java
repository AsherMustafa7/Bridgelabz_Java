/*
Question:
1. Write a program to find and return the length of a string without using the length method.

Hints:
1. Take user input using Scanner next.
2. Create a method to find and return a string's length without using the built-in length method.
3. Use an infinite loop to count characters until charAt throws a runtime exception, handle the exception, and return the count.
4. The main function calls the user-defined method as well as the built-in length method and displays the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class StringLengthWithoutLength {

    // Find the length of a string without using length.
    public static int findLength(String text) {
        // Start the character count at zero.
        int count = 0;

        // Keep checking characters until charAt goes outside the string.
        while (true) {
            try {
                // Access the character at the current index.
                text.charAt(count);

                // Increase the count after finding a valid character.
                count++;
            } catch (RuntimeException exception) {
                // Stop when the first invalid index is reached.
                break;
            }
        }

        // Return the number of valid characters.
        return count;
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the string from the user.
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find the length using the user-defined method.
        int userLength = findLength(text);

        // Find the length using the built-in method.
        int builtInLength = text.length();

        // Display both results.
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in method: " + builtInLength);

        // Close the Scanner object.
        sc.close();
    }
}
