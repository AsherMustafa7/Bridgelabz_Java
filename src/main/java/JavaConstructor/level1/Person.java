package JavaConstructor.level1;

/*
 * Question:
 * Create a Person class with a copy constructor that clones another person's attributes.
 *
 * Hint:
 * Create a parameterized constructor and a copy constructor that receives another Person object.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Asher", 21);
        Person person2 = new Person(person1);
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println("\nCopied Person:");
        person2.displayDetails();
    }
}
