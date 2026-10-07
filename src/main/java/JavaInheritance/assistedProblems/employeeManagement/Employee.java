/*
 * Problem 2: Employee Management System. Define Employee with name, id, salary, and displayDetails().
 *
 * Hint:
 * Keep common employee data in the superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.employeeManagement;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Initialize common employee data.
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display common employee details.
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
