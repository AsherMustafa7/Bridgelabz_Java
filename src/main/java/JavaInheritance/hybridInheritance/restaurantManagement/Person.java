/*
 * Sample Problem 1: Restaurant Management System with Hybrid Inheritance. Define Person with name and id.
 *
 * Hint:
 * Combine class inheritance with an interface.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.restaurantManagement;

class Person {
    protected String name;
    protected int id;

    // Initialize common person data.
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display common person data.
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
