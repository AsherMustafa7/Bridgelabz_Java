/*
 * Question:
 * Create a program to find the factors of a number taken as user input,
 * store the factors in an array and display the factors.
 * Also find the sum, sum of square of factors and product of the factors
 * and display the results.
 *
 * Hints:
 * 1. Take the input for a number.
 * 2. Write a static method to find the factors of the number and save them
 *    in an array and return the array.
 * 3. Use two loops. The first loop counts the factors and the second loop
 *    stores the factors in the array.
 * 4. Write a method to find the sum of the factors using the factors array.
 * 5. Write a method to find the product of the factors using the factors array.
 * 6. Write a method to find the sum of square of the factors using Math.pow.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class FactorsOfNumber {

    // Find and return all factors of the number.
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store the factors in the array.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Find the sum of all factors.
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Find the product of all factors.
    public static long findProduct(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Find the sum of squares of all factors.
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;

        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        int[] factors = findFactors(number);

        // Display the factors.
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();
        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        sc.close();
    }
}
