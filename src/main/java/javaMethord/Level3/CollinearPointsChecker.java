/*
Question:
10. Write a program to find whether three points are collinear using the slope formula and area of triangle formula. Check A 2,4, B 4,6, and C 6,8 as the sample.

Hints:
1. Take inputs for x1, y1, x2, y2, x3, y3.
2. Find whether the points are collinear using slopes.
3. The points are collinear when the slopes are equal.
4. Find whether the points are collinear using the area of triangle formula.
5. The points are collinear when the triangle area is zero.
6. Area = 0.5 times x1 times y2 minus y3 plus x2 times y3 minus y1 plus x3 times y1 minus y2.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class CollinearPointsChecker {

    // Check collinearity using the slope comparison method.
    public boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2,
                                          double x3, double y3) {
        double firstCrossProduct = (y2 - y1) * (x3 - x2);
        double secondCrossProduct = (y3 - y2) * (x2 - x1);
        return Math.abs(firstCrossProduct - secondCrossProduct) < 0.000001;
    }

    // Calculate the area of the triangle formed by three points.
    public double calculateTriangleArea(double x1, double y1, double x2, double y2,
                                        double x3, double y3) {
        return 0.5 * Math.abs(
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        );
    }

    // Check collinearity using the area method.
    public boolean areCollinearUsingArea(double x1, double y1, double x2, double y2,
                                         double x3, double y3) {
        double area = calculateTriangleArea(x1, y1, x2, y2, x3, y3);
        return Math.abs(area) < 0.000001;
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        CollinearPointsChecker checker = new CollinearPointsChecker();

        // Take coordinates for point A.
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Take coordinates for point B.
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Take coordinates for point C.
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();

        // Check using the slope method.
        boolean slopeResult = checker.areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Calculate the triangle area.
        double area = checker.calculateTriangleArea(x1, y1, x2, y2, x3, y3);

        // Check using the area method.
        boolean areaResult = checker.areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display the results.
        System.out.println("Collinear using slope: " + slopeResult);
        System.out.printf("Triangle area: %.2f%n", area);
        System.out.println("Collinear using area: " + areaResult);

        // Close the scanner.
        sc.close();
    }
}
