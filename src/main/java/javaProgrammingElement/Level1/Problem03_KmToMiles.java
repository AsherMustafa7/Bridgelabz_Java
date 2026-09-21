/*
Problem 3 - GCR Level 1 Practice Programs
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem03_KmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8; // Store the distance in kilometers.
        double miles = kilometers * 1.6; // Convert kilometers to miles.

        System.out.println("The distance " + kilometers + " km in miles is " + miles); // Display the converted distance.
    }
}
