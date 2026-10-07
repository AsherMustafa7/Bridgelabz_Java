/*
 * Question:
 * A Company has several Department objects, and each Department contains
 * Employee objects. Model this using composition, where deleting a Company
 * should also remove all Departments and Employees associated with it.
 *
 * Tasks:
 * Define a Company class that contains multiple Department objects.
 * Define an Employee class within each Department.
 * Show composition by ensuring that Company controls the lifetime of its Departments.
 *
 * Goal:
 * Understand composition by implementing a relationship where Department
 * and Employee objects are owned by a Company.
 *
 * Hint:
 * Keep the Department list private inside Company.
 * Create Departments through Company.
 * Keep Employee objects inside their Department.
 * Use a deleteCompany method to clear Departments and their Employees.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.assistedProblems.companyAndDepartments;
class Employee {
    // Store the employee name.
    private String name;

    // Create an Employee with the given name.
    Employee(String name) {
        // Assign the given name to the Employee.
        this.name = name;
    }

    // Return the employee name.
    String getName() {
        // Return the stored employee name.
        return name;
    }
}
