/*
 * InputStreamReader Problem 1: Convert Bytes to Characters
 *
 * Problem Statement:
 * Read a text file encoded in UTF-8 by converting its byte stream into a character stream with InputStreamReader, then print each line.
 *
 * Hint:
 * Wrap FileInputStream with InputStreamReader using StandardCharsets.UTF_8, then wrap it with BufferedReader.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class ReadBytesAsCharactersInputStreamReader {
    // Run the program.
    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "src\\main\\java\\JavaSearching\\input.txt";
        // Convert bytes to UTF-8 characters and buffer line reading.
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            // Print each decoded line.
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}
