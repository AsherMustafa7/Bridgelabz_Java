/*
4. An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

Hint =>
1. Take user input for 3 sides of a triangle
2. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
3. Write a Method to compute the number of rounds user needs to do to complete 5km run
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class TriangularParkRounds {
    public double calculateRounds(double side1, double side2, double side3, double distanceInKm) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = distanceInKm * 1000;
        return distanceInMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangularParkRounds parkRounds = new TriangularParkRounds();

        System.out.print("Enter side 1 in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double side3 = sc.nextDouble();

        double rounds = parkRounds.calculateRounds(side1, side2, side3, 5);
        System.out.println("Number of rounds required: " + rounds);

        sc.close();
    }
}
