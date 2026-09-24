/*
11. Write a program calculate the wind chill temperature given the temperature and wind speed

Hint =>
1. Write a method to calculate the wind chill temperature using the formula

windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
public double calculateWindChill(double temperature, double windSpeed)
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class WindChillTemperature {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WindChillTemperature windChillTemperature = new WindChillTemperature();

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = sc.nextDouble();

        double windChill = windChillTemperature.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + windChill);

        sc.close();
    }
}
