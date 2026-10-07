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
class Faculty {
    // Store the faculty member name.
    private String name;

    // Create a Faculty object with the given name.
    Faculty(String name) {
        // Assign the given name.
        this.name = name;
    }

    // Return the faculty member name.
    String getName() {
        // Return the stored faculty name.
        return name;
    }
}
