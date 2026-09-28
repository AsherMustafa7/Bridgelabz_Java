/*
Question:
Find the frequency of characters in a string using unique characters and display the result.
Hint:
1. Find unique characters using charAt and nested loops.
2. Create an ASCII frequency array.
3. Call the uniqueCharacters method inside the frequency method.
4. Return a 2D String array containing unique characters and frequencies.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class CharacterFrequencyUsingUnique {
    // Find unique characters using nested loops.
    public static char[] findUniqueCharacters(String text) {
        // Create a temporary array for unique characters.
        char[] temporary = new char[text.length()];
        // Store the unique count.
        int uniqueCount = 0;
        // Check every character.
        for (int i = 0; i < text.length(); i++) {
            // Assume the character is unique.
            boolean isUnique = true;
            // Compare with all previous characters.
            for (int j = 0; j < i; j++) {
                // Mark it as repeated when a match is found.
                if (text.charAt(i) == text.charAt(j)) { isUnique = false; break; }
            }
            // Store a unique character.
            if (isUnique) temporary[uniqueCount++] = text.charAt(i);
        }
        // Create the exact-sized result array.
        char[] result = new char[uniqueCount];
        // Copy unique characters.
        for (int i = 0; i < uniqueCount; i++) result[i] = temporary[i];
        // Return unique characters.
        return result;
    }
    // Find frequencies using the unique character array.
    public static String[][] findFrequency(String text) {
        // Create an ASCII frequency array.
        int[] frequency = new int[256];
        // Count every character.
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        // Find unique characters.
        char[] uniqueCharacters = findUniqueCharacters(text);
        // Create the result table.
        String[][] result = new String[uniqueCharacters.length][2];
        // Store each unique character and its frequency.
        for (int i = 0; i < uniqueCharacters.length; i++) {
            result[i][0] = String.valueOf(uniqueCharacters[i]);
            result[i][1] = String.valueOf(frequency[uniqueCharacters[i]]);
        }
        // Return the table.
        return result;
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take text input.
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Find frequencies.
        String[][] result = findFrequency(text);
        // Print headings.
        System.out.println("\nCharacter\tFrequency");
        // Print the table.
        for (int i = 0; i < result.length; i++) System.out.println(result[i][0] + "\t\t" + result[i][1]);
        // Close Scanner.
        sc.close();
    }
}
