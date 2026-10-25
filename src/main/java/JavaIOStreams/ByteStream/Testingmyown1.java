package JavaIOStreams.ByteStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class Testingmyown1 
{
    public static void main(String[] args)
    {
        String filePath= "InputFiles/Inputfile1.txt";
        String OutputFilePath="Outputfiles/Testingmyown1Output.txt";
        try(FileInputStream input = new FileInputStream(filePath))
        {
            int data;
            int count=1;
            System.out.println("Using FileInputStream to read the data from the file");
            while((data=input.read())!=-1)
            {
                System.out.print(data+" : "+(char)data+" ");
                if(count==100)
                {
                    break;
                }
                if(count%9==0)
                {
                    System.out.println();
                }
                count++;
            }
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    
    try(FileInputStream input = new FileInputStream(filePath);FileOutputStream op= new FileOutputStream(OutputFilePath))
    {
        // coping the file from one file to another file using byte stream
        int data;
        System.out.println("Using FileInputStream to read the data from the file and copying it to another file");
        while((data=input.read())!=-1)
        {
            op.write(data);
        }
    }
    catch(IOException e)
    {
        System.out.println("Hi there this is the Error: "+ e.getMessage());
    }
}
}
