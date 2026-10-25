package JavaIOStreams.ByteStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamToCopyFromToAFile {
    public static void main(String[] args) {

        String source = "Inputfiles/ByteStreamToCopyFromToAFile.pdf";
        String destination = "Outputfiles/ByteStreamToCopyFromToAFile_copy.pdf";

        try (FileInputStream input =new FileInputStream(source);FileOutputStream output =new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("File copy failed: "
                    + e.getMessage());
        }
    }
}
