/*
 * Question:
 * Write a program to find the sum of n natural numbers using a recursive
 * method and compare the result with the formula n multiplied by n plus 1
 * divided by 2. Show that both computations give the same result.
 *
 * Hints:
 * 1. Take the user input number and check whether it is a natural number.
 *    If not, exit.
 * 2. Write a method to find the sum of n natural numbers using recursion.
 * 3. Write a method to find the sum using the formula n multiplied by n plus 1
 *    divided by 2.
 * 4. Compare the two results and print the result.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class RecursiveNaturalSum {

    // Find the sum of natural numbers using recursion.
    public static int findRecursiveSum(int number) {
        if (number == 0) {
            return 0;
        }

        return number + findRecursiveSum(number - 1);
    }

    // Find the sum using the mathematical formula.
    public static int findFormulaSum(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number from the user.
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a natural number.");
            sc.close();
            return;
        }

        int recursiveSum = findRecursiveSum(number);
        int formulaSum = findFormulaSum(number);

        // Display both results.
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare both results.
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("The computations are not equal.");
        }

        sc.close();
    }
}
