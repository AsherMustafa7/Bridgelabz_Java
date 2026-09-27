/*
Question:
4. Write a program to demonstrate NullPointerException.

Hints:
1. Write a method to generate the exception.
2. Define text and initialize it to null.
3. Call a String method to generate the exception.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NullPointerExceptionDemo {
    // Generate NullPointerException intentionally.
    public static void generateException() {
        // Create a null String reference.
        String text = null;
        // Calling length on null generates the exception.
        try {
            System.out.println(text.length());
        } catch (java.lang.RuntimeException e) {
            System.out.println("Message : "+e.getMessage());
            System.out.println("Simple Name : " +e.getClass().getSimpleName());
            System.out.println("Name : "+e.getClass().getName());
        }
    }
    public static void main(String[] args) {
        // Call the method that demonstrates the exception.
        generateException();
    }
}
