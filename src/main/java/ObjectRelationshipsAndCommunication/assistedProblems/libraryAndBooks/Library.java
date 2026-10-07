/*
 * Question:
 * Create a Library class that contains multiple Book objects.
 * Model the relationship such that a library can have many books,
 * but a book can exist independently outside of a specific library.
 *
 * Tasks:
 * Define a Library class with an ArrayList of Book objects.
 * Define a Book class with title and author attributes.
 * Demonstrate aggregation by creating books and adding them to different libraries.
 *
 * Goal:
 * Understand aggregation by modeling a real-world relationship where
 * the Library aggregates Book objects.
 *
 * Hint:
 * Use an ArrayList<Book> inside Library.
 * Create Book objects separately from Library objects.
 * Then add the same Book object to different libraries to show
 * that the Book can exist independently.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.assistedProblems.libraryAndBooks;
import java.util.ArrayList;

class Library {
    // Store multiple Book objects aggregated by the Library.
    private ArrayList<Book> books;

    // Create an empty Library.
    Library() {
        // Create the ArrayList that stores the books.
        books = new ArrayList<>();
    }

    // Add a Book object to the Library.
    void addBook(Book book) {
        // Add the existing Book object to the list.
        books.add(book);
    }

    // Display all books currently in the Library.
    void displayBooks() {
        // Display a heading for the books.
        System.out.println("Books in Library:");
        // Visit every Book object stored in the Library.
        for (Book book : books) {
            // Display the details of the current Book object.
            book.displayDetails();
        }
    }
}
