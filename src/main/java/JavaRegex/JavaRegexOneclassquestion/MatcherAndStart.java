package JavaRegex.JavaRegexOneclassquestion;

import java.util.regex.*;

public class MatcherAndStart{
    public static void main(String[] args) {
        String input = "Order 125, Order 450, Order 890";

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(
                m.group() + " starts at " + m.start()
            );
        }
        boolean valid = Pattern.matches("\\d+", "12345");
        System.out.println("Is '12345' a valid number? " + valid);
    }
}