/*
2. Create a program to print a multiplication table of a number.

Hint =>
1. Get an integer input and store it in the number variable. Also, define an integer array
to store the results of multiplication from 1 to 10.
2. Run a loop from 1 to 10 and store the results in the multiplication table array.
3. Finally, display the result from the array in the format number * i = ___

* Author: Asher Mustafa
* Date: 23-09-2026
*/
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        sc.close();
    }
}
