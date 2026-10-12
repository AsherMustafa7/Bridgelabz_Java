/*
 * StringBuffer Problem 1: Concatenate an Array of Strings
 *
 * Problem Statement:
 * Use StringBuffer to concatenate all strings in an array efficiently and print the combined string.
 *
 * Hint:
 * Create one StringBuffer and append each string to it inside a loop.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class ConcatenateStringsStringBuffer {
    // Join all strings using a mutable buffer.
    static String concatenate(String[] values) {
        StringBuffer result = new StringBuffer();
        // Append each string in array order.
        for (String value : values) result.append(value);
        return result.toString();
    }
    // Run the example.
    public static void main(String[] args) {
        String[] values = {"Java", " ", "is", " ", "powerful", "!"};
        System.out.println(concatenate(values));
    }
}
