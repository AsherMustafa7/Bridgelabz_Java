package JavaIOStreams.UnicodeExample;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class UnicodeExample {
    public static void main(String[] args) throws IOException {
        String text;
        // Write text using UTF-8
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("Outputfiles/UnicodeExample.txt"),StandardCharsets.UTF_8)) {

            writer.write("A₹😊");
        }

        // Read raw bytes
        try (FileInputStream input =
                new FileInputStream("Outputfiles/UnicodeExample.txt")) {

            int data;
            while ((data = input.read()) != -1) {
                System.out.printf("%02X ", data);
            }
        }

        System.out.println();

        // Decode UTF-8 bytes into characters
        try (Reader reader = new InputStreamReader(
                new FileInputStream("Outputfiles/UnicodeExample.txt"),
                StandardCharsets.UTF_8)) {

            int data;
            while ((data = reader.read()) != -1) {
                System.out.println(
                    "Character: " + new String(Character.toChars(data))
                );
            }
        }
        try (Reader reader = new InputStreamReader(
        new FileInputStream("Outputfiles/UnicodeExample.txt"),
        StandardCharsets.UTF_8)) 
        {

            int data;

            while ((data = reader.read()) != -1) {
                System.out.printf("Code unit: U+%04X%n", data);
                System.out.println("Just data: " + data);
            }
        }
        try (Reader reader = new InputStreamReader(
                new FileInputStream("Outputfiles/UnicodeExample.txt"),
                StandardCharsets.UTF_8)) {

            StringBuilder sb = new StringBuilder();
            int data;

            while ((data = reader.read()) != -1) {
                sb.append((char) data);
            }

             text = sb.toString();
        }

        text.codePoints().forEach(codePoint -> {
            System.out.printf("Code point: U+%04X%n", codePoint);
            System.out.println(
                "Character: " + new String(Character.toChars(codePoint))
            );
        });
    }
}