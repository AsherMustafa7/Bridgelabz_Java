/*
Problem 8 - GCR Level 1 Practice Programs
Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem08_KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        double km; // Declare the distance in kilometers.
        System.out.print("Enter distance in kilometers: "); // Ask the user for the distance.
        km = input.nextDouble(); // Read the distance from the user.
        double miles = km / 1.6; // Convert kilometers to miles.

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km"); // Display the converted distance.
        input.close(); // Close the Scanner object.
    }
}
