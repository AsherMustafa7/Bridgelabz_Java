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
import java.util.ArrayList;

class Company {
    // Store the company name.
    private String name;
    // Store Department objects owned by the Company.
    private ArrayList<Department> departments;

    // Create a Company with the given name.
    Company(String name) {
        // Assign the given company name.
        this.name = name;
        // Create the list of Departments.
        departments = new ArrayList<>();
    }

    // Create and add a Department owned by this Company.
    Department createDepartment(String departmentName) {
        // Create a Department as part of this Company.
        Department department = new Department(departmentName);
        // Add the Department to the Company.
        departments.add(department);
        // Return the newly created Department.
        return department;
    }

    // Remove all Departments and their Employees from this Company.
    void deleteCompany() {
        // Remove all Employee objects from every Department.
        for (Department department : departments) {
            // Clear the employees before removing the Department.
            department.removeEmployees();
        }
        // Remove all Departments from the Company.
        departments.clear();
        // Display that the Company has been cleared.
        System.out.println("Company " + name + " has been deleted.");
    }

    // Display all Departments in the Company.
    void displayDetails() {
        // Visit every Department in the Company.
        for (Department department : departments) {
            // Display the current Department.
            department.displayDetails();
        }
    }
}
