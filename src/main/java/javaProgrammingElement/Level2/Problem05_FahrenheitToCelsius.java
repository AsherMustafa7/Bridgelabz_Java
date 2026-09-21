/*
Problem 5 - GCR Level 2 Practice Programs
Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius

Hint =>
3. Create a fahrenheit variable and take the user's input
4. User the formulae to convert Fahrenheit to Celsius: (°F − 32) x 5/9 = °C and assign the result to celsiusResult and print the result

I/P => fahrenheit
O/P => The ____ fahrenheit is ____ celsius

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem05_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter temperature in Fahrenheit: "); // Ask for Fahrenheit temperature.
        double fahrenheit = input.nextDouble(); // Read the Fahrenheit temperature.
        double celsiusResult = (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius.

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius"); // Display the converted temperature.
        input.close(); // Close the Scanner object.
    }
}
