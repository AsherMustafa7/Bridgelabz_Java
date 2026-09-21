/*
Problem 10 - GCR Level 2 Practice Programs
Create a program to divide N number of chocolates among M children.

Hint =>
1. Get an integer value from user for the numberOfchocolates and numberOfChildren.
2. Find the number of chocolates each child gets and number of remaining chocolates
3. Display the results

I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem10_ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter number of chocolates: "); // Ask for the number of chocolates.
        int numberOfchocolates = input.nextInt(); // Read the number of chocolates.
        System.out.print("Enter number of children: "); // Ask for the number of children.
        int numberOfChildren = input.nextInt(); // Read the number of children.
        int chocolatesPerChild = numberOfchocolates / numberOfChildren; // Calculate chocolates received by each child.
        int remainingChocolates = numberOfchocolates % numberOfChildren; // Calculate remaining chocolates.

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates); // Display the distribution results.
        input.close(); // Close the Scanner object.
    }
}
