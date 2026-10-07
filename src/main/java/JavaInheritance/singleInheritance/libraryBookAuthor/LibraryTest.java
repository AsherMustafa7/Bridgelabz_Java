/*
 * Sample Problem 1: Create an Author object and display its book and author details.
 *
 * Hint:
 * An Author is also a Book because Author extends Book.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.libraryBookAuthor;

class LibraryTest {
    public static void main(String[] args) {
        // Create an Author object.
        Author author = new Author("Java Fundamentals", 2026, "Asher Mustafa", "Java programming author.");

        // Display inherited and subclass information.
        author.displayInfo();
    }
}
