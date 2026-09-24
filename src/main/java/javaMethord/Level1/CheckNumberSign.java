/*
5. Write a program to check whether a number is positive, negative, or zero.

Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class CheckNumberSign {
    public int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNumberSign numberSign = new CheckNumberSign();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = numberSign.checkNumberSign(number);

        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
