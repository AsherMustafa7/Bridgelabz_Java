/*
Problem 16 - GCR Level 1 Practice Programs
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem16_MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter number of students: "); // Ask for the number of students.
        int numberOfStudents = input.nextInt(); // Read the number of students.
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; // Calculate the maximum number of handshakes.

        System.out.println("The maximum number of possible handshakes is " + handshakes); // Display the number of handshakes.
        input.close(); // Close the Scanner object.
    }
}
