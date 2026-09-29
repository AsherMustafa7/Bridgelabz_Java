package objectOrientedProgrammingFundamentals.level2;

/*
 * Question:
 * Create a Student class with attributes name, rollNumber, and marks.
 * Add methods to calculate the grade based on the marks and to display
 * the student's details and grade.
 *
 * Hint:
 * Use private attributes, a constructor, getter and setter methods,
 * a method to calculate the grade, and a method to display details.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */

public class Student {

    // Store the student's name
    private String name;

    // Store the student's roll number
    private int rollNumber;

    // Store the student's marks
    private double marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter to return the student's name
    public String getName() {
        return name;
    }

    // Setter to update the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter to return the student's roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter to update the student's roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter to return the student's marks
    public double getMarks() {
        return marks;
    }

    // Setter to update the student's marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Calculate the grade from the marks
    public char calculateGrade() {
        // The problem statement does not provide grade ranges,
        // so these ranges are used as an explicit simple assumption.
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Display the student's details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Asher", 101, 85);

        // Display the student's details
        student.displayDetails();
    }
}
