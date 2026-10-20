/**
 * 1. Find all employees working in IT.
2. Find employees whose salary is greater than ₹70,000.
3. Sort employees by salary in ascending order.
4. Sort employees by salary in descending order.
5. Find the employee with the highest salary.
6. Find the employee with the lowest salary.
7. Find the second-highest distinct salary.
8. Group employees by department.
9. Count employees in each department.
10. Find the average salary.
11. Find the total salary paid by each department.
12. Find the highest-paid employee in each department.
13. Find employees earning more than the overall average salary.
14. Return the top three highest-paid employees.
15. Convert the employee list into a map of employee names to salaries.
lets do these qus
 */
package JavaStream.EmployeeQuestion;

public class Employee 
{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
