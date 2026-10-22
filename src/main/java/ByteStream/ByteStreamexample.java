package ByteStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class ByteStreamexample 
{
    public static void main(String[] args) 
    {
        String FilePath="Outputfiles/ByteStreamexampleOutput.txt";
        try(FileOutputStream output=new FileOutputStream(FilePath))
        {
            String data="This is Asher Mustafa";
            byte[] array=data.getBytes();
            output.write(array);
            System.out.println("Data has been written to the file");
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
        // Input stream now
        try(FileInputStream input=new FileInputStream(FilePath))
        {
            int data;
            System.out.println("Now we will read the data from the file");
            while((data=input.read())!=-1)
            {
                System.out.print(data+" : "+(char)data+" ");
               // know that space is also a character and it has its own ASCII value which is 32
               // if you do this System.out.print((char)data); then it give you "This is Asher Mustafa" just like that.
            }
        }
        catch(IOException e)
        {
            System.out.println("Hi there this is the Error: "+ e.getMessage());
        }
    }
}
