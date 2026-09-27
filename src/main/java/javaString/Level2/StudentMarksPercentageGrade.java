/*
Question:
10. Create a program to take input marks of students in 3 subjects Physics, Chemistry, and Maths. Compute the percentage and then calculate the grade as shown in the reference table.

Grade rules:
A = 80 percent and above
B = 70 to 79 percent
C = 60 to 69 percent
D = 50 to 59 percent
E = 40 to 49 percent
R = 39 percent and below

Hints:
1. Write a method to generate random 2-digit scores for Physics, Chemistry and Math and return the scores in a 2D array for all students.
2. Write a method to calculate the total, average, and percentage for each student and return a 2D array. Round values to 2 digits using Math.round.
3. Write a method to calculate the grade based on the percentage and return a 2D array of students' grades.
4. Write a method to display the scorecard of all students with their scores, total, average, percentage, and grade in tabular format.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class StudentMarksPercentageGrade {

    // Generate random two-digit marks for Physics, Chemistry, and Maths.
    public static int[][] generateMarks(int numberOfStudents) {
        // Create the 2D marks array.
        int[][] marks = new int[numberOfStudents][3];

        // Generate marks for every student.
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate a Physics mark from 10 to 99.
            marks[i][0] = (int) (Math.random() * 90) + 10;

            // Generate a Chemistry mark from 10 to 99.
            marks[i][1] = (int) (Math.random() * 90) + 10;

            // Generate a Maths mark from 10 to 99.
            marks[i][2] = (int) (Math.random() * 90) + 10;
        }

        // Return the marks array.
        return marks;
    }

    // Calculate total, average, and percentage for every student.
    public static double[][] calculateResults(int[][] marks) {
        // Create columns for total, average, and percentage.
        double[][] results = new double[marks.length][3];

        // Process every student.
        for (int i = 0; i < marks.length; i++) {
            // Calculate the total marks.
            double total = marks[i][0] + marks[i][1] + marks[i][2];

            // Calcu late the average marks.
            double average = total / 3.0;

            // Calculate the percentage out of 300.
            double percentage = (total / 300.0) * 100;

            // Round total to two decimal places.
            results[i][0] = Math.round(total * 100.0) / 100.0;

            // Round average to two decimal places.
            results[i][1] = Math.round(average * 100.0) / 100.0;

            // Round percentage to two decimal places.
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        // Return all calculated results.
        return results;
    }

    // Calculate the grade from each student's percentage.
    public static String[][] calculateGrades(double[][] results) {
        // Create one column for the grade.
        String[][] grades = new String[results.length][1];

        // Process every student's percentage.
        for (int i = 0; i < results.length; i++) {
            // Read the percentage.
            double percentage = results[i][2];

            // Assign the grade using the reference ranges.
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        // Return the grades.
        return grades;
    }

    // Display the complete student scorecard.
    public static void displayScorecard(int[][] marks, double[][] results, String[][] grades) {
        // Display the table heading.
        System.out.println();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-8s%n","Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------");

        // Display every student's scorecard.
        for (int i = 0; i < marks.length; i++) {
            // Print all values for the current student.
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-12.2f %-12.2f %-8s%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][0]);
        }

        // Display the table ending line.
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the number of students from the user.
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Validate the number of students.
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be greater than 0.");
        } else {
            // Generate PCM marks.
            int[][] marks = generateMarks(numberOfStudents);

            // Calculate total, average, and percentage.
            double[][] results = calculateResults(marks);

            // Calculate grades.
            String[][] grades = calculateGrades(results);

            // Display the complete scorecard.
            displayScorecard(marks, results, grades);
        }

        // Close the Scanner object.
        sc.close();
    }
}
