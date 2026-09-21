/*
Problem 11 - GCR Level 2 Practice Programs
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem11_SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter principal: "); // Ask for the principal amount.
        double principal = input.nextDouble(); // Read the principal.
        System.out.print("Enter rate of interest: "); // Ask for the interest rate.
        double rate = input.nextDouble(); // Read the rate.
        System.out.print("Enter time: "); // Ask for the time period.
        double time = input.nextDouble(); // Read the time.
        double simpleInterest = principal * rate * time / 100; // Calculate simple interest.

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time); // Display the simple interest details.
        input.close(); // Close the Scanner object.
    }
}
