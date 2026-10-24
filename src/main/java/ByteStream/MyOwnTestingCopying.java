package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyOwnTestingCopying 
{
    public static void main(String[] args) 
    {
        String sourceFilePath = "InputFiles/Inputfile1.txt";
        String destinationFilePath = "Outputfiles/MyOwnTestingCopying.txt";

        try(FileInputStream input = new FileInputStream(sourceFilePath);FileOutputStream op= new FileOutputStream(destinationFilePath))
        {
            // coping the file from one file to another file using byte stream
            int data;
            System.out.println("Using FileInputStream to read the data from the file and copying it to another file");
            while((data=input.read())!=-1)
            {
                System.out.print(data+" : "+(char)data+" ");
                // each character will get written. Character by character.
                op.write(data);
            }
            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath);
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
        // Now say we wanted to use Buffer what then
        // We can use a buffer to read and write data in chunks, which is more efficient for large files.
      
}
}