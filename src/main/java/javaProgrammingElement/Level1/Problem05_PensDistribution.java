/*
Problem 5 - GCR Level 1 Practice Programs
Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem05_PensDistribution {
    public static void main(String[] args) {
        int pens = 14; // Store the total number of pens.
        int students = 3; // Store the number of students.
        int pensPerStudent = pens / students; // Calculate pens received by each student.
        int remainingPens = pens % students; // Calculate the remaining pens.

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens); // Display the results.
    }
}
