/*
 * Question:
 * An organization took up the exercise to find the Body Mass Index of all
 * persons in a team of 10 members. Create a program to find the BMI and
 * display the height, weight, BMI, and status of each individual.
 *
 * Hints:
 * 1. Take user input in double for weight in kg and height in cm.
 *    Store the values in a 2D array of 10 rows and 3 columns.
 *    The first column stores weight, the second column stores height in cm,
 *    and the third column stores BMI.
 * 2. Create a method to find the BMI of every person and populate the array.
 *    Convert height from centimeters to meters before calculating BMI.
 * 3. Create a method to determine the BMI status and return the status array.
 *
 * BMI status:
 * Less than or equal to 18.4 means Underweight.
 * From 18.5 to 24.9 means Normal.
 * From 25.0 to 39.9 means Overweight.
 * Greater than or equal to 40.0 means Obese.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class BMICalculator {

    // Calculate BMI for every person and store it in the third column.
    public void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double heightInCm = people[i][1];
            double heightInMeters = heightInCm / 100.0;

            people[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Determine the BMI status of every person.
    public String[] determineBMIStatus(double[][] people) {
        String[] statuses = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            double bmi = people[i][2];

            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();

        double[][] people = new double[10][3];

        // Take weight and height for 10 people.
        for (int i = 0; i < people.length; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            people[i][0] = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " in cm: ");
            people[i][1] = sc.nextDouble();
        }

        calculator.calculateBMI(people);
        String[] statuses = calculator.determineBMIStatus(people);

        // Display the complete BMI details.
        System.out.println();
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < people.length; i++) {
            System.out.printf(
                    "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    i + 1,
                    people[i][0],
                    people[i][1],
                    people[i][2],
                    statuses[i]
            );
        }

        sc.close();
    }
}
