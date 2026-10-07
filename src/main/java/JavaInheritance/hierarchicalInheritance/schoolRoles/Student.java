/*
 * Sample Problem 2: Create Student with grade and displayRole().
 *
 * Hint:
 * Extend Person directly and override displayRole().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.schoolRoles;

class Student extends Person {
    private String grade;

    // Initialize inherited and role-specific data.
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Display common and role-specific information.
    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
