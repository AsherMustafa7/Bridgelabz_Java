/*
 * Question:
 * Write a program to take user input for the age of all 10 students in
 * a class and check whether each student can vote.
 * A student can vote when the age is greater than or equal to 18.
 *
 * Hints:
 * 1. Create a class named StudentVoteChecker.
 * 2. Define a method named canStudentVote that takes age as a parameter
 *    and returns true or false.
 * 3. If the age is negative, return false.
 * 4. In the main method, define an array of 10 integer elements.
 * 5. Take input for each student age, call canStudentVote, and display the result.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class StudentVoteChecker {

    // Check whether a student can vote.
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        // Take the ages of 10 students.
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check and display voting eligibility.
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}
