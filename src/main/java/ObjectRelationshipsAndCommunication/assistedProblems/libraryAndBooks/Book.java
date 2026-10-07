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
class Book {
    // Store the title of the book.
    private String title;
    // Store the author of the book.
    private String author;

    // Create a Book object using the given title and author.
    Book(String title, String author) {
        // Assign the given title to the current Book object.
        this.title = title;
        // Assign the given author to the current Book object.
        this.author = author;
    }

    // Return the title of the book.
    String getTitle() {
        // Return the stored title.
        return title;
    }

    // Return the author of the book.
    String getAuthor() {
        // Return the stored author.
        return author;
    }

    // Display the details of the book.
    void displayDetails() {
        // Display the title and author.
        System.out.println(title + " by " + author);
    }
}
