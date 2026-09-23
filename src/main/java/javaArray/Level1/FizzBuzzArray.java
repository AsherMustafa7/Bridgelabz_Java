/*
9. Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number
and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz",
and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format
Position 1 = 1, …, Position 3 = Fizz,...

Hint =>
1. Create a String Array to save the results and
2. Finally, loop again to show the results of the array based on the index position

* Author: Asher Mustafa
* Date: 23-09-2026
*/
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

        String[] results = new String[number];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        sc.close();
    }
}
