package javaString.Level2;
/*
Question:
5. Write a program to find vowels and consonants in a string and display the count of vowels and consonants in the string.

Hints:
1. Create a method to check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter.
2. Convert an uppercase letter to lowercase using ASCII values.
3. Create a method to find vowels and consonants in a string using charAt and return the count of vowels and consonants in an array.
4. The main function takes user input, calls the methods, and displays the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class VowelConsonantCount {

    // Determine whether a character is a vowel, consonant, or not a letter.
    public static String checkCharacterType(char character) {
        // Convert uppercase English letters to lowercase using ASCII values.
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check whether the character is an English letter.
        if (character < 'a' || character > 'z') {
            return "Not a Letter";
        }

        // Check whether the letter is a vowel.
        if (character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u') {
            return "Vowel";
        }

        // All remaining English letters are consonants.
        return "Consonant";
    }

    // Count vowels and consonants in the string.
    public static int[] countVowelsConsonants(String text) {
        // Store vowel count at index zero and consonant count at index one.
        int[] counts = new int[2];

        // Check every character in the text.
        for (int i = 0; i < text.length(); i++) {
            // Get the current character.
            char character = text.charAt(i);

            // Find the character type.
            String type = checkCharacterType(character);

            // Increase the correct counter.
            if (type.equals("Vowel")) {
                counts[0]++;
            } else if (type.equals("Consonant")) {
                counts[1]++;
            }
        }

        // Return the vowel and consonant counts.
        return counts;
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the complete text from the user.
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find the vowel and consonant counts.
        int[] counts = countVowelsConsonants(text);

        // Display the counts.
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        // Close the Scanner object.
        sc.close();
    }
}
