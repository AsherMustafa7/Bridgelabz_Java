package JavaRegex.Intermediateregexandgroups;


import java.util.regex.*;

public class Groupregex {
    public static void main(String[] args) {
        String input = "Order ID: ORD-2026-145";

        Pattern p = Pattern.compile("ORD-(\\d{4})-(\\d+)");
        Matcher m = p.matcher(input);

        if (m.find()) {
            System.out.println("Full match: " + m.group(0));
            System.out.println("Year: " + m.group(1));
            System.out.println("Order number: " + m.group(2));
            System.out.println("Start: " + m.start());
            System.out.println("End: " + m.end());
        }
    }
}