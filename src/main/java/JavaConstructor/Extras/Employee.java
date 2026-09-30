package JavaConstructor.Extras;
/*
 * Question:
 * Employee Records: Develop Employee with employeeID public, department protected, and salary private. Modify salary using a public method. Create Manager to access employeeID and department.
 *
 * Hint:
 * Use public employeeID, protected department, and private salary. Provide a public setter for salary. Create Manager as a subclass.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(101, "Engineering", 50000.0);
        manager.displayDetails();
        manager.setSalary(75000.0);
        manager.displayDetails();
        manager.displayInheritedMembers();
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInheritedMembers() {
        System.out.println("Public Employee ID: " + employeeID);
        System.out.println("Protected Department: " + department);
    }
}
