/*
 * Question:
 * Model a university system with Student, Professor, and Course classes.
 * Students enroll in courses, and Professors teach courses.
 * Ensure Students and Professors can communicate through methods like
 * enrollCourse and assignProfessor.
 *
 * Goal:
 * Use association and aggregation to create a university system that
 * emphasizes relationships and interactions among Students, Professors,
 * and Courses.
 *
 * Hint:
 * Keep Student, Professor, and Course as independent objects.
 * Store Course objects in Student using ArrayList.
 * Store Professor as an associated object in Course.
 * Use methods to communicate between the objects.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.selfProblems.universityManagementSystem;
import java.util.ArrayList;

class Student {
    // Store the student name.
    private String name;
    // Store Course objects in which the Student is enrolled.
    private ArrayList<Course> courses;

    // Create a Student with the given name.
    Student(String name) {
        // Assign the student name.
        this.name = name;
        // Create the Course list.
        courses = new ArrayList<>();
    }

    // Enroll the Student in a Course.
    void enrollCourse(Course course) {
        // Add the Course to the Student list.
        courses.add(course);
        // Display the enrollment communication.
        System.out.println(name + " enrolled in " + course.getName());
    }

    // Return the student name.
    String getName() {
        // Return the stored student name.
        return name;
    }

    // Display all Courses for this Student.
    void displayCourses() {
        // Display the student name.
        System.out.println("Student: " + name);
        // Visit every enrolled Course.
        for (Course course : courses) {
            // Display the current Course name.
            System.out.println("Course: " + course.getName());
        }
    }
}
