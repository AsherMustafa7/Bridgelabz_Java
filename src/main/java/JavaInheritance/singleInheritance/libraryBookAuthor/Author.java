/*
 * Sample Problem 1: Create Author as a subclass of Book with name and bio.
 *
 * Hint:
 * Use super() and override displayInfo().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.libraryBookAuthor;

class Author extends Book {
    private String name;
    private String bio;

    // Initialize inherited and author-specific data.
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Display book and author information.
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
