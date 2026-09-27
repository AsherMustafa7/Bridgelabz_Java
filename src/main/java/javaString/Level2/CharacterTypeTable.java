/*
Question:
6. Write a program to find vowels and consonants in a string and display the character type as Vowel, Consonant, or Not a Letter.

Hints:
1. Create a method to check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter.
2. Convert uppercase letters to lowercase using ASCII values.
3. Create a method to find vowels and consonants in a string using charAt and return the character and type in a 2D array.
4. Create a method to display the 2D array of Strings in a tabular format.
5. The main function takes user input, calls the methods, and displays the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class CharacterTypeTable {

    // Determine the type of a character.
    public static String checkCharacterType(char character) {
        // Convert an uppercase letter to lowercase using ASCII values.
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Return Not a Letter when the character is outside a to z.
        if (character < 'a' || character > 'z') {
            return "Not a Letter";
        }

        // Return Vowel for the five vowel characters.
        if (character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u') {
            return "Vowel";
        }

        // Return Consonant for the remaining English letters.
        return "Consonant";
    }

    // Create a 2D array containing every character and its type.
    public static String[][] createCharacterTypeArray(String text) {
        // Create two columns for character and type.
        String[][] result = new String[text.length()][2];

        // Process every character.
        for (int i = 0; i < text.length(); i++) {
            // Store the character as a String.
            result[i][0] = String.valueOf(text.charAt(i));

            // Store the character type.
            result[i][1] = checkCharacterType(text.charAt(i));
        }

        // Return the 2D array.
        return result;
    }

    // Display the 2D array in a table.
    public static void displayTable(String[][] data) {
        // Display the table heading.
        System.out.printf("%-15s %-20s%n", "Character", "Type");
        System.out.println("-----------------------------------");

        // Display every character and its type.
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s %-20s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the complete text from the user.
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Create the character and type array.
        String[][] result = createCharacterTypeArray(text);

        // Display the result in a table.
        displayTable(result);

        // Close the Scanner object.
        sc.close();
    }
}
