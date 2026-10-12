/*
 * Challenge: Compare String Builders and Count Words in Files
 *
 * Problem Statement:
 * Compare StringBuilder and StringBuffer while appending hello one million times. Then read a text file with both FileReader and InputStreamReader and count words, reporting elapsed times.
 *
 * Hint:
 * Use nanoTime for elapsed time, BufferedReader for efficient line reading, and UTF-8 for InputStreamReader. Supply a file path as the first command-line argument; the default is input.txt.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class StringAndFileIOChallenge {
    // Count whitespace-separated words through a BufferedReader.
    static long countWords(BufferedReader br) throws IOException {
        long count = 0;
        String line;
        // Read one line at a time to avoid loading the whole file into memory.
        while ((line = br.readLine()) != null) {
            String trimmed = line.trim();
            if (!trimmed.isEmpty()) count += trimmed.split("\\s+").length;
        }
        return count;
    }
    // Run the benchmark.
    public static void main(String[] args) {
        int n = 1_000_000;
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder(n * 5);
        for (int i = 0; i < n; i++) sb.append("hello");
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer(n * 5);
        for (int i = 0; i < n; i++) sf.append("hello");
        long bufferTime = System.nanoTime() - start;

        System.out.printf("StringBuilder append time: %.3f ms%n", builderTime / 1_000_000.0);
        System.out.printf("StringBuffer append time: %.3f ms%n", bufferTime / 1_000_000.0);

        String path = args.length > 0 ? args[0] : "input.txt";
        try {
            long startFile = System.nanoTime();
            long words;
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                words = countWords(br);
            }
            long fileReaderTime = System.nanoTime() - startFile;

            long startInput = System.nanoTime();
            long wordsUtf8;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(path), StandardCharsets.UTF_8))) {
                wordsUtf8 = countWords(br);
            }
            long inputReaderTime = System.nanoTime() - startInput;

            System.out.println("FileReader word count: " + words);
            System.out.printf("FileReader time: %.3f ms%n", fileReaderTime / 1_000_000.0);
            System.out.println("InputStreamReader word count: " + wordsUtf8);
            System.out.printf("InputStreamReader time: %.3f ms%n", inputReaderTime / 1_000_000.0);
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}
