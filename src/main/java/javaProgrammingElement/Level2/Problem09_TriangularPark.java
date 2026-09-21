/*
Problem 9 - GCR Level 2 Practice Programs
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem09_TriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter side1 in meters: "); // Ask for the first side.
        double side1 = input.nextDouble(); // Read the first side.
        System.out.print("Enter side2 in meters: "); // Ask for the second side.
        double side2 = input.nextDouble(); // Read the second side.
        System.out.print("Enter side3 in meters: "); // Ask for the third side.
        double side3 = input.nextDouble(); // Read the third side.
        double perimeter = side1 + side2 + side3; // Calculate the triangular park perimeter.
        double totalDistance = 5000; // Convert the required 5 km run to meters.
        double rounds = totalDistance / perimeter; // Calculate the required number of rounds.

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km"); // Display the required rounds.
        input.close(); // Close the Scanner object.
    }
}
