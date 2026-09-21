/*
Problem 5 - GCR Control Flow Level 1
Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

Hint =>
1. Get integer input from the user and store it in the age variable.
2. If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote."

I/P => age
O/P => If the person's age is greater or equal to 18 then the output is
The person's age is ___ and can vote.
Otherwise
The person's age is ___ and cannot vote.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem05_CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter age: "); // Ask for the person's age.
        int age = input.nextInt(); // Read the age.

        if (age >= 18) { // Check whether the person is at least 18.
            System.out.println("The person's age is " + age + " and can vote."); // Display that the person can vote.
        } else { // Execute when the age is below 18.
            System.out.println("The person's age is " + age + " and cannot vote."); // Display that the person cannot vote.
        }

        input.close(); // Close the Scanner object.
    }
}
