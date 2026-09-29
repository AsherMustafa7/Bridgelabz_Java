package objectOrientedProgrammingFundamentals.level1;

public class test 
{
    public static void main(String[] args) {
        Employee employee = new Employee("Asure", 110, 50000);
        employee.displayDetails();
        // employee.salary = 100000; // Update salary -> we wont be able to access salary directly as it is private, we will use setter method to update the salary
        employee.setSalary(60000);
        employee.displayDetails();
        employee.setSalary(300000);
        employee.displayDetails(); // Display updated details
    }
}