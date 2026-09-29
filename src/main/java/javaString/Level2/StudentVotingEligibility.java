package javaString.Level2;
/*
Question:
8. Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on whether the age is greater than or equal to 18.

Hints:
1. Create a method to generate random 2-digit ages of n students and return a 1D array.
2. Create a method that takes the age array and returns a 2D String array containing age and a boolean true or false to indicate can or cannot vote.
3. Validate negative ages. A negative age cannot vote.
4. For valid ages, age 18 or above means can vote.
5. Create a method to display the 2D array in a tabular format.
6. The main function takes user input, calls the methods, and displays the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class StudentVotingEligibility {

    // Generate random two-digit ages for the requested number of students.
    public static int[] generateRandomAges(int numberOfStudents) {
        // Create the age array.
        int[] ages = new int[numberOfStudents];

        // Generate one age for every student.
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate a random age from 10 to 99.
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        // Return all generated ages.
        return ages;
    }

    // Determine voting eligibility for every age.
    public static String[][] checkVotingEligibility(int[] ages) {
        // Create two columns for age and eligibility.
        String[][] result = new String[ages.length][2];

        // Process every student's age.
        for (int i = 0; i < ages.length; i++) {
            // Store the age as a String.
            result[i][0] = String.valueOf(ages[i]);

            // Check negative, valid adult, and valid minor cases.
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        // Return the eligibility table.
        return result;
    }

    // Display the voting eligibility table.
    public static void displayTable(String[][] data) {
        // Display the table heading.
        System.out.printf("%-12s %-15s %-20s%n", "Student", "Age", "Can Vote");
        System.out.println("-----------------------------------------------");

        // Display every student's result.
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-12d %-15d %-20s%n",
                    i + 1,
                    Integer.parseInt(data[i][0]),
                    data[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the number of students from the user.
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Check that the number of students is positive.
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be greater than 0.");
        } else {
            // Generate random ages.
            int[] ages = generateRandomAges(numberOfStudents);

            // Check voting eligibility.
            String[][] result = checkVotingEligibility(ages);

            // Display the results.
            displayTable(result);
        }

        // Close the Scanner object.
        sc.close();
    }
}
