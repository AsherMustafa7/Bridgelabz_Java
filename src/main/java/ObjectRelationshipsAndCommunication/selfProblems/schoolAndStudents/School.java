/*
 * Question:
 * Model a School with multiple Student objects, where each Student can enroll
 * in multiple Courses, and each Course can have multiple Students.
 *
 * Tasks:
 * Define School, Student, and Course classes.
 * Model association between Student and Course.
 * Model aggregation between School and Student.
 * Demonstrate that a Student can view courses and a Course can show students.
 *
 * Goal:
 * Practice association by modeling a many-to-many relationship between
 * Students and Courses.
 *
 * Hint:
 * Use ArrayList in Student for courses and ArrayList in Course for students.
 * Keep Student objects independent from School so they can exist outside it.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.selfProblems.schoolAndStudents;

import java.util.ArrayList;

class School {
    // Store the school name.
    private String name;
    // Store Student objects aggregated by the School.
    private ArrayList<Student> students;

    // Create a School with the given name.
    School(String name) {
        // Assign the school name.
        this.name = name;
        // Create the student list.
        students = new ArrayList<>();
    }

    // Add an existing Student to the School.
    void addStudent(Student student) {
        // Add the independent Student object to the School.
        students.add(student);
    }

    // Display all students in the School.
    void displayStudents() {
        // Display the school name.
        System.out.println("School: " + name);
        // Visit every Student in the School.
        for (Student student : students) {
            // Display the current Student name.
            System.out.println("Student: " + student.getName());
        }
    }
}
