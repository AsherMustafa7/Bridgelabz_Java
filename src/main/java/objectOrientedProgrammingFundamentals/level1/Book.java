package objectOrientedProgrammingFundamentals.level1;
/*
 * Question:
 * Program to Handle Book Details
 * Problem Statement:
 * Write a program to create a Book class with attributes title, author,
 * and price. Add a method to display the book details.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class Book {
    // Store the book title.
    private String title;
    // Store the book author.
    private String author;
    // Store the book price.
    private double price;

    // Constructor initializes all book attributes.
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Return the book title.
    public String getTitle() {
        return title;
    }

    // Set the book title.
    public void setTitle(String title) {
        this.title = title;
    }

    // Return the book author.
    public String getAuthor() {
        return author;
    }

    // Set the book author.
    public void setAuthor(String author) {
        this.author = author;
    }

    // Return the book price.
    public double getPrice() {
        return price;
    }

    // Set the book price.
    public void setPrice(double price) {
        this.price = price;
    }

    // Display the book details.
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    // Create a book object and display its details.
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "Asher", 599);
        book.displayDetails();
        book.author = "Asher Mustafa";
        book.displayDetails();
    }
}

