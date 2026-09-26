/*
Question:
3. Write a program to return all the characters in a string using a user-defined method, compare the result with toCharArray, and display the result.

Hints:
1. Take text using Scanner next.
2. Return the characters without using toCharArray.
3. Write a method to compare two character arrays.
4. Compare the user-defined array with the built-in toCharArray result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;
public class StringCharactersComparison {
    // Return characters without using toCharArray.
    public static char[] getCharacters(String text) {
        // Create an array with the same length as the text.
        char[] characters = new char[text.length()];
        // Copy each character into the array.
        for (int i = 0; i < text.length(); i++) characters[i] = text.charAt(i);
        // Return the array.
        return characters;
    }
    // Compare two character arrays.
    public static boolean compareArrays(char[] first, char[] second) {
        // Different lengths mean the arrays differ.
        if (first.length != second.length) return false;
        // Compare every array element.
        for (int i = 0; i < first.length; i++) if (first[i] != second[i]) return false;
        // All elements match.
        return true;
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Take the text.
        System.out.print("Enter text: "); String text = sc.next();
        // Get characters with the user-defined method.
        char[] userDefined = getCharacters(text);
        // Get characters with the built-in method.
        char[] builtIn = text.toCharArray();
        // Compare both arrays.
        System.out.println("Both arrays are same: " + compareArrays(userDefined, builtIn));
        // Display the user-defined characters.
        System.out.print("Characters: "); for (char c : userDefined) System.out.print(c + " "); System.out.println();
        // Close the Scanner.
        sc.close();
    }
}
