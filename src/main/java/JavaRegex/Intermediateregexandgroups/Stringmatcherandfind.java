package JavaRegex.Intermediateregexandgroups;
import java.util.regex.*;
public class Stringmatcherandfind 
{
    public static void main(String[] args) 
    {
        Pattern p = Pattern.compile("\\d+");

        Matcher m1 = p.matcher("123");
        Matcher m2 = p.matcher("abc123 456 789");

        while (m1.find()) {
            System.out.println(m1.matches());
            System.out.println(m1.group());
            System.out.println(m1.start());
        }

        while (m2.find()) {
            
            System.out.println(m1.group());
            System.out.println(m1.start());
        }
    }
}
