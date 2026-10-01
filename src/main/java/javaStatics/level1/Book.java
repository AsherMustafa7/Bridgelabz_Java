package javaStatics.level1;

/*
 * Question:
 * Create a Book class to manage library books with the following features:
 * 1. Static:
 *    - A static variable libraryName shared across all books.
 *    - A static method displayLibraryName() to print the library name.
 * 2. This:
 *    - Use this to initialize title, author, and isbn in the constructor.
 * 3. Final:
 *    - Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
 * 4. Instanceof:
 *    - Verify if an object is an instance of the Book class before displaying its details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Book {
    static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        // Create a Book object.
        Book book = new Book("Java Basics", "Asher", "ISBN101");

        // Display the library name.
        Book.displayLibraryName();

        // Check whether the object is an instance of Book.
        if (book instanceof Book) {
            book.displayDetails();
        }
    }
}
