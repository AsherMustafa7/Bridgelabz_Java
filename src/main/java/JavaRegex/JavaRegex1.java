package JavaRegex;
import java.util.regex.*;
public class JavaRegex1 
{
    public static void main(String[] args) 
    {
        String input = "Hello, my name is Asher. I am 25 years old.";
        String regex = "\\b\\w+\\b"; // Matches whole words
        // what is the difference between \\w and \\b in regex?
        // \\w matches any word character (alphanumeric or underscore)
        // \\b matches a word boundary, which is the position between a word character and a non-word character
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(input);

        System.out.println("Words found in the input string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
