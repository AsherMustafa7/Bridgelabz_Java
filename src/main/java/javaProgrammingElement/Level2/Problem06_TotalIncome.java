/*
Problem 6 - GCR Level 2 Practice Programs
Create a program to find the total income of a person by taking salary and bonus from user

Hint =>
1. Create a variable named salary and take user input.
2. Create another variable bonus and take user input.
3. Compute income by adding salary and bonus and print the result

I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem06_TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter salary: "); // Ask for the salary.
        double salary = input.nextDouble(); // Read the salary.
        System.out.print("Enter bonus: "); // Ask for the bonus.
        double bonus = input.nextDouble(); // Read the bonus.
        double income = salary + bonus; // Calculate total income.

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income); // Display salary, bonus, and total income.
        input.close(); // Close the Scanner object.
    }
}
