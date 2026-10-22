package JavaIOStreams.FileInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

import java.io.FileReader;
public class FileInputStreamTestandFileReader 
{
    public static void main(String[] args) 
    {
        try(FileReader input=new FileReader("InputFiles/Inputfile1.txt"))
        {
            int data;
            System.out.println("NEW VERSION - TEST OF FILE READER Well this is Asher Mustafa");
            while((data=input.read())!=-1) // -1 tells that the end of the stream has been reached
            {
                System.out.println(data+" : "+(char)data);
               
            }
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Now we will use FileInputStream to read the same file");
        try(FileInputStream input=new FileInputStream("InputFiles/Inputfile1.txt"))
        {
            int data;
            while((data=input.read())!=-1)
            {
                System.out.println(data+" : "+(char)data);
               
            }
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    }   
}
