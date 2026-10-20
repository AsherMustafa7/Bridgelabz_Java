package JavaStream.EmployeeQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ITDepartmentEmploess {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Asher", "IT", 4000000.0),
                new Employee(2, "Chai", "IT", 1000000.0), new Employee(3, "Peona", "Cyber Security", 500000.0),
                new Employee(4, "Aman", "IT", 60000),
                new Employee(5, "Riya", "HR", 45000),
                new Employee(6, "Rahul", "IT", 80000),
                new Employee(7, "Priya", "Finance", 70000),
                new Employee(8, "Karan", "IT", 90000),
                new Employee(9, "Neha", "IT", 70000));
        List<Optional<Employee>> emps = employees.stream().filter(e -> e.getDepartment().equals("IT"))
                .map(e -> Optional.of(e)).toList();
        for (Optional<Employee> e : emps) {
            e.ifPresent(p -> System.out.println(p.getName() + " " + p.getDepartment()));
        }

    }
}
