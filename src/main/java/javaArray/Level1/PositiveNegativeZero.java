/*
1. Write a program to take user input for 5 numbers and check whether a number is positive,
negative, or zero. Further for positive numbers check if the number is even or odd. Finally
compare the first and last elements of the array and display if they equal, greater or less

Hint =>
1. Define an integer array of 5 elements and get user input to store in the array.
2. Loop through the array using the length. If the number is positive, check for even or odd
numbers and print accordingly.
3. If the number is negative, print negative. Else if the number is zero, print zero.
4. Finally compare the first and last element of the array and display if they equal, greater or less

* Author: Asher Mustafa
* Date: 23-09-2026
*/
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }

        sc.close();
    }
}
