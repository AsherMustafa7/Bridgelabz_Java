/*
 * Sample Problem 2: Demonstrate hierarchical inheritance with Teacher, Student, and Staff.
 *
 * Hint:
 * Use Person references for polymorphism.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.schoolRoles;

class SchoolTest {
    public static void main(String[] args) {
        // Store different roles in Person references.
        Person teacher = new Teacher("Meera", 35, "Mathematics");
        Person student = new Student("Rahul", 16, "Grade 10");
        Person staff = new Staff("Kiran", 42, "Administration");

        // Call the overridden method for each role.
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
