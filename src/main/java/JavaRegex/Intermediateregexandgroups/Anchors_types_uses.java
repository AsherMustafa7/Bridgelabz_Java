/**
 * Anchors are used to match a position within a string. 
 * They do not consume any characters in the string, but rather assert whether a match is possible at a given position.
 * 
 * There are two main types of anchors:
 * 1. ^ (Caret): Matches the start of a string or line.
 * 2. $ (Dollar Sign): Matches the end of a string or line.
 * 
 * Uses of anchors:
 * - To ensure that a pattern matches only at the beginning or end of a string.
 * - To validate input formats, such as phone numbers, email addresses, etc.
 * - To extract specific parts of a string based on their position.
 * Regex	Meaning
^	Beginning of input, or line in multiline mode
$	End of input, or line in multiline mode
\A	Absolute beginning of input
\Z	End of input, allowing a final line terminator
\z	Absolute end of input
 */
package JavaRegex.Intermediateregexandgroups;

import java.util.regex.Pattern;

public class Anchors_types_uses 
{
    public static void main(String[] args) 
    {
        String input = "123abc";
        String input2 = "abc345"; // Pattern to match strings that start with digits and end with 'abc'
        System.out.println(Pattern.matches("\\d+", input));
        System.out.println(Pattern.compile("^\\d+").matcher(input).find());
        System.out.println(Pattern.compile("\\d+$").matcher(input).find());
        System.out.println(Pattern.compile("^\\d+").matcher(input2).find()); // false because input2 does not start with digits
        System.out.println(Pattern.compile("\\d+$").matcher(input2).find()); // true because input2 ends with digits
        // now lets see \A and \Z and \z
        /*  Suppose the input ends with a newline:
            String input = "hello\n";
            In Java's default regex mode, `$` can match before a final line terminator, whereas `\z` 
            matches only at the absolute end of the input */
        System.out.println(Pattern.compile("\\A\\d+").matcher(input).find()); // true because input starts with digits
        System.out.println(Pattern.compile("\\Z\\d+").matcher(input).find()); // false because input does not end with digits
        System.out.println(Pattern.compile("\\z\\d+").matcher(input).find());
        String input3 = "hello\n"; // false because input does not end with digits
        System.out.println(Pattern.compile("hello$").matcher(input3).find()); // true because input3 ends with 'hello' before the newline
        System.out.println(Pattern.compile("hello\\z").matcher(input3).find()); // false because input3 does not end with 'hello' at the absolute end of the string


        
    }
}
