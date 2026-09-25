/*
Question:
11. Create a program to find the bonus of 10 employees based on years of service and find the total bonus amount the company has to pay, along with old and new salary.

Hints:
1. Give 5 percent bonus to employees whose years of service are more than 5 years and 2 percent otherwise.
2. Create a method to determine salary and years of service using Math.random. Use a 2D array.
3. Create a method to calculate new salary and bonus and return the new 2D array.
4. Create a method to calculate old salary sum, new salary sum, and total bonus and display them in tabular format.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class EmployeeBonusCalculator {

    // Generate salary and years of service for all employees.
    public double[][] generateEmployeeData(int employeeCount) {
        double[][] employees = new double[employeeCount][2];

        for (int i = 0; i < employeeCount; i++) {
            employees[i][0] = (int) (Math.random() * 90000) + 10000;
            employees[i][1] = (int) (Math.random() * 11);
        }
        return employees;
    }

    // Calculate bonus and new salary for every employee.
    public double[][] calculateBonusAndNewSalary(double[][] employees) {
        double[][] result = new double[employees.length][2];

        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Calculate total old salary, new salary, and bonus.
    public double[] calculateTotals(double[][] employees, double[][] result) {
        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;

        for (int i = 0; i < employees.length; i++) {
            oldSalaryTotal += employees[i][0];
            bonusTotal += result[i][0];
            newSalaryTotal += result[i][1];
        }

        return new double[]{oldSalaryTotal, newSalaryTotal, bonusTotal};
    }

    // Display the employee salary table.
    public void displayEmployees(double[][] employees, double[][] result) {
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Employee", "Old Salary", "Years", "Bonus");
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "--------", "----------", "-----", "-----");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f%n",
                    i + 1, employees[i][0], employees[i][1], result[i][0]);
        }
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        EmployeeBonusCalculator calculator = new EmployeeBonusCalculator();

        // Store the employee count.
        int employeeCount = 10;

        // Generate employee data.
        double[][] employees = calculator.generateEmployeeData(employeeCount);

        // Calculate bonuses and new salaries.
        double[][] result = calculator.calculateBonusAndNewSalary(employees);

        // Display employee details.
        calculator.displayEmployees(employees, result);

        // Calculate totals.
        double[] totals = calculator.calculateTotals(employees, result);

        // Display totals.
        System.out.printf("%nTotal Old Salary: %.2f%n", totals[0]);
        System.out.printf("Total New Salary: %.2f%n", totals[1]);
        System.out.printf("Total Bonus: %.2f%n", totals[2]);

        // Close the scanner.
        sc.close();
    }
}
