/*
Problem 10 - GCR Level 1 Practice Programs
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem10_HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter your height in centimeters: "); // Ask for height in centimeters.
        double height = input.nextDouble(); // Read the height.
        double totalInches = height / 2.54; // Convert centimeters to total inches.
        int feet = (int) (totalInches / 12); // Calculate complete feet.
        double inches = totalInches % 12; // Calculate the remaining inches.

        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches); // Display the converted height.
        input.close(); // Close the Scanner object.
    }
}
