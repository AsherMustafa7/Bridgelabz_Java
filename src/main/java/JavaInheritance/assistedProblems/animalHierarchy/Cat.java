/*
 * Problem 1: Animal Hierarchy. Define Cat as a subclass of Animal with a unique makeSound().
 *
 * Hint:
 * Extend Animal and use @Override.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.animalHierarchy;

class Cat extends Animal {
    // Initialize the inherited Animal data.
    Cat(String name, int age) {
        super(name, age);
    }

    // Override makeSound() for this animal.
    @Override
    void makeSound() {
        System.out.println(getName() + " says Meow!");
    }
}
