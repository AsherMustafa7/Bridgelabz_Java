package javaString.Level3;
/*
Question:
Find the frequency of characters in a string using the charAt method and display the result.
Hint:
1. Use an ASCII frequency array of size 256.
2. Loop through the text to find frequencies.
3. Create a 2D array to store characters and frequencies.
4. The main method takes input, calls the method, and displays the result.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class CharacterFrequency {
    // Find character frequencies and return them in a 2D array.
    public static String[][] findCharacterFrequency(String text) {
        // Create an ASCII frequency array.
        int[] frequency = new int[256];
        // Count every character.
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        // Count the different characters.
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) if (frequency[i] > 0) uniqueCount++;
        // Create the result array.
        String[][] result = new String[uniqueCount][2];
        // Start the result position.
        int index = 0;
        // Store each character and frequency.
        for (int i = 0; i < frequency.length; i++) {
            // Store only characters that occurred.
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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
        String[][] result = findCharacterFrequency(text);
        // Print headings.
        System.out.println("\nCharacter\tFrequency");
        // Print the frequency table.
        for (int i = 0; i < result.length; i++) System.out.println(result[i][0] + "\t\t" + result[i][1]);
        // Close Scanner.
        sc.close();
    }
}
