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
class Course {
    // Store the course name.
    private String name;
    // Store the Professor associated with the Course.
    private Professor professor;

    // Create a Course with the given name.
    Course(String name) {
        // Assign the course name.
        this.name = name;
    }

    // Assign a Professor to this Course.
    void assignProfessor(Professor professor) {
        // Store the Professor associated with this Course.
        this.professor = professor;
        // Add this Course to the Professor course list.
        professor.addCourse(this);
    }

    // Return the course name.
    String getName() {
        // Return the stored course name.
        return name;
    }

    // Return the assigned Professor.
    Professor getProfessor() {
        // Return the associated Professor.
        return professor;
    }
}
