/*
 * Problem 5: Library Management System
Develop a library management system using an abstract LibraryItem class.
LibraryItem must contain itemId, title, and author.
Provide an abstract getLoanDuration() method and a concrete getItemDetails() method.
Create Book, Magazine, and DVD subclasses with different loan durations.
Create a Reservable interface with reserveItem() and checkAvailability().
Use encapsulation to protect borrower information and polymorphism to manage all item types through LibraryItem references.
 *
 * Hint:
 * Keep shared item data in LibraryItem. Let each item type decide its loan duration and use Reservable for reservation behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define reservation behavior.
interface Reservable {
    // Reserve the item.
    boolean reserveItem(String borrowerName);

    // Check whether the item is available.
    boolean checkAvailability();
}

// Define the common library item structure.
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    // Initialize common item information.
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Return the item ID.
    public int getItemId() {
        return itemId;
    }

    // Return the title.
    public String getTitle() {
        return title;
    }

    // Return the author.
    public String getAuthor() {
        return author;
    }

    // Require every item type to define its loan duration.
    public abstract int getLoanDuration();

    // Display common item details.
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

// Represent a book.
class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrowerName;

    // Initialize a book.
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Return the book loan duration.
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserve the book when it is available.
    @Override
    public boolean reserveItem(String borrowerName) {
        if (available && borrowerName != null && !borrowerName.trim().isEmpty()) {
            this.borrowerName = borrowerName;
            available = false;
            return true;
        }
        return false;
    }

    // Return whether the book is available.
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Represent a magazine.
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrowerName;

    // Initialize a magazine.
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Return the magazine loan duration.
    @Override
    public int getLoanDuration() {
        return 7;
    }

    // Reserve the magazine when it is available.
    @Override
    public boolean reserveItem(String borrowerName) {
        if (available && borrowerName != null && !borrowerName.trim().isEmpty()) {
            this.borrowerName = borrowerName;
            available = false;
            return true;
        }
        return false;
    }

    // Return whether the magazine is available.
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Represent a DVD.
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrowerName;

    // Initialize a DVD.
    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Return the DVD loan duration.
    @Override
    public int getLoanDuration() {
        return 3;
    }

    // Reserve the DVD when it is available.
    @Override
    public boolean reserveItem(String borrowerName) {
        if (available && borrowerName != null && !borrowerName.trim().isEmpty()) {
            this.borrowerName = borrowerName;
            available = false;
            return true;
        }
        return false;
    }

    // Return whether the DVD is available.
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Test polymorphism and interface behavior.
class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of LibraryItem references.
        ArrayList<LibraryItem> items = new ArrayList<>();

        // Create different library item types.
        Book book = new Book(1, "Java Basics", "Asher");
        Magazine magazine = new Magazine(2, "Tech Monthly", "Tech Press");
        DVD dvd = new DVD(3, "Java Course", "Learning Studio");

        // Add all item types to the same list.
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Display all items polymorphically.
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println();
        }

        // Reserve the book through the interface.
        Reservable reservable = book;
        System.out.println("Book Reserved: " + reservable.reserveItem("Student"));
        System.out.println("Book Available: " + reservable.checkAvailability());
    }
}
