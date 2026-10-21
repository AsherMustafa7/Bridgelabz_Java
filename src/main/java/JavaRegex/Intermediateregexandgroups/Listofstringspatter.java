package JavaRegex.Intermediateregexandgroups;
import java.util.regex.*;
public class Listofstringspatter 
{
    public static void main(String[] args) 
    {
        String[] arr = {"apple123 456", "banana 123", "cherry 789", "date23", "elder45berry","123456789"};
        String pattern = "\\d+"; // Pattern to match strings containing 'a'
        Pattern p = Pattern.compile(pattern);
        System.out.println("Strings containing we are using matches function notice: "); //only the strings that fully match the pattern will be printed
        for (String str : arr) 
        {
            Matcher m = p.matcher(str);
            while (m.matches()) 
            {
                System.out.print(m.group()+"\t");
                System.out.print("Start index: " + m.start()+"\t");
                System.out.println("End index: " + m.end()+"\t");
                 break; // Exit the loop after finding the first match
            }
        }
        System.out.println("Strings containing we are using find() function notice: "); // find() method will find the first occurrence of the pattern in the string and return true if found, otherwise false
        for (String str : arr) 
        {
            Matcher m = p.matcher(str);
            while (m.find()) 
            {
                System.out.print(m.group()+"\t");
                System.out.print("Start index: " + m.start()+"\t");
                System.out.println("End index: " + m.end()+"\t");
                 // Exit the loop after finding the first match
            }
        }
    }
}
