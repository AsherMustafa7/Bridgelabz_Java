package javaStatics.level1;

/*
 * Question:
 * Create a Student class to manage student data with the following features:
 * 1. Static:
 *    - A static variable universityName shared across all students.
 *    - A static method displayTotalStudents() to show the number of students enrolled.
 * 2. This:
 *    - Use this in the constructor to initialize name, rollNumber, and grade.
 * 3. Final:
 *    - Use a final variable rollNumber for each student that cannot be changed.
 * 4. Instanceof:
 *    - Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void updateGrade(String grade) {
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create a Student object.
        Student student = new Student("Asher", 101, "A");

        // Check whether the object is an instance of Student.
        if (student instanceof Student) {
            student.displayDetails();
            student.updateGrade("A+");
            student.displayDetails();
        }

        // Display the total number of students.
        Student.displayTotalStudents();
    }
}
