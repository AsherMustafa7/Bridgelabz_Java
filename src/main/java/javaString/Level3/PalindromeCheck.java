package javaString.Level3;
/*
Question:
Check if a text is palindrome and display the result.
Hint:
1. Compare characters from the start and end using a loop.
2. Use recursion to compare start and end characters.
3. Reverse the string using charAt and compare the original and reverse character arrays.
4. The main method performs the palindrome check using all three logic methods.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class PalindromeCheck {
    // Check palindrome using a loop.
    public static boolean checkPalindromeUsingLoop(String text) {
        // Set the first index.
        int start = 0;
        // Set the last index.
        int end = text.length() - 1;
        // Compare from both ends.
        while (start < end) {
            // Return false when characters differ.
            if (text.charAt(start) != text.charAt(end)) return false;
            // Move the start forward.
            start++;
            // Move the end backward.
            end--;
        }
        // All pairs matched.
        return true;
    }
    // Check palindrome recursively.
    public static boolean checkPalindromeUsingRecursion(String text, int start, int end) {
        // Stop when the indexes meet.
        if (start >= end) return true;
        // Return false when the pair differs.
        if (text.charAt(start) != text.charAt(end)) return false;
        // Check the next inner pair.
        return checkPalindromeUsingRecursion(text, start + 1, end - 1);
    }
    // Reverse a string using charAt.
    public static char[] reverseUsingCharAt(String text) {
        // Create the reverse array.
        char[] reverse = new char[text.length()];
        // Fill the reverse array from the end of the text.
        for (int i = 0; i < text.length(); i++) reverse[i] = text.charAt(text.length() - 1 - i);
        // Return the reverse array.
        return reverse;
    }
    // Check palindrome using character arrays.
    public static boolean checkPalindromeUsingArrays(String text) {
        // Convert the original text to a character array.
        char[] original = text.toCharArray();
        // Create the reverse array.
        char[] reverse = reverseUsingCharAt(text);
        // Compare both arrays.
        for (int i = 0; i < original.length; i++) {
            // Return false when a character differs.
            if (original[i] != reverse[i]) return false;
        }
        // Return true when all characters match.
        return true;
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take text input.
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Run the loop method.
        boolean result1 = checkPalindromeUsingLoop(text);
        // Run the recursive method.
        boolean result2 = checkPalindromeUsingRecursion(text, 0, text.length() - 1);
        // Run the array method.
        boolean result3 = checkPalindromeUsingArrays(text);
        // Display all results.
        System.out.println("Loop method: " + result1);
        System.out.println("Recursive method: " + result2);
        System.out.println("Character array method: " + result3);
        // Close Scanner.
        sc.close();
    }
}
