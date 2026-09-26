/*
Question:
7. Write a program to demonstrate IllegalArgumentException using an invalid substring range and handle the runtime exception.

Hints:
1. Take a String input.
2. Use substring with start index greater than end index.
3. Use try catch for IllegalArgumentException and generic RuntimeException.
4. In Java, an invalid substring range is actually reported as StringIndexOutOfBoundsException, which is a RuntimeException, so the generic catch is also included.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    // Generate an exception using an invalid substring range.
    public static void generateException(String text) {
        // Set the start index greater than the end index.
        int start = text.length(); int end = 0;
        // Attempt the invalid substring operation.
        System.out.println(text.substring(start, end));
    }
    // Handle the invalid substring operation.
    public static void handleException(String text) {
        try {
            // Set an invalid range.
            int start = text.length(); int end = 0;
            // Attempt to create the substring.
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException exception) {
            // Handle IllegalArgumentException.
            System.out.println("IllegalArgumentException handled.");
        } catch (RuntimeException exception) {
            // Handle the actual runtime exception from substring.
            System.out.println("RuntimeException handled: " + exception.getClass().getSimpleName());
            System.out.println("Message: " + exception.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take the String input.
        System.out.print("Enter a string: "); String text = sc.next();
        // Call the safe handling method.
        handleException(text);
        // Close the Scanner.
        sc.close();
    }
}
