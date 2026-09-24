/*
2. Create a program to find the maximum number of handshakes among N number of students.

Hint =>
1. Get integer input for number of students
2. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
3. Write a method to use the combination formulae to calculate the number of handshakes
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class MaximumHandshakes {
    public int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaximumHandshakes handshakes = new MaximumHandshakes();

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int maximumHandshakes = handshakes.calculateMaximumHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + maximumHandshakes);

        sc.close();
    }
}
