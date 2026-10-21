package JavaRegex.Intermediateregexandgroups;
import java.util.regex.*;
public class WordBoundries 
{
    public static void main(String[] args) 
    {
        String arr[] = {"cat", "category","bobcat", "cat"};
        String pattern = "\\bcat\\b"; // Pattern to match the word "cat" as a whole word
        Pattern p = Pattern.compile(pattern);
        for (String str : arr) 
        {
            Matcher m = p.matcher(str);
            while (m.find()) 
            {
                
                System.out.print(m.group()+"\t");
                System.out.print("Start index: " + m.start()+"\t");
                System.out.println("End index: " + m.end()+"\t");
                break; // Exit the loop after finding the first match
            }
        }
    }
}
