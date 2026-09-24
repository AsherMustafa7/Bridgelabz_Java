/*
12. Write a program to calculate various trigonometric functions using Math class given an angle in degrees

Hint =>
1. Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.

public double[] calculateTrigonometricFunctions(double angle)
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class TrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = trigonometricFunctions.calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        sc.close();
    }
}
