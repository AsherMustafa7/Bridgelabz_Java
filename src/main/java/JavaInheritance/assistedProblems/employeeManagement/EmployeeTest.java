/*
 * Problem 2: Employee Management System. Demonstrate Manager, Developer, and Intern.
 *
 * Hint:
 * Use Employee references to demonstrate polymorphism.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.employeeManagement;

class EmployeeTest {
    public static void main(String[] args) {
        // Store subclass objects in Employee references.
        Employee manager = new Manager("Arun", 101, 85000, 8);
        Employee developer = new Developer("Riya", 102, 70000, "Java");
        Employee intern = new Intern("Sam", 103, 25000, 6);

        // Call the overridden method polymorphically.
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
