/*
Problem 12 - GCR Level 2 Practice Programs
Create a program to convert weight in pounds to kilograms.

Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem12_PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter weight in pounds: "); // Ask for the weight in pounds.
        double weight = input.nextDouble(); // Read the weight.
        double weightInKg = weight * 2.2; // Convert pounds to kilograms according to the given hint.

        System.out.println("The weight of the person in pound is " + weight + " and in kg is " + weightInKg); // Display the weight in both units.
        input.close(); // Close the Scanner object.
    }
}
