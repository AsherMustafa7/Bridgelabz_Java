/*
 * InputStreamReader Problem 2: Read Console Input and Write to a File
 *
 * Problem Statement:
 * Read lines from the console using InputStreamReader and BufferedReader, and write each line to a file. Stop when the user enters exit.
 *
 * Hint:
 * Use BufferedReader around InputStreamReader(System.in) and BufferedWriter around FileWriter. Use try-with-resources for the file writer.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleInputToFileInputStreamReader {
    // Run the program.
    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "output.txt";
        // Keep the console reader open while the program runs.
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines to save. Type exit to finish.");
        // Open the output file and close it automatically.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String line;
            // Read until the user types exit.
            while ((line = console.readLine()) != null && !line.equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Saved input to " + path);
        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
}
