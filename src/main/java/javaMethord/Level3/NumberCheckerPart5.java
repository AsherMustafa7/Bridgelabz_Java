/*
Question:
6. Extend or Create a NumberChecker utility class and perform the following tasks. Call the different methods from main and display the results. Make sure all methods are static.

Hints:
1. Method to find factors and return them as an array. Use two for loops, one for counting and another for storing.
2. Method to find the greatest factor using the factors array.
3. Method to find the sum of factors.
4. Method to find the product of factors.
5. Method to find the product of cubes of factors using Math.pow.
6. Method to check whether a number is perfect.
7. Method to check whether a number is abundant.
8. Method to check whether a number is deficient.
9. Method to check whether a number is strong.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class NumberCheckerPart5 {

    // Find and return all factors of a number.
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.abs(number); i++) {
            if (number != 0 && number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= Math.abs(number); i++) {
            if (number != 0 && number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Find the greatest factor.
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Find the sum of factors.
    public static int findFactorSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Find the product of factors.
    public static long findFactorProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Find the product of cubes of factors.
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Find the sum of proper divisors.
    public static int findProperDivisorSum(int number) {
        if (number <= 1) {
            return 0;
        }
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Check whether the number is perfect.
    public static boolean isPerfect(int number) {
        return number > 1 && findProperDivisorSum(number) == number;
    }

    // Check whether the number is abundant.
    public static boolean isAbundant(int number) {
        return number > 0 && findProperDivisorSum(number) > number;
    }

    // Check whether the number is deficient.
    public static boolean isDeficient(int number) {
        return number > 0 && findProperDivisorSum(number) < number;
    }

    // Find the factorial of a digit.
    public static int factorial(int digit) {
        int result = 1;
        for (int i = 2; i <= digit; i++) {
            result *= i;
        }
        return result;
    }

    // Check whether the number is strong.
    public static boolean isStrong(int number) {
        int temp = Math.abs(number);
        int sum = 0;
        if (temp == 0) {
            return false;
        }
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == Math.abs(number);
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the factors.
        int[] factors = findFactors(number);

        // Display the factors.
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display factor calculations.
        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Factor sum: " + findFactorSum(factors));
        System.out.println("Factor product: " + findFactorProduct(factors));
        System.out.println("Product of factor cubes: " + findProductOfCubes(factors));

        // Display number classifications.
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));

        // Close the scanner.
        sc.close();
    }
}
