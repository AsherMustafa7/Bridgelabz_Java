/*
 * Question:
 * Create a University with multiple Faculty members and Department objects.
 * Model University and Department as composition, where deleting a University
 * deletes all Departments. Model Faculty members as aggregation so Faculty
 * objects can exist outside a specific Department.
 *
 * Tasks:
 * Define University, Department, and Faculty classes.
 * Demonstrate that deleting University also removes its Departments.
 * Show that Faculty members can exist independently of a Department.
 *
 * Goal:
 * Understand the difference between composition and aggregation in a
 * hierarchical University model.
 *
 * Hint:
 * Keep Departments private and create them through University.
 * Create Faculty objects independently and add them to Departments.
 * Use deleteUniversity to clear the Department objects.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.selfProblems.universityFacultiesDepartments;
import java.util.ArrayList;

class Department {
    // Store the department name.
    private String name;
    // Store Faculty objects aggregated by the Department.
    private ArrayList<Faculty> faculties;

    // Create a Department with the given name.
    Department(String name) {
        // Assign the department name.
        this.name = name;
        // Create the Faculty list.
        faculties = new ArrayList<>();
    }

    // Add an existing Faculty object to this Department.
    void addFaculty(Faculty faculty) {
        // Add the independent Faculty object to the Department.
        faculties.add(faculty);
    }

    // Clear the Faculty references when the Department is removed.
    void removeFaculties() {
        // Remove all Faculty references from this Department.
        faculties.clear();
    }

    // Return the department name.
    String getName() {
        // Return the stored department name.
        return name;
    }
}
