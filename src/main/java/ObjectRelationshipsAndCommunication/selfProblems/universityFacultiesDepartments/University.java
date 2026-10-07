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

class University {
    // Store the university name.
    private String name;
    // Store Department objects composed by the University.
    private ArrayList<Department> departments;

    // Create a University with the given name.
    University(String name) {
        // Assign the university name.
        this.name = name;
        // Create the Department list.
        departments = new ArrayList<>();
    }

    // Create a Department as part of this University.
    Department createDepartment(String departmentName) {
        // Create a Department owned by this University.
        Department department = new Department(departmentName);
        // Add the Department to the University.
        departments.add(department);
        // Return the newly created Department.
        return department;
    }

    // Delete the University and clear its Department objects.
    void deleteUniversity() {
        // Remove Faculty references from every Department.
        for (Department department : departments) {
            // Clear the Faculty references before removing the Department.
            department.removeFaculties();
        }
        // Remove all Departments from the University.
        departments.clear();
        // Display that the University has been cleared.
        System.out.println("University " + name + " has been deleted.");
    }
}
