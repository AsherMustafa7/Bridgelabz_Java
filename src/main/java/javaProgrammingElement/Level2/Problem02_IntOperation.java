/*
Problem 2 - GCR Level 2 Practice Programs
Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators.

Hint =>
1. Create variables a, b, c of int data type.
2. Take user input for a, b, and c.
3. Compute 3 integer operations and assign result to a variable
4. Finally print the result and try to understand operator precedence.

I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem02_IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.
        System.out.print("Enter a: "); // Ask for the first integer.
        int a = input.nextInt(); // Read a from the user.
        System.out.print("Enter b: "); // Ask for the second integer.
        int b = input.nextInt(); // Read b from the user.
        System.out.print("Enter c: "); // Ask for the third integer.
        int c = input.nextInt(); // Read c from the user.
        int result1 = a + b * c; // Calculate a + b * c using operator precedence.
        int result2 = a * b + c; // Calculate a * b + c using operator precedence.
        int result3 = c + a / b; // Calculate c + a / b using operator precedence.
        int result4 = a % b + c; // Calculate a % b + c using operator precedence.

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4); // Display all operation results.
        input.close(); // Close the Scanner object.
    }
}
