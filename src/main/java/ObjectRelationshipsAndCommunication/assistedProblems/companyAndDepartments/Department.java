
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

class Department {
    // Store the department name.
    private String name;
    // Store Employee objects owned by this Department.
    private ArrayList<Employee> employees;

    // Create a Department with the given name.
    Department(String name) {
        // Assign the given department name.
        this.name = name;
        // Create the list of employees.
        employees = new ArrayList<>();
    }

    // Add an Employee to the Department.
    void addEmployee(Employee employee) {
        // Add the Employee to the Department.
        employees.add(employee);
    }

    // Remove all Employee objects from this Department.
    void removeEmployees() {
        // Clear the employee list when the Department is removed.
        employees.clear();
    }

    // Display the Department and its employees.
    void displayDetails() {
        // Display the department name.
        System.out.println("Department: " + name);
        // Visit every Employee in the Department.
        for (Employee employee : employees) {
            // Display the current Employee name.
            System.out.println("Employee: " + employee.getName());
        }
    }
}
