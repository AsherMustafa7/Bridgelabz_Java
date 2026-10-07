/*
 * Problem 2: Employee Management System. Define Intern with internshipMonths and override displayDetails().
 *
 * Hint:
 * Extend Employee and call super() and super.displayDetails().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.employeeManagement;

class Intern extends Employee {
    private int internshipMonths;

    // Initialize inherited and subclass-specific data.
    Intern(String name, int id, double salary, int internshipMonths) {
        super(name, id, salary);
        this.internshipMonths = internshipMonths;
    }

    // Display common and subclass-specific details.
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Months: " + internshipMonths);
    }
}
