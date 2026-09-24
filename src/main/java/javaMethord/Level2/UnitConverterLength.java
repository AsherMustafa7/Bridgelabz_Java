/*
 * Question:
 * Create a UnitConvertor utility class with static methods for:
 * 1. Yards to feet.
 * 2. Feet to yards.
 * 3. Meters to inches.
 * 4. Inches to meters.
 * 5. Inches to centimeters.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class UnitConverterLength {

    // Convert yards to feet.
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Convert feet to yards.
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    // Convert meters to inches.
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Convert inches to meters.
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    // Convert inches to centimeters.
    public static double convertInchesToCm(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for each conversion.
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();

        // Display conversion results.
        System.out.println("Yards to feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to yards: " + convertFeetToYards(feet));
        System.out.println("Meters to inches: " + convertMetersToInches(meters));
        System.out.println("Inches to meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to centimeters: " + convertInchesToCm(inches));

        sc.close();
    }
}
