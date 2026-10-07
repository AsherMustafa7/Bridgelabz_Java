/*
 * Problem 2: Employee Management System. Define Developer with programmingLanguage and override displayDetails().
 *
 * Hint:
 * Extend Employee and call super() and super.displayDetails().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.employeeManagement;

class Developer extends Employee {
    private String programmingLanguage;

    // Initialize inherited and subclass-specific data.
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Display common and subclass-specific details.
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
