/*
 * Question:
 * Create a UnitConvertor utility class with static methods for:
 * 1. Kilometers to miles.
 * 2. Miles to kilometers.
 * 3. Meters to feet.
 * 4. Feet to meters.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class UnitConverterDistance {

    // Convert kilometers to miles.
    public static double convertKmToMiles(double kilometers) {
        double kmToMiles = 0.621371;
        return kilometers * kmToMiles;
    }

    // Convert miles to kilometers.
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Convert meters to feet.
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Convert feet to meters.
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for each conversion.
        System.out.print("Enter kilometers: ");
        double kilometers = sc.nextDouble();

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        // Display conversion results.
        System.out.println("Kilometers to miles: " + convertKmToMiles(kilometers));
        System.out.println("Miles to kilometers: " + convertMilesToKm(miles));
        System.out.println("Meters to feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to meters: " + convertFeetToMeters(feet));

        sc.close();
    }
}
