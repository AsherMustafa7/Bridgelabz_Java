/*
Problem 3 - GCR Level 2 Practice Programs
Similarly, write the DoubleOpt program by taking double values and doing the same operations.

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem03_DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter a: "); // Ask for the first double value.
        double a = input.nextDouble(); // Read a from the user.
        System.out.print("Enter b: "); // Ask for the second double value.
        double b = input.nextDouble(); // Read b from the user.
        System.out.print("Enter c: "); // Ask for the third double value.
        double c = input.nextDouble(); // Read c from the user.
        double result1 = a + b * c; // Calculate a + b * c.
        double result2 = a * b + c; // Calculate a * b + c.
        double result3 = c + a / b; // Calculate c + a / b.
        double result4 = a % b + c; // Calculate a % b + c.

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4); // Display all operation results.
        input.close(); // Close the Scanner object.
    }
}
