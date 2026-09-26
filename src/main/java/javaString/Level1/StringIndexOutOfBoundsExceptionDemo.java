/*
Question:
6. Write a program to demonstrate StringIndexOutOfBoundsException. Take a String input, access charAt beyond its length, and handle the exception.

Hints:
1. Take a String input.
2. Write a method that accesses an index beyond the String length.
3. Write a method using try catch to handle StringIndexOutOfBoundsException and RuntimeException.
4. Call the handling method from main so the program continues.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    // Generate the exception intentionally.
    public static void generateException(String text) {
        // Access one position beyond the final valid index.
        System.out.println(text.charAt(text.length()));
    }
    // Handle the String index exception.
    public static void handleException(String text) {
        try {
            // Access an invalid index.
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            // Handle the specific exception.
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
            System.out.println("Message: " + exception.getMessage());
        } catch (RuntimeException exception) {
            // Handle another runtime exception if present.
            System.out.println("RuntimeException handled.");
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
