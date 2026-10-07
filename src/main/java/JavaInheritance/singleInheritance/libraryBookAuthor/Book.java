/*
 * Sample Problem 1: Library Management with Books and Authors. Define Book with title and publicationYear.
 *
 * Hint:
 * Keep general book information in Book.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.libraryBookAuthor;

class Book {
    private String title;
    private int publicationYear;

    // Initialize book information.
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Display book information.
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
