
/*
 * Question: Word Frequency Counter
 * Read a text file and count the frequency of each word using a HashMap.
 * Ignore case and punctuation.
 * Example: Hello world, hello Java! -> {hello=2, world=1, java=1}
 * Hint: Read the file, convert the text to lowercase, remove punctuation,
 * and split the text into words.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.MapInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Create a Scanner to read the file path.
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the text file path.
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        // Read the file and handle possible file errors.
        try {
            String text = Files.readString(Path.of(path));

            // Convert the text to lowercase and replace punctuation with spaces.
            text = text.toLowerCase().replaceAll("[^\\p{L}\\p{N}\\s]", " ");

            // Create a HashMap to store words and their frequencies.
            Map<String, Integer> map = new HashMap<>();

            // Split the text into individual words.
            for (String word : text.trim().split("\\s+")) {
                // Ignore empty strings.
                if (!word.isEmpty()) {
                    // Increase the word frequency by one.
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            // Display the word frequencies.
            System.out.println(map);

        } catch (IOException e) {
            // Display an error if the file cannot be read.
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Close the Scanner.
        sc.close();
    }
}