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

class Professor {
    // Store the professor name.
    private String name;
    // Store Course objects taught by the Professor.
    private ArrayList<Course> courses;

    // Create a Professor with the given name.
    Professor(String name) {
        // Assign the professor name.
        this.name = name;
        // Create the Course list.
        courses = new ArrayList<>();
    }

    // Add a Course to the Professor course list.
    void addCourse(Course course) {
        // Add the Course to the list.
        courses.add(course);
    }

    // Return the professor name.
    String getName() {
        // Return the stored professor name.
        return name;
    }

    // Display the courses taught by the Professor.
    void displayCourses() {
        // Display the professor name.
        System.out.println("Professor: " + name);
        // Visit every Course taught by the Professor.
        for (Course course : courses) {
            // Display the current Course name.
            System.out.println("Course: " + course.getName());
        }
    }
}
