package OptionalClasses.Filtertest;

import java.util.*;

public class filtertest 
{
    
    public static void main(String[] args) 
    {
        Optional<Employee> emp1= Optional.of(new Employee("Asher", 1000000.0));
        Optional<Employee> empresult =emp1.filter(e->e.getSalary()>10);
        empresult.ifPresentOrElse(e->System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary()),()->System.out.println("you know what , cant really find your employee"));
        Optional<Employee> emp2= Optional.of(new Employee("Bublu", 100000.0));
        Optional<Employee> empresult2 =emp1.filter(e->e.getSalary()>10000000);
        empresult2.ifPresentOrElse(e->System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary()),()->System.out.println("you know what , cant really find your employee"));
    }
   
}
 
class Employee
    {
        private String name;
        private double Salary;
        Employee (String name, Double Salary)
        {
            this.name=name;
            this.Salary=Salary;
        }
        public String getName()
        {
            return name;
        }
        public double getSalary()
        {
            return Salary;
        }
    }