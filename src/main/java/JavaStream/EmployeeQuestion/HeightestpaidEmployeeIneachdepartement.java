package JavaStream.EmployeeQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HeightestpaidEmployeeIneachdepartement 
{
    public static void main(String[] args) 
    {
        List<Employee> employees= Arrays.asList(new Employee(1,"Asher","IT",4000000.0),
                                                new Employee(2,"Chai","IT",1000000.0),
                                                new Employee(3,"Peona","Cyber Security",500000.0),
                                                new Employee(4,"Aman", "IT", 60000),
            new Employee(5,"Riya", "HR", 45000),
            new Employee(6,"Rahul", "IT", 80000),
            new Employee(7,"Priya", "Finance", 70000),
            new Employee(8,"Karan", "IT", 90000),
            new Employee(9,"Neha", "IT", 70000)
                                               );
            Map<String,Optional<Employee>> mpp= employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.maxBy((a,b)->(int)(a.getSalary()-b.getSalary()))));
            
            mpp.forEach((Deparement,emp)->{emp.ifPresent(p->System.out.println(p.getName()+" "+p.getDepartment()+" "+p.getSalary()));});
    }
}
