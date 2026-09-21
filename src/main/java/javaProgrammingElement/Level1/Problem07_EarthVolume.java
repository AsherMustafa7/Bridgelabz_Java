/*
Problem 7 - GCR Level 1 Practice Programs
Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem07_EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Store Earth's radius in kilometers.
        double pi = Math.PI; // Store the value of pi.
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3); // Calculate Earth's volume in cubic kilometers.
        double radiusMiles = radiusKm / 1.6; // Convert Earth's radius from kilometers to miles.
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3); // Calculate Earth's volume in cubic miles.

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3); // Display both volumes.
    }
}
