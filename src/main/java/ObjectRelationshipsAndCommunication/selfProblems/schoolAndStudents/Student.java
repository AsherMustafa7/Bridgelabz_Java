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

class Student {
    // Store the student name.
    private String name;
    // Store courses enrolled by the Student.
    private ArrayList<Course> courses;

    // Create a Student with the given name.
    Student(String name) {
        // Assign the student name.
        this.name = name;
        // Create the course list.
        courses = new ArrayList<>();
    }

    // Enroll the Student in a Course.
    void enrollCourse(Course course) {
        // Add the Course to the Student course list.
        courses.add(course);
        // Add this Student to the Course student list.
        course.addStudent(this);
    }

    // Return the student name.
    String getName() {
        // Return the stored student name.
        return name;
    }

    // Display courses enrolled by the Student.
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
