/*
 * Question:
 * Program to Display Employee Details
 * Problem Statement:
 * Write a program to create an Employee class with attributes name, id,
 * and salary. Add a method to display the details.
 *
 * Best Programming Practice:
 * Use meaningful class and method names.
 * Encapsulate data using private fields and getter and setter methods.
 * Provide a constructor to initialize class attributes.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class Employee {
    // Store the employee name.
    private String name;
    // Store the employee id.
    private int id;
    // Store the employee salary.
    private double salary;

    // Constructor initializes all employee attributes.
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Return the employee name.
    public String getName() {
        return name;
    }

    // Set the employee name.
    public void setName(String name) {
        this.name = name;
    }

    // Return the employee id.
    public int getId() {
        return id;
    }

    // Set the employee id.
    public void setId(int id) {
        this.id = id;
    }

    // Return the employee salary.
    public double getSalary() {
        return salary;
    }

    // Set the employee salary.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display the employee details.
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // Create an employee object and display its details.
    public static void main(String[] args) {
        Employee employee = new Employee("Asher", 101, 50000);
        employee.displayDetails();
    }
}
