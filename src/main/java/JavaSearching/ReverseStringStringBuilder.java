/*
 * StringBuilder Problem 1: Reverse a String Using StringBuilder
 *
 * Problem Statement:
 * Read or define a string, reverse it using StringBuilder, and display the reversed result. For example, hello becomes olleh.
 *
 * Hint:
 * Create a StringBuilder from the string, call reverse(), and convert the result back to a String.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.util.Scanner;

class ReverseStringStringBuilder {
    // Run the program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the full input line.
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        // Build a mutable string from the input.
        StringBuilder sb = new StringBuilder(s);
        // Reverse the characters and display the result.
        System.out.println("Reversed string: " + sb.reverse());
        sc.close();
    }
}
