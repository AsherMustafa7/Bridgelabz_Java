/*
Question:
Find the first non-repeating character in a string and show the result.
Hint:
1. A non-repeating character occurs only once.
2. Create a frequency array of 256 using ASCII values as indexes.
3. Count frequencies, then scan the text again for the first frequency of one.
4. The main method takes input, calls the method, and displays the result.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    // Find the first character whose frequency is one.
    public static char findFirstNonRepeatingCharacter(String text) {
        // Create the ASCII frequency array.
        int[] frequency = new int[256];
        // Count every character.
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        // Check characters in original order.
        for (int i = 0; i < text.length(); i++) {
            // Return the first character with frequency one.
            if (frequency[text.charAt(i)] == 1) return text.charAt(i);
        }
        // Return the null character when none exists.
        return '\0';
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take text input.
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Find the first non-repeating character.
        char result = findFirstNonRepeatingCharacter(text);
        // Display the result.
        if (result != '\0') System.out.println("First non-repeating character: " + result);
        else System.out.println("No non-repeating character found.");
        // Close Scanner.
        sc.close();
    }
}
