/*
 * Problem 1: Employee Management System
Build an employee management system using abstraction, encapsulation, interfaces, and polymorphism.
Create an abstract Employee class with employeeId, name, and baseSalary.
Provide an abstract calculateSalary() method and a concrete displayDetails() method.
Create FullTimeEmployee and PartTimeEmployee subclasses that implement calculateSalary() according to their employee type.
Create a Department interface with assignDepartment() and getDepartmentDetails().
Use private fields, getters, setters, validation, and Employee references to process different employee types polymorphically.
 *
 * Hint:
 * Keep common employee data and behavior in Employee. Let each subclass calculate salary differently. Use the Department interface for department-related behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define the contract for department-related behavior.
interface Department {
    // Assign an employee to a department.
    void assignDepartment(String department);

    // Return the employee department details.
    String getDepartmentDetails();
}

// Define the common structure and behavior for every employee.
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Initialize common employee information.
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = Math.max(baseSalary, 0);
    }

    // Return the employee ID.
    public int getEmployeeId() {
        return employeeId;
    }

    // Update the employee ID only when it is valid.
    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        }
    }

    // Return the employee name.
    public String getName() {
        return name;
    }

    // Update the employee name only when it is valid.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    // Return the base salary.
    public double getBaseSalary() {
        return baseSalary;
    }

    // Update the base salary only when it is valid.
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Force each employee type to provide its own salary calculation.
    public abstract double calculateSalary();

    // Display common employee information.
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

// Represent a full-time employee.
class FullTimeEmployee extends Employee implements Department {
    private String department;

    // Initialize a full-time employee.
    FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Return the fixed full-time salary.
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    // Assign the employee to a department.
    @Override
    public void assignDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        }
    }

    // Return the assigned department.
    @Override
    public String getDepartmentDetails() {
        return department == null ? "No department assigned" : department;
    }
}

// Represent a part-time employee.
class PartTimeEmployee extends Employee implements Department {
    private double workHours;
    private double hourlyRate;
    private String department;

    // Initialize a part-time employee.
    PartTimeEmployee(int employeeId, String name, double baseSalary, double workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = Math.max(workHours, 0);
        this.hourlyRate = Math.max(hourlyRate, 0);
    }

    // Calculate salary using work hours and hourly rate.
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    // Assign the employee to a department.
    @Override
    public void assignDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        }
    }

    // Return the assigned department.
    @Override
    public String getDepartmentDetails() {
        return department == null ? "No department assigned" : department;
    }

    // Return the number of hours worked.
    public double getWorkHours() {
        return workHours;
    }

    // Update work hours only when valid.
    public void setWorkHours(double workHours) {
        if (workHours >= 0) {
            this.workHours = workHours;
        }
    }

    // Return the hourly rate.
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Update hourly rate only when valid.
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }
}

// Test abstraction, encapsulation, interface behavior, and polymorphism.
class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an ArrayList that stores Employee references.
        ArrayList<Employee> employees = new ArrayList<>();

        // Create different employee types.
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Asher", 60000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Rahul", 0, 80, 500);

        // Assign departments through the interface behavior.
        fullTimeEmployee.assignDepartment("Engineering");
        partTimeEmployee.assignDepartment("Support");

        // Add both employee types to the same list.
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Process both objects through the Employee reference.
        for (Employee employee : employees) {
            employee.displayDetails();

            // Access interface behavior through the Employee object.
            if (employee instanceof Department) {
                Department department = (Department) employee;
                System.out.println("Department: " + department.getDepartmentDetails());
            }

            System.out.println();
        }
    }
}
