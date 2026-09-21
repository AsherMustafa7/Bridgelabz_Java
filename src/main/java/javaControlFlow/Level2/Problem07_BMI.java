/*
Problem 7 - GCR Control Flow Level 2
Create a program to find the BMI of a person

Hint =>
1. Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
2. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
3. Use the table to determine the weight status of the person

BMI <= 18.4 => Underweight
18.5 - 24.9 => Normal
25.0 - 39.9 => Overweight
>= 40.0 => Obese

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem07_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter weight in kg: "); // Ask for weight.
        double weight = input.nextDouble(); // Read weight in kilograms.
        System.out.print("Enter height in cm: "); // Ask for height.
        double heightCm = input.nextDouble(); // Read height in centimeters.
        double heightMeter = heightCm / 100; // Convert centimeters to meters.
        double bmi = weight / (heightMeter * heightMeter); // Calculate BMI.
        String status; // Store BMI status.

        if (bmi <= 18.4) { // Check underweight range.
            status = "Underweight"; // Assign underweight.
        } else if (bmi <= 24.9) { // Check normal range.
            status = "Normal"; // Assign normal.
        } else if (bmi <= 39.9) { // Check overweight range.
            status = "Overweight"; // Assign overweight.
        } else { // Execute for BMI 40 or above.
            status = "Obese"; // Assign obese.
        }

        System.out.println("BMI: " + bmi + " kg/m^2"); // Display BMI.
        System.out.println("Weight Status: " + status); // Display status.
        input.close(); // Close Scanner.
    }
}
