package JavaRegex.Intermediateregexandgroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groupcounter {
    public static void main(String[] args) 
    {
        String input = "abcd";
        Pattern p = Pattern.compile("((ab)(cd))");
        Matcher m = p.matcher(input);

        if (m.matches()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println(
                    "Group " + i + " = " + m.group(i)
                );
            }
        }
    }
}
 