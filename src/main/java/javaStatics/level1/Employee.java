package javaStatics.level1;

/*
 * Question:
 * Design an Employee class with the following features:
 * 1. Static:
 *    - A static variable companyName shared by all employees.
 *    - A static method displayTotalEmployees() to show the total number of employees.
 * 2. This:
 *    - Use this to initialize name, id, and designation in the constructor.
 * 3. Final:
 *    - Use a final variable id for the employee ID, which cannot be modified after assignment.
 * 4. Instanceof:
 *    - Check if a given object is an instance of the Employee class before printing the employee details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Employee {
    static String companyName = "ABC Technologies";
    static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        // Create an Employee object.
        Employee employee = new Employee("Asher", 101, "Developer");

        // Check whether the object is an instance of Employee.
        if (employee instanceof Employee) {
            employee.displayDetails();
        }

        // Display the total number of employees.
        Employee.displayTotalEmployees();
    }
}
