/*
 * Question:
 * Program to Compute Area of a Circle
 * Problem Statement:
 * Write a program to create a Circle class with an attribute radius.
 * Add methods to calculate and display the area and circumference of the circle.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class Circle {
    // Store the radius of the circle.
    private double radius;

    // Constructor initializes the radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Return the radius.
    public double getRadius() {
        return radius;
    }

    // Set the radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate and return the area.
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate and return the circumference.
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display the circle details.
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Create a circle object and display its details.
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayDetails();
    }
}
