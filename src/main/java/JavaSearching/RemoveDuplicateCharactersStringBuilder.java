/*
 * StringBuilder Problem 2: Remove Duplicate Characters
 *
 * Problem Statement:
 * Use StringBuilder to remove duplicate characters from a string while preserving the first occurrence and original character order.
 *
 * Hint:
 * Track characters already seen with a HashSet. Append a character only the first time it appears.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class RemoveDuplicateCharactersStringBuilder {
    // Return the string with duplicate characters removed.
    static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        // Visit each character in the original order.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Append only characters that have not appeared before.
            if (seen.add(c)) result.append(c);
        }
        return result.toString();
    }
    // Run the program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Without duplicates: " + removeDuplicates(s));
        sc.close();
    }
}
