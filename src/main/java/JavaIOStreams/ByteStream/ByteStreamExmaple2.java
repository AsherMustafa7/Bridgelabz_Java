package JavaIOStreams.ByteStream;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExmaple2 {
    public static void main(String[] args) {

        String fileName = "Outputfiles/ByteStreamExmaple2output.txt";

        // Step 1: Write data into the file
        try (FileOutputStream output =
                     new FileOutputStream(fileName)) {

            String message = "Hi there this is Asher.";

            byte[] data = message.getBytes(
                    java.nio.charset.StandardCharsets.UTF_8
            );

            output.write(data);

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
            return;
        }

        // Step 2: Read data from the file
        try (FileInputStream input =
                     new FileInputStream(fileName)) {

            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            System.out.println();

        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}
