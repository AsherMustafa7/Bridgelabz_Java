/*
Question:
11. Write a program to convert the complete text to lowercase and compare the results.

Hints:
1. Take complete text using Scanner nextLine.
2. Use charAt to convert uppercase characters to lowercase.
3. Use the ASCII difference of 32.
4. Compare two strings using charAt.
5. Compare the user-defined result with the built-in toLowerCase result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class LowercaseComparison {
    // Convert uppercase English letters to lowercase using ASCII values.
    public static String convertToLowercase(String text) {
        // Start with an empty result.
        String result = "";
        // Process every character.
        for (int i = 0; i < text.length(); i++) {
            // Read the current character.
            char character = text.charAt(i);
            // Convert uppercase letters by adding 32.
            if (character >= 'A' && character <= 'Z') character = (char)(character + 32);
            // Add the character to the result.
            result += character;
        }
        // Return the lowercase result.
        return result;
    }
    // Compare two strings using charAt.
    public static boolean compareUsingCharAt(String first, String second) {
        // Different lengths mean different strings.
        if (first.length() != second.length()) return false;
        // Compare each character.
        for (int i = 0; i < first.length(); i++) if (first.charAt(i) != second.charAt(i)) return false;
        // Return true when every character matches.
        return true;
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take the complete text.
        System.out.print("Enter complete text: "); String text = sc.nextLine();
        // Convert using the user-defined method.
        String userDefined = convertToLowercase(text);
        // Convert using the built-in method.
        String builtIn = text.toLowerCase();
        // Compare both results.
        boolean result = compareUsingCharAt(userDefined, builtIn);
        // Display the results.
        System.out.println("User-defined lowercase: " + userDefined);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Both results are same: " + result);
        // Close the Scanner.
        sc.close();
    }
}
