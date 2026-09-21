/*
Problem 17 - GCR Control Flow Level 1
Create a program to find the bonus of employees based on their years of service.

Hint =>
1. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
2. Take salary and year of service in the year as input.
3. Print the bonus amount.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem17_EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter salary: "); // Ask for the employee salary.
        double salary = input.nextDouble(); // Read the salary.
        System.out.print("Enter years of service: "); // Ask for years of service.
        int yearsOfService = input.nextInt(); // Read the years of service.
        double bonus = 0; // Initialize the bonus to zero.

        if (yearsOfService > 5) { // Check whether service is more than five years.
            bonus = salary * 5 / 100; // Calculate the five percent bonus.
        }

        System.out.println("The bonus amount is INR " + bonus); // Display the bonus amount.
        input.close(); // Close the Scanner object.
    }
}
