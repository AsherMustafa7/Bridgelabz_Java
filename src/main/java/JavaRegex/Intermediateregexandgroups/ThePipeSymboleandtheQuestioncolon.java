package JavaRegex.Intermediateregexandgroups;
import java.util.regex.*;
public class ThePipeSymboleandtheQuestioncolon 
{
    public static void main(String[] args) {
        String input =
            "cat, bat, rat, mat, catbat, batcat, dog, catdog, batdog";

        test(input, "(?:cat|bat)");
        test(input, "(cat|bat)");
    }

    static void test(String input, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        System.out.println("\nPattern: " + regex);

        while (m.find()) {
            System.out.println(
                "Full match: " + m.group(0) +" Group 0" 
            );

            System.out.println(
                "Number of groups: " + m.groupCount()
            );

            if (m.groupCount() >= 1) {
                System.out.println(
                    "Group 1: " + m.group(1)
                );
            }

            System.out.println(
                "Start: " + m.start() + ", End: " + m.end()
            );
        }
    }
}
