package JavaConstructor.level1;

/*
 * Question:
 * Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 *
 * Hint:
 * Use this() in the default constructor to call the parameterized constructor. Calculate area and circumference.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        System.out.println("Default Constructor:");
        circle1.displayDetails();
        System.out.println("\nParameterized Constructor:");
        circle2.displayDetails();
    }
}
