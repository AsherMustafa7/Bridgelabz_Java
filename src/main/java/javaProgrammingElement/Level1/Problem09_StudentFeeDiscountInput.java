/*
Problem 9 - GCR Level 1 Practice Programs
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem09_StudentFeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter student fee: "); // Ask for the student fee.
        double fee = input.nextDouble(); // Read the fee.
        System.out.print("Enter discount percentage: "); // Ask for the discount percentage.
        double discountPercent = input.nextDouble(); // Read the discount percentage.
        double discount = fee * discountPercent / 100; // Calculate the discount amount.
        double discountedFee = fee - discount; // Calculate the final discounted fee.

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); // Display the results.
        input.close(); // Close the Scanner object.
    }
}
