package JavaRegex.JavaRegexOneclassquestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherandfunctions 
{
    public static void main(String[] args) 
    {
        Pattern p = Pattern.compile("\\d+");

        Matcher first = p.matcher("123 abc");
        Matcher second = p.matcher("xyz 456");

        System.out.println(first.find());  // true
        System.out.println(first.group()); // 123
        System.out.println(first.start());  // 0
        System.out.println(first.end());    // 3

        System.out.println(second.find());  // true
        System.out.println(second.group()); // 456
        System.out.println(second.start());  // 4
        System.out.println(second.end());    // 7
    }  
}
