package javaString.Level3;

/* 
Question 8:
Check if two texts are anagrams and display the result.
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases
Hint:
1. Check if the lengths of the two texts are equal.
2. Create frequency arrays for both texts.
3. Find the character frequencies using loops.
4. Compare the two frequency arrays.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class AnagramCheck {
    // Check whether two texts are anagrams.
    public static boolean checkAnagram(String firstText, String secondText) {
        // Different lengths cannot be anagrams.
        if (firstText.length() != secondText.length()) return false;
        // Create frequency arrays for ASCII characters.
        int[] firstFrequency = new int[256];
        int[] secondFrequency = new int[256];
        // Count characters in the first text.
        for (int i = 0; i < firstText.length(); i++) firstFrequency[firstText.charAt(i)]++;
        // Count characters in the second text.
        for (int i = 0; i < secondText.length(); i++) secondFrequency[secondText.charAt(i)]++;
        // Compare every ASCII frequency.
        for (int i = 0; i < 256; i++) if (firstFrequency[i] != secondFrequency[i]) return false;
        // All frequencies match.
        return true;
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Take first text.
        System.out.print("Enter the first text: ");
        String firstText = sc.nextLine();
        // Take second text.
        System.out.print("Enter the second text: ");
        String secondText = sc.nextLine();
        // Check the texts.
        boolean result = checkAnagram(firstText, secondText);
        // Display the result.
        System.out.println("Are the texts anagrams: " + result);
        // Close Scanner.
        sc.close();
    }
}
