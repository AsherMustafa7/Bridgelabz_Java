/*
Question:
3. Extend or Create a NumberChecker utility class and perform the following tasks. Call the different methods from main and display the results. Make sure all methods are static.

Hints:
1. Method to find the count of digits and store the digits in an array.
2. Method to find the sum of digits using the digits array.
3. Method to find the sum of squares of digits using Math.pow.
4. Method to check if a number is a Harshad number.
5. Method to find the frequency of each digit using a 2D array with digit in the first column and frequency in the second column.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NumberCheckerPart2 {

    // Count the digits of the number.
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

    // Convert the number into an ordered digits array.
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

    // Find the sum of digits.
    public static int findDigitSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Find the sum of squares of digits.
    public static int findSquareSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }
        return sum;
    }

    // Check whether the number is Harshad.
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findDigitSum(digits);
        return sum != 0 && number % sum == 0;
    }

    // Find the frequency of every digit.
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        int count = 0;
        for (int value : frequency) {
            if (value > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int row = 0;
        for (int digit = 0; digit < frequency.length; digit++) {
            if (frequency[digit] > 0) {
                result[row][0] = digit;
                result[row][1] = frequency[digit];
                row++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get the digits array.
        int[] digits = getDigits(number);

        // Calculate and display the digit sum.
        System.out.println("Digit sum: " + findDigitSum(digits));

        // Calculate and display the square sum.
        System.out.println("Square sum: " + findSquareSum(digits));

        // Display the Harshad result.
        System.out.println("Harshad number: " + isHarshadNumber(number, digits));

        // Find the frequency table.
        int[][] frequency = findDigitFrequency(digits);

        // Display the frequency table.
        System.out.println("Digit Frequency");
        for (int[] row : frequency) {
            System.out.println(row[0] + " " + row[1]);
        }

        // Close the scanner.
        sc.close();
    }
}
