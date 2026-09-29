package javaString.Level2;
/*
Question:
3. Write a program to split the text into words and return the words along with their lengths in a 2D array.

Hints:
1. Take user input using Scanner nextLine.
2. Create a method to split the text into words using charAt without using String split.
3. Create a method to find and return a string's length without using length.
4. Create a method to take the word array and return a 2D String array of the word and its corresponding length.
5. Use String.valueOf to generate the String value for the number.
6. During display convert the length value from String to Integer and display it in a table.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class WordsAndLengths {

    // Find the length of a string without using length.
    public static int findLength(String text) {
        // Start counting from zero.
        int count = 0;

        // Keep reading characters until charAt throws an exception.
        while (true) {
            try {
                // Access the character at the current index.
                text.charAt(count);

                // Increase the count for a valid character.
                count++;
            } catch (StringIndexOutOfBoundsException exception) {
                // Stop after the final character.
                break;
            }
        }

        // Return the string length.
        return count;
    }

    // Split the text into words using charAt.
    public static String[] splitWords(String text) {
        // Find the text length.
        int length = findLength(text);

        // Count the number of words.
        int wordCount = 0;
        boolean insideWord = false;

        for (int i = 0; i < length; i++) {
            // Read the current character.
            char ch = text.charAt(i);

            // Detect the beginning of a word.
            if (ch != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;
            } else if (ch == ' ') {
                // Detect the end of a word.
                insideWord = false;
            }
        }

        // Create the word array.
        String[] words = new String[wordCount];

        // Extract each word.
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                if (start < i) {
                    String word = "";

                    // Build the word one character at a time.
                    for (int j = start; j < i; j++) {
                        word += text.charAt(j);
                    }

                    words[wordIndex] = word;
                    wordIndex++;
                }

                // Set the start of the next word.
                start = i + 1;
            }
        }

        // Return the word array.
        return words;
    }

    // Create a 2D array containing each word and its length.
    public static String[][] createWordLengthArray(String[] words) {
        // Create two columns for word and length.
        String[][] result = new String[words.length][2];

        // Process every word.
        for (int i = 0; i < words.length; i++) {
            // Store the word in the first column.
            result[i][0] = words[i];

            // Find the length without using length.
            int wordLength = findLength(words[i]);

            // Convert the integer length into a String.
            result[i][1] = String.valueOf(wordLength);
        }

        // Return the 2D result.
        return result;
    }

    // Display the 2D word and length array.
    public static void displayTable(String[][] data) {
        // Display the table heading.
        System.out.println();
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("------------------------------");

        // Display every row.
        for (int i = 0; i < data.length; i++) {
            // Convert the String length back to Integer.
            int length = Integer.parseInt(data[i][1]);

            // Display the word and length.
            System.out.printf("%-20s %-10d%n", data[i][0], length);
        }
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the complete sentence from the user.
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split the text into words.
        String[] words = splitWords(text);

        // Create the word and length 2D array.
        String[][] result = createWordLengthArray(words);

        // Display the result in a table.
        displayTable(result);

        // Close the Scanner object.
        sc.close();
    }
}
