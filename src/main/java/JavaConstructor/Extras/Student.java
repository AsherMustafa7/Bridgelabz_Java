package JavaConstructor.Extras;
/*
 * Question:
 * University Management System: Create Student with rollNumber public, name protected, and CGPA private. Access and modify CGPA using public methods. Create subclass PostgraduateStudent to demonstrate protected members.
 *
 * Hint:
 * Use public, protected, and private as specified. Use getter/setter for CGPA. Let the subclass access name and rollNumber.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() { return CGPA; }
    public void setCGPA(double CGPA) { this.CGPA = CGPA; }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(101, "Asher", 8.5);
        student.displayDetails();
        student.rollNumber = 102;
        student.setCGPA(9.0);
        student.displayDetails();
        student.displayProtectedMember();
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayProtectedMember() {
        System.out.println("Protected Name: " + name);
        System.out.println("Public Roll Number: " + rollNumber);
    }
}
