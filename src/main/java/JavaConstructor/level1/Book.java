package JavaConstructor.level1;

/*
 * Question:
 * Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
 *
 * Hint:
 * Create a default constructor and a parameterized constructor. Use them to initialize and display Book objects.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 450.0);
        System.out.println("Default Constructor:");
        book1.displayDetails();
        System.out.println("\nParameterized Constructor:");
        book2.displayDetails();
    }
}
