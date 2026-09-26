/*
Question:
1. Write a program to compare two strings using the charAt method and check the result with the built-in String equals method.

Hints:
1. Take user input using Scanner next for 2 String variables.
2. Write a method to compare two strings using charAt and return a boolean result.
3. Use String equals to check if the results are the same and display the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class CompareStringsCharAt {
    // Compare two strings character by character.
    public static boolean compareUsingCharAt(String first, String second) {
        // Different lengths mean the strings cannot be equal.
        if (first.length() != second.length()) return false;
        // Check every character at the same position.
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) return false;
        }
        // Return true when every character matches.
        return true;
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take the first string.
        System.out.print("Enter first string: "); String first = sc.next();
        // Take the second string.
        System.out.print("Enter second string: "); String second = sc.next();
        // Compare using the user-defined method.
        boolean charAtResult = compareUsingCharAt(first, second);
        // Compare using the built-in method.
        boolean equalsResult = first.equals(second);
        // Display both results.
        System.out.println("Result using charAt: " + charAtResult);
        System.out.println("Result using equals: " + equalsResult);
        // Check that both methods agree.
        System.out.println("Both results are same: " + (charAtResult == equalsResult));
        // Close the Scanner.
        sc.close();
    }
}
