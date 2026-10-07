/*
 * Sample Problem 2: School System with Different Roles. Define Person with name and age.
 *
 * Hint:
 * Place shared person information in the superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.schoolRoles;

class Person {
    protected String name;
    protected int age;

    // Initialize common person data.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common person information.
    void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
