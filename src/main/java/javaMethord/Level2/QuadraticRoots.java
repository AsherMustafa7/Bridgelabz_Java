/*
 * Question:
 * Write a program named Quadratic to find the roots of the equation
 * ax squared plus bx plus c. Use Math.pow and Math.sqrt.
 *
 * Hints:
 * 1. Take a, b, and c as input values.
 * 2. Calculate delta using b squared minus 4 multiplied by a and c.
 * 3. If delta is positive, find two roots.
 * 4. If delta is zero, find one root.
 * 5. If delta is negative, return an empty array or nothing.
 * 6. Write a method to find the roots and return the roots.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class QuadraticRoots {

    // Find and return the roots of a quadratic equation.
    public double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            return new double[0];
        }

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        }

        return new double[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticRoots quadratic = new QuadraticRoots();

        // Take the coefficients from the user.
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double[] roots = quadratic.findRoots(a, b, c);

        // Display the roots.
        if (a == 0) {
            System.out.println("The equation is not quadratic.");
        } else if (roots.length == 0) {
            System.out.println("There are no real roots.");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }

        sc.close();
    }
}
