package JavaIOStreams.CharacterstreamsFileReaderandFileWriter;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CharacterstreamsFileReaderandFileWriter {
    public static void main(String[] args) {

        String fileName = "Outputfiles/CharacterstreamsFileReaderandFileWriter.txt";

        // Write text using a character writer
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName, StandardCharsets.UTF_8))) {

            writer.write("Java I/O Streams");
            writer.newLine();
            writer.write("Readers and Writers handle text.");

            System.out.println("Text written.");

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
            return;
        }

        // Read text using a character reader
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName, StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
