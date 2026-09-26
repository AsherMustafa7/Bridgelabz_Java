/*
Question:
5. Write a method to demonstrate NullPointerException. Define text as null and handle the exception using try catch.

Hints:
1. Define text and initialize it to null.
2. Access a String method inside try.
3. Catch NullPointerException.
4. Call the handling method from main.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NullPointerExceptionHandled {
    // Demonstrate and handle NullPointerException.
    public static void handleException() {
        try {
            // Create a null String reference.
            String text = null;
            // Calling length on null generates the exception.
            System.out.println(text.length());
        } catch (NullPointerException exception) {
            // Handle the exception.
            System.out.println("NullPointerException handled successfully.");
            System.out.println("Message: " + exception.getMessage());
        }
    }
    public static void main(String[] args) {
        // Call the method that handles the exception.
        handleException();
    }
}
