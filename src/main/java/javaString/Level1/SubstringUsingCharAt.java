/*
Question:
2. Write a program to create a substring from a String using charAt. Also use String substring to find the substring. Finally compare the two strings and display the results.

Hints:
1. Take String, start index, and end index using Scanner next and nextInt.
2. Write a method to create a substring using charAt.
3. Write a method to compare two strings using charAt.
4. Use substring and compare the two strings.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class SubstringUsingCharAt {
    // Build a substring manually using charAt.
    public static String createSubstring(String text, int start, int end) {
        // Store the characters in a result string.
        String result = "";
        // Visit every index from start to one before end.
        for (int i = start; i < end; i++) result += text.charAt(i);
        // Return the created substring.
        return result;
    }
    // Compare two strings using charAt.
    public static boolean compareUsingCharAt(String first, String second) {
        // Check length first.
        if (first.length() != second.length()) return false;
        // Compare each character.
        for (int i = 0; i < first.length(); i++) if (first.charAt(i) != second.charAt(i)) return false;
        // Both strings match.
        return true;
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take the text.
        System.out.print("Enter text: "); String text = sc.next();
        // Take start and end indexes.
        System.out.print("Enter start index: "); int start = sc.nextInt();
        System.out.print("Enter end index: "); int end = sc.nextInt();
        // Validate the range.
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid substring indexes.");
        } else {
            // Create the substring without substring.
            String userDefined = createSubstring(text, start, end);
            // Create the substring with the built-in method.
            String builtIn = text.substring(start, end);
            // Compare both results.
            System.out.println("Using charAt: " + userDefined);
            System.out.println("Using substring: " + builtIn);
            System.out.println("Both results are same: " + compareUsingCharAt(userDefined, builtIn));
        }
        // Close the Scanner.
        sc.close();
    }
}
