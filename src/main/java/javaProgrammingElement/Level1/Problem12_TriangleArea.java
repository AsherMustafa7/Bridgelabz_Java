/*
Problem 12 - GCR Level 1 Practice Programs
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem12_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter base in inches: "); // Ask for the base in inches.
        double baseInches = input.nextDouble(); // Read the base.
        System.out.print("Enter height in inches: "); // Ask for the height in inches.
        double heightInches = input.nextDouble(); // Read the height.
        double areaSquareInches = 0.5 * baseInches * heightInches; // Calculate area in square inches.
        double baseCm = baseInches * 2.54; // Convert base to centimeters.
        double heightCm = heightInches * 2.54; // Convert height to centimeters.
        double areaSquareCm = 0.5 * baseCm * heightCm; // Calculate area in square centimeters.

        System.out.println("The area of the triangle is " + areaSquareInches + " square inches and " + areaSquareCm + " square centimeters."); // Display both areas.
        input.close(); // Close the Scanner object.
    }
}
