/*
 * Question:
 * Create a PalindromeChecker class with an attribute text.
 * Add methods to check if the text is a palindrome and display the result.
 *
 * Hint:
 * Store the text as a private attribute.
 * Use a method to compare characters from the beginning and end.
 * Use another method to display the result.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */

public class PalindromeChecker {

    // Store the text to be checked
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter to return the text
    public String getText() {
        return text;
    }

    // Setter to update the text
    public void setText(String text) {
        this.text = text;
    }

    // Check whether the text is a palindrome
    public boolean checkPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            // Move the indexes toward the center
            start++;
            end--;
        }

        // Return true when all characters match
        return true;
    }

    // Display the palindrome result
    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + checkPalindrome());
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker("madam");

        // Display the result
        checker.displayResult();
    }
}
