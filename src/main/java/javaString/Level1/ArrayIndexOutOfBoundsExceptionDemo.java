/*
Question:
9. Write a program to demonstrate ArrayIndexOutOfBoundsException using an array of names and a user-supplied index.

Hints:
1. Define an array of names.
2. Write a method that accesses an index larger than the array length.
3. Write a method using try catch for ArrayIndexOutOfBoundsException and RuntimeException.
4. Call the handling method from main.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {
    // Generate the array exception intentionally.
    public static void generateException(String[] names, int index) {
        // Access the supplied array index.
        System.out.println(names[index]);
    }
    // Handle an invalid array index.
    public static void handleException(String[] names, int index) {
        try {
            // Access the supplied array index.
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Handle the array index exception.
            System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
            System.out.println("Message: " + exception.getMessage());
        } catch (RuntimeException exception) {
            // Handle another runtime exception.
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Create the names array.
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Display valid index information.
        System.out.println("Valid indexes are 0 to " + (names.length - 1));
        // Take an index from the user.
        System.out.print("Enter index: "); int index = sc.nextInt();
        // Call the safe handling method.
        handleException(names, index);
        // Close the Scanner.
        sc.close();
    }
}
