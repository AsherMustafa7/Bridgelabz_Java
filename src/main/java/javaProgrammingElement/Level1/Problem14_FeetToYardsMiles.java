/*
Problem 14 - GCR Level 1 Practice Programs
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem14_FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter distance in feet: "); // Ask for the distance in feet.
        double distanceInFeet = input.nextDouble(); // Read the distance.
        double distanceInYards = distanceInFeet / 3; // Convert feet to yards.
        double distanceInMiles = distanceInYards / 1760; // Convert yards to miles.

        System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles); // Display both converted distances.
        input.close(); // Close the Scanner object.
    }
}
