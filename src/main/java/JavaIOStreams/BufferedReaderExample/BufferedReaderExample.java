package JavaIOStreams.BufferedReaderExample;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferedReaderExample 
{
    public static void main(String[] args) 
    {
        try(BufferedReader br = new BufferedReader(new FileReader("InputFiles/Inputfile1.txt")))
        {
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    }   
}
