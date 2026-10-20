/*
 * Question: Group Objects by Property
 * Given a list of Employee objects, group them by department using a Map.
 * Example: Alice (HR), Bob (IT), Carol (HR)
 * Output: HR: [Alice, Carol], IT: [Bob]
 * Hint: Use computeIfAbsent to create a list for each department.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployeesByDepartment {

    // Define an Employee class.
    static class Employee {
        String name;
        String department;

        // Initialize the employee's name and department.
        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        // Return the employee's name when the object is printed.
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Create a list to store employee objects.
        List<Employee> employees = new ArrayList<>();

        // Add sample employees to the list.
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        // Create a map that stores a list of employees for each department.
        Map<String, List<Employee>> map = new HashMap<>();

        // Traverse the employee list.
        for (Employee employee : employees) {
            // Create the department list if it does not exist.
            map.computeIfAbsent(employee.department, k -> new ArrayList<>());

            // Add the employee to the appropriate department list.
            map.get(employee.department).add(employee);
        }

        // Display employees grouped by department.
        System.out.println(map);
    }
}