/*
Question:
8. Write a program to demonstrate NumberFormatException using Integer.parseInt.

Hints:
1. Take text as user input.
2. Use Integer.parseInt to extract a number.
3. Write a method to generate the exception.
4. Write a method using try catch to handle NumberFormatException and RuntimeException.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class NumberFormatExceptionDemo {
    // Generate NumberFormatException when text is not a valid integer.
    public static void generateException(String text) {
        // Convert the text into an integer.
        int number = Integer.parseInt(text);
        // Display the converted number.
        System.out.println("Number: " + number);
    }
    // Handle NumberFormatException.
    public static void handleException(String text) {
        try {
            // Convert the text into an integer.
            int number = Integer.parseInt(text);
            // Display the converted number.
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            // Handle invalid numeric text.
            System.out.println("NumberFormatException handled successfully.");
            System.out.println("Message: " + exception.getMessage());
        } catch (RuntimeException exception) {
            // Handle another runtime exception.
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take text from the user.
        System.out.print("Enter numeric text: "); String text = sc.next();
        // Call the safe handling method.
        handleException(text);
        // Close the Scanner.
        sc.close();
    }
}
