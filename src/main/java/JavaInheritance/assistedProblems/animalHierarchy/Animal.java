/*
 * Problem 1: Animal Hierarchy. Define Animal with name, age, and makeSound().
 *
 * Hint:
 * Use Animal as the superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.animalHierarchy;

class Animal {
    private String name;
    private int age;

    // Initialize the common Animal data.
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Return the animal name.
    String getName() {
        return name;
    }

    // Define the general sound behavior.
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
