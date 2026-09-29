package objectOrientedProgrammingFundamentals.level1;

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
        employee.salary = 100000; // Update salary
        employee.displayDetails();
        employee.setSalary(200000);
        employee.displayDetails(); // Display updated details
    }
}

// public class test 
// {
//     public static void main(String[] args) {
//         Employee employee = new Employee("Asher", 101, 50000);
//         employee.displayDetails();
//         employee.salary = 100000; // Update salary
//         employee.displayDetails();
//         employee.setSalary(200000);
//         employee.displayDetails(); // Display updated details
//     }
// }

// Java allows only one public class per .java file, and the filename must match that public class.
// so the above cant we done by us



/*
3. Do we need inheritance in test?
No. Absolutely not.
You do not need:

class test extends Employee

just because test wants to use an Employee.
In fact, inheritance would be the wrong relationship here.
Think about the relationship:
test HAS an Employee object
not:
test IS an Employee
So you create an object:
Employee employee = new Employee("Asher", 101, 50000);
This is called object composition / using an object, and it is the appropriate approach here.
*/