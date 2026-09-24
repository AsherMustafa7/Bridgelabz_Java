/*
9. Write a program to take 2 numbers and print their quotient and reminder

Hint =>
1. Take user input as integer
2. Use division operator (/) for quotient and moduli operator (%) for reminder
3. Write Method to find the reminder and the quotient of a number

public static int[] findRemainderAndQuotient(int number, int divisor)
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class RemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close();
    }
}
