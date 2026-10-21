
package JavaRegex.JavaRegexOneclassquestion;

import java.util.regex.*;

public class Pattern_Matches{
    public static void main(String[] args) {
        
        boolean valid = Pattern.matches("\\d+", "12345");
        System.out.println("Is '12345' a valid number? " + valid);
    }
}