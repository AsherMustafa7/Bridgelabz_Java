package JavaRegex.Intermediateregexandgroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyReluctantPossisive2 
{
     public static void main(String[] args) {
        String input =
            "<name>Asher</name><name>Java</name>";

        test(input, "<.*>");
        test(input, "<.*?>");
        test(input, "<[^>]*>");
    }
    
    static void test(String input, String regex) {
        Matcher m = Pattern.compile(regex).matcher(input);

        System.out.println("Pattern: " + regex);

        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println();
    }
}
