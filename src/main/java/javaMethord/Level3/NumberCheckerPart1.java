/*
Question:
2. Extend or Create a NumberChecker utility class and perform the following tasks. Call the different methods from main and display the results. Make sure all methods are static.

Hints:
1. Method to find the count of digits.
2. Method to store the digits in a digits array.
3. Method to check if a number is a duck number using the digits array. A duck number has a non-zero digit present in it.
4. Method to check if a number is an Armstrong number using the digits array.
5. Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE.
6. Method to find the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NumberCheckerPart1 {

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

    // Store the digits in an array in their original order.
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

    // Check whether the number contains a non-zero digit.
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Check whether the number is an Armstrong number.
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }

    // Find the largest and second largest distinct digits.
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Find the smallest and second smallest distinct digits.
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get the digits array.
        int[] digits = getDigits(number);

        // Find the digit count.
        System.out.println("Digit count: " + digits.length);

        // Display the duck number result.
        System.out.println("Duck number: " + isDuckNumber(digits));

        // Display the Armstrong result.
        System.out.println("Armstrong number: " + isArmstrongNumber(number, digits));

        // Find the largest values.
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestValues[0]);
        System.out.println("Second largest: " + largestValues[1]);

        // Find the smallest values.
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestValues[0]);
        System.out.println("Second smallest: " + smallestValues[1]);

        // Close the scanner.
        sc.close();
    }
}
