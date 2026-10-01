package JavaConstructor.level1;

/*
 * Question:
 * Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
 *
 * Hint:
 * Because Practice 1 already uses Book.java and all files share the same package, this file uses LibraryBook so the complete practice set can compile together. Use borrowBook() to change availability.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;
    public LibraryBook()
    {
        this("", "", 0.0, false);
    }
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public LibraryBook(LibraryBook other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Basics", "Asher", 500.0, true);
        book.displayDetails();
        book.borrowBook();
        System.out.println("After Borrowing:");
        book.displayDetails();
    }
}
