/*
Problem 8 - GCR Control Flow Level 2
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

Hint =>
1. Take user input for the age and height of the 3 friends and store it in a variable
2. Find the smallest of the 3 ages to find the youngest friend and display it
3. Find the largest of the 3 heights to find the tallest friend and display it

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem08_YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.

        System.out.print("Enter Amar's age: "); // Ask for Amar's age.
        int amarAge = input.nextInt(); // Read Amar's age.
        System.out.print("Enter Amar's height in cm: "); // Ask for Amar's height.
        double amarHeight = input.nextDouble(); // Read Amar's height.

        System.out.print("Enter Akbar's age: "); // Ask for Akbar's age.
        int akbarAge = input.nextInt(); // Read Akbar's age.
        System.out.print("Enter Akbar's height in cm: "); // Ask for Akbar's height.
        double akbarHeight = input.nextDouble(); // Read Akbar's height.

        System.out.print("Enter Anthony's age: "); // Ask for Anthony's age.
        int anthonyAge = input.nextInt(); // Read Anthony's age.
        System.out.print("Enter Anthony's height in cm: "); // Ask for Anthony's height.
        double anthonyHeight = input.nextDouble(); // Read Anthony's height.

        String youngest; // Store youngest friend.
        String tallest; // Store tallest friend.

        if (amarAge <= akbarAge && amarAge <= anthonyAge) { // Check Amar's age.
            youngest = "Amar"; // Set Amar as youngest.
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) { // Check Akbar's age.
            youngest = "Akbar"; // Set Akbar as youngest.
        } else { // Anthony has the smallest age.
            youngest = "Anthony"; // Set Anthony as youngest.
        }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) { // Check Amar's height.
            tallest = "Amar"; // Set Amar as tallest.
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) { // Check Akbar's height.
            tallest = "Akbar"; // Set Akbar as tallest.
        } else { // Anthony has the greatest height.
            tallest = "Anthony"; // Set Anthony as tallest.
        }

        System.out.println("The youngest friend is " + youngest); // Display youngest friend.
        System.out.println("The tallest friend is " + tallest); // Display tallest friend.
        input.close(); // Close Scanner.
    }
}
