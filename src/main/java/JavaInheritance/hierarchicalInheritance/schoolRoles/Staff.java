/*
 * Sample Problem 2: Create Staff with department and displayRole().
 *
 * Hint:
 * Extend Person directly and override displayRole().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.schoolRoles;

class Staff extends Person {
    private String department;

    // Initialize inherited and role-specific data.
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Display common and role-specific information.
    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
