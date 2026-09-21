/*
Problem 13 - GCR Level 1 Practice Programs
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem13_SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter the perimeter of the square: "); // Ask for the perimeter.
        double perimeter = input.nextDouble(); // Read the perimeter.
        double side = perimeter / 4; // Calculate the side length.

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter); // Display the side and perimeter.
        input.close(); // Close the Scanner object.
    }
}
