/*
 * FileReader Problem 2: Count a Word in a File
 *
 * Problem Statement:
 * Read a file using FileReader and BufferedReader, then count how many times a target word occurs as a separate word, ignoring letter case.
 *
 * Hint:
 * Read one line at a time, split on whitespace, and compare each word with equalsIgnoreCase().
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class CountWordInFileFileReader {
    // Run the program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to count: ");
        String target = sc.next();
        String path = args.length > 0 ? args[0] : "input.txt";
        int count = 0;
        // Read the file line by line.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line into words.
                for (String word : line.split("\\s+")) {
                    if (word.equalsIgnoreCase(target)) count++;
                }
            }
            System.out.println("Occurrences: " + count);
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
        sc.close();
    }
}
