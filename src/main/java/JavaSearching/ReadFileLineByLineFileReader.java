/*
 * FileReader Problem 1: Read a File Line by Line
 *
 * Problem Statement:
 * Read a text file one line at a time using FileReader wrapped in BufferedReader, printing each line to the console.
 *
 * Hint:
 * Use try-with-resources so the reader closes automatically. Pass the file path as the first command-line argument or use the default file name.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFileLineByLineFileReader {
    // Run the program.
    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "input.txt";
        // Open the file and close it automatically after reading.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            // Read and print one line at a time.
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}
