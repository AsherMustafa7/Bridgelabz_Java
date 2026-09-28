/*
Question:
Find the BMI of all 10 team members and display height, weight, BMI, and status.
Hint:
1. Take weight in kg and height in cm in a 2D array of 10 rows.
2. Create a method to calculate BMI and status and return a 2D String array.
3. Create a method that processes the 2D input array and stores height, weight, BMI, and status.
4. Create a method to display the 2D String array in tabular format.
5. The main method takes input, calls methods, and displays the result.
BMI status: less than or equal to 18.4 Underweight, 18.5 to 24.9 Normal, 25.0 to 39.9 Overweight, 40.0 and above Obese.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class BMIOfTenMembers {
    // Calculate BMI from weight and height.
    public static double calculateBMI(double weight, double heightCm) {
        // Convert centimetres to metres.
        double heightMeter = heightCm / 100.0;
        // Return BMI using weight divided by height squared.
        return weight / (heightMeter * heightMeter);
    }
    // Find the status for a BMI value.
    public static String findBMIStatus(double bmi) {
        // Check the BMI ranges.
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
    // Calculate BMI and status for every person.
    public static String[][] calculateBMIAndStatus(double[][] people) {
        // Create columns for height, weight, BMI, and status.
        String[][] result = new String[people.length][4];
        // Process every person.
        for (int i = 0; i < people.length; i++) {
            // Store height.
            result[i][0] = String.valueOf(people[i][1]);
            // Store weight.
            result[i][1] = String.valueOf(people[i][0]);
            // Calculate and store BMI.
            double bmi = calculateBMI(people[i][0], people[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            // Calculate and store status.
            result[i][3] = findBMIStatus(bmi);
        }
        // Return the result.
        return result;
    }
    // Display the result as a table.
    public static void displayResult(String[][] result) {
        // Print table headings.
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        // Print a separator.
        System.out.println("------------------------------------------------------");
        // Print every row.
        for (int i = 0; i < result.length; i++) {
            // Print the four values.
            System.out.println(result[i][0] + "\t\t" + result[i][1] + "\t\t" + result[i][2] + "\t\t" + result[i][3]);
        }
    }
    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);
        // Create the 10 by 2 input array.
        double[][] people = new double[10][2];
        // Take input for all people.
        for (int i = 0; i < people.length; i++) {
            // Take weight.
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();
            // Take height.
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();
        }
        // Calculate BMI results.
        String[][] result = calculateBMIAndStatus(people);
        // Display the results.
        displayResult(result);
        // Close Scanner.
        sc.close();
    }
}
