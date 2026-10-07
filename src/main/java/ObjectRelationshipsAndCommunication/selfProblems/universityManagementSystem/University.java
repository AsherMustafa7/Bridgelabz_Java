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

class University {
    // Store the university name.
    private String name;
    // Store Student objects associated with the University.
    private ArrayList<Student> students;
    // Store Professor objects associated with the University.
    private ArrayList<Professor> professors;
    // Store Course objects aggregated by the University.
    private ArrayList<Course> courses;

    // Create a University with the given name.
    University(String name) {
        // Assign the university name.
        this.name = name;
        // Create the Student list.
        students = new ArrayList<>();
        // Create the Professor list.
        professors = new ArrayList<>();
        // Create the Course list.
        courses = new ArrayList<>();
    }

    // Add an existing Student to the University.
    void addStudent(Student student) {
        // Add the Student object to the University.
        students.add(student);
    }

    // Add an existing Professor to the University.
    void addProfessor(Professor professor) {
        // Add the Professor object to the University.
        professors.add(professor);
    }

    // Add an existing Course to the University.
    void addCourse(Course course) {
        // Add the Course object to the University.
        courses.add(course);
    }
}
