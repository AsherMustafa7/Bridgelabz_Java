package ByteStream;
import java.io.FileInputStream;
import java.io.FileReader;
public class FileReaderandFileInputStream 
{
    public static void main(String[] args) 
    {
        String filePath= "InputFiles/Inputfile1.txt";
        try(FileInputStream input = new FileInputStream(filePath);)
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
            System.out.println();
            
        }
        catch(Exception e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
        try(FileReader fr= new FileReader(filePath))
        {
            int data;
            int count=1;
            System.out.println("Using FileReader to read the data from the file");
            while((data=fr.read())!=-1)
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
            System.out.println();
            
        }
        catch(Exception e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    }
}
