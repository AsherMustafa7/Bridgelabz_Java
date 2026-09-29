package javaString.Level3;
/*
Question:
Find unique characters in a string using the charAt method and display the result.
Hint:
1. Find the length without using the String length method.
2. Find unique characters using charAt and return them as a 1D array.
3. Use nested loops and then create an exact-sized result array.
4. The main method takes input, calls methods, and displays the result.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class UniqueCharacters {
    // Find length without using the length method.
    public static int findLength(String text) {
        // Start the count at zero.
        int count = 0;
        // Keep accessing characters until an exception occurs.
        while (true) {
            try {
                // Access the current character.
                text.charAt(count);
                // Increase the count.
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                // Stop when the index is outside the text.
                break;
            }
        }
        // Return the calculated length.
        return count;
    }
    // Find unique characters using charAt.
    public static char[] findUniqueCharacters(String text) {
        // Get the text length using the user-defined method.
        int length = findLength(text);
        // Create a temporary array of maximum possible size.
        char[] temporary = new char[length];
        // Store the number of unique characters.
        int uniqueCount = 0;
        // Check every character.
        for (int i = 0; i < length; i++) {
            // Assume the current character is unique.
            boolean isUnique = true;
            // Compare with previous characters.
            for (int j = 0; j < i; j++) {
                // Mark it as repeated if a match is found.
                if (text.charAt(i) == text.charAt(j)) { isUnique = false; break; }
            }
            // Store the character when it is unique.
            if (isUnique) temporary[uniqueCount++] = text.charAt(i);
        }
        // Create the exact-sized result array.
        char[] result = new char[uniqueCount];
        // Copy unique characters into the result.
        for (int i = 0; i < uniqueCount; i++) result[i] = temporary[i];
        // Return the unique characters.
        return result;
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take text input.
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Find unique characters.
        char[] result = findUniqueCharacters(text);
        // Display the result.
        System.out.println("Unique characters:");
        // Print every unique character.
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        // Move to the next line.
        System.out.println();
        // Close Scanner.
        sc.close();
    }
}
