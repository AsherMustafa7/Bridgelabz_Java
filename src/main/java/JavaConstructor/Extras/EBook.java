package JavaConstructor.Extras;
/*
 * Question:
 * Book Library System: Design a Book class with ISBN public, title protected, and author private. Set and get author. Create subclass EBook to access ISBN and title.
 *
 * Hint:
 * All requested files share one package and Practice 1 already uses Book, so this implementation uses EBook as the public class name. Demonstrate public, protected, and private access.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class EBook {
    public String ISBN;
    protected String title;
    private String author;

    public EBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        LibraryEBook book = new LibraryEBook("978-1234567890", "Java Programming", "Asher");
        book.displayDetails();
        book.setAuthor("Asher Mustafa");
        book.displayDetails();
        book.displayInheritedMembers();
    }
}

class LibraryEBook extends EBook {
    public LibraryEBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayInheritedMembers() {
        System.out.println("Public ISBN: " + ISBN);
        System.out.println("Protected Title: " + title);
    }
}
