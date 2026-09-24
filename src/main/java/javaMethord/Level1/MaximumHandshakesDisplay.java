/*
3. Create a program to find the maximum number of handshakes among N number of students.

Hint =>
1. Get integer input for numberOfStudents variable.
2. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
3. Display the number of possible handshakes.
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class MaximumHandshakesDisplay {
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaximumHandshakesDisplay handshakes = new MaximumHandshakesDisplay();

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakesCount = handshakes.calculateHandshakes(numberOfStudents);
        System.out.println("Number of possible handshakes: " + handshakesCount);

        sc.close();
    }
}
