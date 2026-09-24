/*
7. Write a program to find the sum of n natural numbers using loop

Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class SumNaturalNumbers {
    public int calculateNaturalNumberSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumNaturalNumbers naturalNumbers = new SumNaturalNumbers();

        System.out.print("Enter n: ");
        int number = sc.nextInt();

        int sum = naturalNumbers.calculateNaturalNumberSum(number);
        System.out.println("Sum of first " + number + " natural numbers: " + sum);

        sc.close();
    }
}
