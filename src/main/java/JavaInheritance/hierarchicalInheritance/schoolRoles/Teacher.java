/*
 * Sample Problem 2: Create Teacher with subject and displayRole().
 *
 * Hint:
 * Extend Person directly and override displayRole().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.schoolRoles;

class Teacher extends Person {
    private String subject;

    // Initialize inherited and role-specific data.
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Display common and role-specific information.
    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
