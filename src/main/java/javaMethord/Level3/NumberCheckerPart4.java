/*
Question:
5. Extend or Create a NumberChecker utility class and perform the following tasks. Call the different methods from main and display the results. Make sure all methods are static.

Hints:
1. Method to check if a number is prime.
2. Method to check if a number is neon.
3. Method to check if a number is spy.
4. Method to check if a number is automorphic.
5. Method to check if a number is buzz.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NumberCheckerPart4 {

    // Check whether a number is prime.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check whether the number is neon.
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Check whether digit sum equals digit product.
    public static boolean isSpy(int number) {
        int temp = Math.abs(number);
        if (temp == 0) {
            return true;
        }
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Check whether the square ends with the number.
    public static boolean isAutomorphic(int number) {
        int absoluteNumber = Math.abs(number);
        int square = absoluteNumber * absoluteNumber;
        int temp = absoluteNumber;
        if (temp == 0) {
            return true;
        }
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Check whether the number is divisible by 7 or ends with 7.
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Display each number property.
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));

        // Close the scanner.
        sc.close();
    }
}
