/*
Question:
4. Extend or Create a NumberChecker utility class and perform the following tasks. Call the different methods from main and display the results. Make sure all methods are static.

Hints:
1. Method to find digit count and store digits in an array.
2. Method to reverse the digits array.
3. Method to compare two arrays and check whether they are equal.
4. Method to check if a number is a palindrome using the digits.
5. Method to check if a number is a duck number using the digits array.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NumberCheckerPart3 {

    // Count the digits in a number.
    public static int countDigits(int number) {
        int temp = Math.abs(number);
        if (temp == 0) {
            return 1;
        }
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Store the digits in original order.
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Reverse the digits array.
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Compare two arrays element by element.
    public static boolean compareArrays(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

    // Check whether the number is a palindrome.
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    // Check whether a non-zero digit is present.
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create the digits array.
        int[] digits = getDigits(number);

        // Create the reversed array.
        int[] reversed = reverseArray(digits);

        // Display the original digits.
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Display the reversed digits.
        System.out.print("Reversed: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Display the array comparison result.
        System.out.println("Arrays equal: " + compareArrays(digits, reversed));

        // Display the palindrome result.
        System.out.println("Palindrome: " + isPalindrome(digits));

        // Display the duck result.
        System.out.println("Duck number: " + isDuckNumber(digits));

        // Close the scanner.
        sc.close();
    }
}
