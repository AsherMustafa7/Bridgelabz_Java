package JavaStream.EmployeeQuestion;


import java.util.*;

public class HeighestandLowestsalary 
{
    public static void main(String[] args) 
    {
        List<Employee> employees= Arrays.asList(new Employee(1,"Asher","IT",4000000.0),new Employee(2,"Chai","IT",1000000.0),new Employee(3,"Peona","Cyber Security",500000.0),new Employee(4,"Aman", "IT", 60000),
            new Employee(5,"Riya", "HR", 45000),
            new Employee(6,"Rahul", "IT", 80000),
            new Employee(7,"Priya", "Finance", 70000),
            new Employee(8,"Karan", "IT", 90000),
            new Employee(9,"Neha", "IT", 70000));
        Optional<Employee> emp= employees.stream().sorted((a,b)->(int)(a.getSalary()-b.getSalary())).findFirst();
        emp.ifPresent(e->System.out.println(e.getName()+" "+e.getSalary()));
        System.out.println("---------------------------------------------------");
        Optional<Employee> emp2= employees.stream().sorted((a,b)->(int)(b.getSalary()-a.getSalary())).findFirst();
        emp2.ifPresent(e->System.out.println(e.getName()+" "+e.getSalary()));
        System.out.println("Second heighest");
        Optional<Employee> emp3= employees.stream().sorted((a,b)->(int)(b.getSalary()-a.getSalary())).skip(1).findFirst();
        emp3.ifPresent(e->System.out.println(e.getName()+" "+e.getSalary()));
        
    }
}
