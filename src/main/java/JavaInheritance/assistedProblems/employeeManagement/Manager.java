/*
 * Problem 2: Employee Management System. Define Manager with teamSize and override displayDetails().
 *
 * Hint:
 * Extend Employee and call super() and super.displayDetails().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.employeeManagement;

class Manager extends Employee {
    private int teamSize;

    // Initialize inherited and subclass-specific data.
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Display common and subclass-specific details.
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
