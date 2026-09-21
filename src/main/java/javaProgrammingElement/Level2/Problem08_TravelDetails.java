/*
Problem 8 - GCR Level 2 Practice Programs
Rewrite the Sample Program 2 with user inputs

Hint =>
1. Create variables and take user inputs for name, fromCity, viaCity, toCity
2. Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
3. Create Variables and take time taken
4. Finally, print the result and try to understand operator precedence.

I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem08_TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter name: "); // Ask for the person's name.
        String name = input.nextLine(); // Read the person's name.
        System.out.print("Enter from city: "); // Ask for the starting city.
        String fromCity = input.nextLine(); // Read the starting city.
        System.out.print("Enter via city: "); // Ask for the intermediate city.
        String viaCity = input.nextLine(); // Read the intermediate city.
        System.out.print("Enter destination city: "); // Ask for the destination city.
        String toCity = input.nextLine(); // Read the destination city.
        System.out.print("Enter distance from starting city to via city in miles: "); // Ask for the first distance.
        double fromToVia = input.nextDouble(); // Read the first distance.
        System.out.print("Enter distance from via city to final city in miles: "); // Ask for the second distance.
        double viaToFinalCity = input.nextDouble(); // Read the second distance.
        System.out.print("Enter total time taken in hours: "); // Ask for the total travel time.
        double timeTaken = input.nextDouble(); // Read the travel time.
        double totalDistance = fromToVia + viaToFinalCity; // Calculate total distance.
        double averageSpeed = totalDistance / timeTaken; // Calculate average speed.

        System.out.println("Name: " + name); // Display the person's name.
        System.out.println("Journey: " + fromCity + " to " + viaCity + " to " + toCity); // Display the route.
        System.out.println("Total Distance: " + totalDistance + " miles"); // Display total distance.
        System.out.println("Time Taken: " + timeTaken + " hours"); // Display total time.
        System.out.println("Average Speed: " + averageSpeed + " miles per hour"); // Display average speed.
        input.close(); // Close the Scanner object.
    }
}
