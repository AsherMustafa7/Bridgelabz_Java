package JavaIOStreams.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyOwnBufferCopyingFiles 
{
    
    public static void main(String[] args) 
    {
        String sourceFilePath = "InputFiles/Inputfile1.txt";
        String destinationFilePath = "Outputfiles/MyOwnBufferCopyingFiles.txt";

          try(FileInputStream input = new FileInputStream(sourceFilePath);FileOutputStream op= new FileOutputStream(destinationFilePath))
        {
            byte[] buffer = new byte[1024]; // Buffer size of 1KB
            int bytesRead;
            System.out.println("Using FileInputStream with buffer to read the data from the file and copying it to another file");
            int i=1;
            while((bytesRead = input.read(buffer)) != -1)
            {
                // when we write input.read(buffer)) we mean that we are reading the data from the input stream into the buffer and then writing it to the output stream.
                // So if the file has something like "Hello My name is Asher Mustafa" 
                // Then for the first iteration, the buffer will contain "Hello My name is Asher Mustafa" and bytesRead will be 30 (the number of bytes read).
                // But why is this why does it happen in only just one iteration.
                // This is because the buffer size is 1024 bytes and the file content is less than that. So the entire content of the file is read in one go. 
                // The 0 here represent the starting index of the buffer and bytesRead is the number of bytes to write from the buffer.
                op.write(buffer, 0, bytesRead);
                // LOOK SO THIS STATEMENT BASICALLY MEANS THAT THE INPUT.READ(BUFFER) WILL GIVE ME THE COUNT OF BYTES TO WRITE ON THE FILE AND THE BUFFER WILL CONTAIN THE ACTUAL DATA TO BE WRITTEN THEN WE WRITE THAT DATA FROM 0 TO THE COUNT OF BYTES READ. SO BASICALLY WE ARE WRITING THE DATA FROM THE BUFFER TO THE OUTPUT STREAM.
                // THE NEXT TIME WHEN THE LOOP RUNS THE BUFFER WILL BE OVERWRITTEN WITH THE NEXT CHUNK OF DATA FROM 
                System.out.println("Iteration " + i + ": Buffer content: " + new String(buffer, 0, bytesRead)); // This will print the content of the buffer for each iteration.
                // The new String(buffer, 0, bytesRead) converts the byte array to a string for display purposes.
                i++;
            }
            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath + " using buffer.");
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    }
}
