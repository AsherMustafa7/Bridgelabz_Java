/*
Question:
9. Write a program to find the Euclidean distance between two points as well as the equation of the line using those two points. Use Math.pow and Math.sqrt.

Hints:
1. Take inputs for x1, y1, x2, y2.
2. Write a method to find the Euclidean distance.
3. Write a method to find the equation of the line using slope and y-intercept.
4. Slope m = y2 minus y1 divided by x2 minus x1.
5. Y-intercept b = y1 minus m times x1.
6. Return an array containing slope and y-intercept.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class EuclideanDistanceAndLineEquation {

    // Calculate the Euclidean distance between two points.
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        double xDifference = x2 - x1;
        double yDifference = y2 - y1;
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    // Calculate the slope and y-intercept.
    public double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            return new double[]{Double.POSITIVE_INFINITY, x1};
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        EuclideanDistanceAndLineEquation calculator = new EuclideanDistanceAndLineEquation();

        // Take the first point.
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Take the second point.
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display distance.
        double distance = calculator.calculateDistance(x1, y1, x2, y2);
        System.out.printf("Distance: %.2f%n", distance);

        // Calculate the line equation values.
        double[] line = calculator.findLineEquation(x1, y1, x2, y2);

        // Display the equation.
        if (Double.isInfinite(line[0])) {
            System.out.println("Line equation: x = " + line[1]);
        } else {
            System.out.printf("Slope: %.2f%n", line[0]);
            System.out.printf("Y-intercept: %.2f%n", line[1]);
            System.out.printf("Line equation: y = %.2fx + %.2f%n", line[0], line[1]);
        }

        // Close the scanner.
        sc.close();
    }
}
