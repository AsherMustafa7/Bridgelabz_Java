/*
Problem 4 - GCR Level 1 Practice Programs
Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem04_ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129; // Store the cost price.
        double sellingPrice = 191; // Store the selling price.
        double profit = sellingPrice - costPrice; // Calculate the profit.
        double profitPercentage = profit / costPrice * 100; // Calculate the profit percentage.

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice
                + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); // Display all results.
    }
}
