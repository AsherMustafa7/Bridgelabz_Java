/*
Problem 3 - GCR Control Flow Level 2
Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines

Grade | Remarks | Marks
A | (Level 4, above agency-normalized standards) | 80% and above
B | (Level 3, at agency-normalized standards) | 70-79%
C | (Level 2, below, but approaching agency-normalized standards) | 60-69%
D | (Level 1, well below agency-normalized standards) | 50-59%
E | (Level 1-, too below agency-normalized standards) | 40-49%
R | (Remedial standards) | 39% and below

Hint =>
a. Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

* Author: Asher Mustafa
* Date: 21-09-2026
*/

import java.util.Scanner; // Import Scanner for keyboard input.

public class Problem03_MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object.
        System.out.print("Enter Physics marks: "); // Ask for Physics marks.
        double physics = input.nextDouble(); // Read Physics marks.
        System.out.print("Enter Chemistry marks: "); // Ask for Chemistry marks.
        double chemistry = input.nextDouble(); // Read Chemistry marks.
        System.out.print("Enter Maths marks: "); // Ask for Maths marks.
        double maths = input.nextDouble(); // Read Maths marks.
        double averageMark = (physics + chemistry + maths) / 3; // Calculate the average percentage.
        String grade; // Store the grade.
        String remarks; // Store the remarks.

        if (averageMark >= 80) { // Check Grade A.
            grade = "A"; // Assign A.
            remarks = "Level 4, above agency-normalized standards"; // Assign A remarks.
        } else if (averageMark >= 70) { // Check Grade B.
            grade = "B"; // Assign B.
            remarks = "Level 3, at agency-normalized standards"; // Assign B remarks.
        } else if (averageMark >= 60) { // Check Grade C.
            grade = "C"; // Assign C.
            remarks = "Level 2, below, but approaching agency-normalized standards"; // Assign C remarks.
        } else if (averageMark >= 50) { // Check Grade D.
            grade = "D"; // Assign D.
            remarks = "Level 1, well below agency-normalized standards"; // Assign D remarks.
        } else if (averageMark >= 40) { // Check Grade E.
            grade = "E"; // Assign E.
            remarks = "Level 1-, too below agency-normalized standards"; // Assign E remarks.
        } else { // Execute below 40 percent.
            grade = "R"; // Assign R.
            remarks = "Remedial standards"; // Assign R remarks.
        }

        System.out.println("Average Mark: " + averageMark + "%"); // Display average mark.
        System.out.println("Grade: " + grade); // Display grade.
        System.out.println("Remarks: " + remarks); // Display remarks.
        input.close(); // Close Scanner.
    }
}
