/*
 * Problem 1: Animal Hierarchy. Demonstrate polymorphism with Dog, Cat, and Bird.
 *
 * Hint:
 * Use Animal references for subclass objects.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.animalHierarchy;

class AnimalTest {
    public static void main(String[] args) {
        // Store different subclass objects in Animal references.
        Animal dog = new Dog("Bruno", 3);
        Animal cat = new Cat("Milo", 2);
        Animal bird = new Bird("Rio", 1);

        // The overridden method is selected at runtime.
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
