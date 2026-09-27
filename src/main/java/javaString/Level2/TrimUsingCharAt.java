/*
Question:
7. Write a program to trim the leading and trailing spaces from a string using the charAt method.

Hints:
1. Create a method to find the starting and ending points with no spaces and return them in an array.
2. Write a method to create a substring using charAt with the string, start, and end index.
3. Write a method to compare two strings using charAt and return a boolean result.
4. The main function calls the user-defined trim and substring methods, then uses the built-in trim method and compares the results.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class TrimUsingCharAt {

    // Find the first and last non-space positions.
    public static int[] findTrimIndexes(String text) {
        // Start from the beginning of the text.
        int start = 0;

        // Move forward while leading spaces are present.
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Start from the final index.
        int end = text.length() - 1;

        // Move backward while trailing spaces are present.
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return start index and end index plus one.
        return new int[] {start, end + 1};
    }

    // Create a substring using charAt.
    public static String createSubstring(String text, int start, int end) {
        // Create an empty result.
        String result = "";

        // Add characters from start to end.
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        // Return the substring.
        return result;
    }

    // Compare two strings using charAt.
    public static boolean compareUsingCharAt(String first, String second) {
        // Compare the lengths first.
        if (first.length() != second.length()) {
            return false;
        }

        // Compare each character.
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        // Return true when both strings match.
        return true;
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the complete text including spaces.
        System.out.print("Enter text with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Find the trim boundaries.
        int[] indexes = findTrimIndexes(text);

        // Create the trimmed text using charAt.
        String userTrimmed = createSubstring(text, indexes[0], indexes[1]);

        // Trim the text using the built-in method.
        String builtInTrimmed = text.trim();

        // Compare the two results.
        boolean result = compareUsingCharAt(userTrimmed, builtInTrimmed);

        // Display both results.
        System.out.println("User-defined trim: " + userTrimmed);
        System.out.println("Built-in trim: " + builtInTrimmed);
        System.out.println("Both results are same: " + result);

        // Close the Scanner object.
        sc.close();
    }
}
