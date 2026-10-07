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

class Course {
    // Store the course name.
    private String name;
    // Store students enrolled in this Course.
    private ArrayList<Student> students;

    // Create a Course with the given name.
    Course(String name) {
        // Assign the course name.
        this.name = name;
        // Create the student list.
        students = new ArrayList<>();
    }

    // Enroll a Student in this Course.
    void addStudent(Student student) {
        // Add the Student to the Course.
        students.add(student);
    }

    // Return the course name.
    String getName() {
        // Return the stored course name.
        return name;
    }

    // Display all students enrolled in the Course.
    void displayStudents() {
        // Display the course name.
        System.out.println("Course: " + name);
        // Visit every enrolled Student.
        for (Student student : students) {
            // Display the current Student name.
            System.out.println("Student: " + student.getName());
        }
    }
}
