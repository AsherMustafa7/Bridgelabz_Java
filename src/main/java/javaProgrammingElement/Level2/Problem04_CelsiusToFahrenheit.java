/*
Problem 4 - GCR Level 2 Practice Programs
Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit

Hint =>
1. Create a celsius variable and take the temperature as user input
2. Use the Formulae Celsius to Fahrenheit: (°C × 9/5) + 32 = °F and assign to farenheitResult and print the result

I/P => celcius
O/P => The ____ celsius is ____ fahrenheit

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem04_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter temperature in Celsius: "); // Ask for Celsius temperature.
        double celsius = input.nextDouble(); // Read the Celsius temperature.
        double farenheitResult = (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit.

        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit"); // Display the converted temperature.
        input.close(); // Close the Scanner object.
    }
}
