/*
 * Question:
 * Create a UnitConvertor utility class with static methods for:
 * 1. Fahrenheit to Celsius.
 * 2. Celsius to Fahrenheit.
 * 3. Pounds to kilograms.
 * 4. Kilograms to pounds.
 * 5. Gallons to liters.
 * 6. Liters to gallons.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class UnitConverterTemperature {

    // Convert Fahrenheit to Celsius.
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = 5.0 / 9.0;
        return (fahrenheit - 32) * fahrenheitToCelsius;
    }

    // Convert Celsius to Fahrenheit.
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = 9.0 / 5.0;
        return (celsius * celsiusToFahrenheit) + 32;
    }

    // Convert pounds to kilograms.
    public static double convertPoundsToKg(double pounds) {
        double poundsToKg = 0.453592;
        return pounds * poundsToKg;
    }

    // Convert kilograms to pounds.
    public static double convertKgToPounds(double kilograms) {
        double kgToPounds = 2.20462;
        return kilograms * kgToPounds;
    }

    // Convert gallons to liters.
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Convert liters to gallons.
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for each conversion.
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter kilograms: ");
        double kilograms = sc.nextDouble();

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();

        // Display conversion results.
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Pounds to kilograms: " + convertPoundsToKg(pounds));
        System.out.println("Kilograms to pounds: " + convertKgToPounds(kilograms));
        System.out.println("Gallons to liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}
