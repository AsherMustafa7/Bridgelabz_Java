/*
Question:
Find the frequency of characters in a string using nested loops and display the result.
Hint:
1. Convert the text to a character array using toCharArray.
2. Use an outer loop and an inner loop to find duplicate characters.
3. Set duplicate characters to zero to avoid counting them again.
4. Return a 1D String array containing characters and frequencies.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class CharacterFrequencyNestedLoops {
    // Find character frequencies using nested loops.
    public static String[] findFrequency(String text) {
        // Convert the text to a character array.
        char[] characters = text.toCharArray();
        // Create the frequency array.
        int[] frequency = new int[characters.length];
        // Process every character.
        for (int i = 0; i < characters.length; i++) {
            // Skip a character already marked as duplicate.
            if (characters[i] == '\0') continue;
            // Start this character frequency at one.
            frequency[i] = 1;
            // Compare with all following characters.
            for (int j = i + 1; j < characters.length; j++) {
                // Count a duplicate.
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '\0';
                }
            }
        }
        // Count the number of different characters.
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) if (frequency[i] > 0) uniqueCount++;
        // Create the final result array.
        String[] result = new String[uniqueCount];
        // Store characters and frequencies.
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            // Store only counted characters.
            if (frequency[i] > 0) {
                result[index] = String.valueOf(text.charAt(i)) + " : " + frequency[i];
                index++;
            }
        }
        // Return the result.
        return result;
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take text input.
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Find frequencies.
        String[] result = findFrequency(text);
        // Print the result.
        System.out.println("Character frequencies:");
        // Display every result.
        for (int i = 0; i < result.length; i++) System.out.println(result[i]);
        // Close Scanner.
        sc.close();
    }
}
