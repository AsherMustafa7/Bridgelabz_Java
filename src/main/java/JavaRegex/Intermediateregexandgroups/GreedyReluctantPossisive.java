package JavaRegex.Intermediateregexandgroups;
import java.util.regex.*;
public class GreedyReluctantPossisive 
{
    public static void main(String[] args) 
    {
        String input = "abc123def456ghi789";
        String greedyPattern = "\\d+"; // Greedy pattern
        String reluctantPattern = "\\d+?"; // Reluctant pattern
        String possessivePattern = "\\d++"; // Possessive pattern
        String PossivePattern2 = "\\d*+"; // Possessive pattern
        System.out.println("Greedy Pattern Matches:");
        Pattern greedy = Pattern.compile(greedyPattern);
        Matcher greedyMatcher = greedy.matcher(input);
        while (greedyMatcher.find()) 
        {
            System.out.println("Found: " + greedyMatcher.group());
            System.out.println("Start index: " + greedyMatcher.start());
            System.out.println("End index: " + greedyMatcher.end());
        }
        // explination of \\d+ will basically match one or more digits in a greedy manner, meaning it will try to match as many digits as possible. In the input string "abc123def456ghi789", the greedy pattern will find three matches: "123", "456", and "789". Each match is printed along with its start and end indices in the input string.
        System.out.println("\nReluctant Pattern Matches:");
        Pattern reluctant = Pattern.compile(reluctantPattern);
        Matcher reluctantMatcher = reluctant.matcher(input);
        while (reluctantMatcher.find()) 
        {
            System.out.println("Found: " + reluctantMatcher.group());
            System.out.println("Start index: " + reluctantMatcher.start());
            System.out.println("End index: " + reluctantMatcher.end());
        }
        // explination of \\d+? will match one or more digits in a reluctant manner, meaning it will try to match as few digits as possible. In the input string "abc123def456ghi789", the reluctant pattern will find three matches: "1", "2",  "3" , "4", "5", "6", "7", "8", and "9". Each match is printed along with its start and end indices in the input string.
        System.out.println("\nPossessive Pattern Matches:");
        Pattern possessive = Pattern.compile(possessivePattern);
        Matcher possessiveMatcher = possessive.matcher(input);
        while (possessiveMatcher.find()) 
        {
            System.out.println("Found: " + possessiveMatcher.group());
            System.out.println("Start index: " + possessiveMatcher.start());
            System.out.println("End index: " + possessiveMatcher.end());
        }
        // explination of \\d++ will match one or more digits in a possessive manner, meaning it will try to match as many digits as possible and will not give up any characters once they have been matched. In the input string "abc123def456ghi789", the possessive pattern will find three matches: "123", "456", and "789". Each match is printed along with its start and end indices in the input string.
        System.out.println("\nPossessive Pattern Matches2:");
        Pattern possessive2 = Pattern.compile(PossivePattern2);
        Matcher possessiveMatcher2 = possessive2.matcher(input);
        while (possessiveMatcher2.find()) 
        {
            System.out.println("Found: " + possessiveMatcher2.group());
            System.out.println("Start index: " + possessiveMatcher2.start());
            System.out.println("End index: " + possessiveMatcher2.end());
        }
        // explination of \\d*+ will match zero or more digits (Koi bhi digit nahi-> * , ya phir sabkuch ->+) in a possessive manner, meaning it will try to match as many digits as possible and will not give up any characters once they have been matched. In the input string "abc123def456ghi789", the possessive pattern will find three matches: empty, empty, empty , 123, empty, empty, empty, 456, empty, empty, empty, 789, empty . Each match is printed along with its start and end indices in the input string.
    }
}
