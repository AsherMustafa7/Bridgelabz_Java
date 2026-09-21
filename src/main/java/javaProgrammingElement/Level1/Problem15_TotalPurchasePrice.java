/*
Problem 15 - GCR Level 1 Practice Programs
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem15_TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter unit price: "); // Ask for the unit price.
        double unitPrice = input.nextDouble(); // Read the unit price.
        System.out.print("Enter quantity: "); // Ask for the quantity.
        int quantity = input.nextInt(); // Read the quantity.
        double totalPrice = unitPrice * quantity; // Calculate the total purchase price.

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice); // Display the total price.
        input.close(); // Close the Scanner object.
    }
}
