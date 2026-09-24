/*
 * Question:
 * Write a program to take user input for 5 numbers and check whether each
 * number is positive or negative. For positive numbers, check whether the
 * number is even or odd. Finally compare the first and last elements of
 * the array and display whether they are equal, greater, or less.
 *
 * Hints:
 * 1. Write a method to check whether a number is positive or negative.
 * 2. Write a method to check whether a number is even or odd.
 * 3. Write a method to compare two numbers and return 1, 0, or -1.
 * 4. Loop through the array and call the required methods.
 * 5. Finally compare the first and last elements.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class NumberArrayAnalysis {

    // Return true when the number is positive or zero.
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Return true when the number is even.
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Compare two numbers and return 1, 0, or -1.
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberArrayAnalysis analysis = new NumberArrayAnalysis();

        int[] numbers = new int[5];

        // Take five numbers from the user.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check every number.
        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number + " is negative.");
            } else if (analysis.isEven(number)) {
                System.out.println(number + " is positive and even.");
            } else {
                System.out.println(number + " is positive and odd.");
            }
        }

        int comparisonResult = analysis.compare(numbers[0], numbers[numbers.length - 1]);

        // Display the comparison of the first and last elements.
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}
