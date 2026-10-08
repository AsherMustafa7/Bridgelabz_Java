package LinkListQuestion;

/*
 * Problem 5: Doubly Linked List: Library Management System
 * Each node stores Book Title, Author, Genre, Book ID, and Availability Status.
 * Implement insertion at beginning, end, and position; removal by ID;
 * search by title or author; availability update; forward and reverse display;
 * and book counting.
 * Hint: Maintain head and tail and update both next and prev during deletion.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class LibraryNode {
    String title, author, genre;
    int id;
    boolean available;
    LibraryNode next, prev;

    LibraryNode(String t, String a, String g, int i, boolean v) {
        title = t;
        author = a;
        genre = g;
        id = i;
        available = v;
    }
}

class LibraryList {
    private LibraryNode head, tail;
    private int size;

    void addBeginning(String t, String a, String g, int i, boolean v) {
        LibraryNode x = new LibraryNode(t, a, g, i, v);
        if (head == null)
            head = tail = x;
        else {
            x.next = head;
            head.prev = x;
            head = x;
        }
        size++;
    }

    void addEnd(String t, String a, String g, int i, boolean v) {
        LibraryNode x = new LibraryNode(t, a, g, i, v);
        if (tail == null)
            head = tail = x;
        else {
            tail.next = x;
            x.prev = tail;
            tail = x;
        }
        size++;
    }

    void addPosition(int p, String t, String a, String g, int i, boolean v) {
        if (p <= 1 || head == null) {
            addBeginning(t, a, g, i, v);
            return;
        }
        if (p > size) {
            addEnd(t, a, g, i, v);
            return;
        }
        LibraryNode c = head;
        for (int k = 1; k < p - 1; k++)
            c = c.next;
        LibraryNode x = new LibraryNode(t, a, g, i, v);
        x.next = c.next;
        x.prev = c;
        c.next.prev = x;
        c.next = x;
        size++;
    }

    LibraryNode searchId(int i) {
        for (LibraryNode c = head; c != null; c = c.next)
            if (c.id == i)
                return c;
        return null;
    }

    void remove(int i) {
        LibraryNode x = searchId(i);
        if (x == null)
            return;
        if (x.prev != null)
            x.prev.next = x.next;
        else
            head = x.next;
        if (x.next != null)
            x.next.prev = x.prev;
        else
            tail = x.prev;
        size--;
    }

    void searchTitle(String t) {
        for (LibraryNode c = head; c != null; c = c.next)
            if (c.title.equalsIgnoreCase(t))
                show(c);
    }

    void searchAuthor(String a) {
        for (LibraryNode c = head; c != null; c = c.next)
            if (c.author.equalsIgnoreCase(a))
                show(c);
    }

    void updateAvailability(int i, boolean v) {
        LibraryNode x = searchId(i);
        if (x != null)
            x.available = v;
    }

    void forward() {
        for (LibraryNode c = head; c != null; c = c.next)
            show(c);
    }

    void reverse() {
        for (LibraryNode c = tail; c != null; c = c.prev)
            show(c);
    }

    int count() {
        return size;
    }

    void show(LibraryNode x) {
        System.out.println(x.id + " | " + x.title + " | " + x.author + " | " + x.genre + " | " + x.available);
    }
}

class DoublyLibraryManagement {
    public static void main(String[] a) {
        LibraryList l = new LibraryList();
        l.addBeginning("Java Basics", "James", "Programming", 1, true);
        l.addEnd("Data Structures", "Robert", "CS", 2, true);
        l.addPosition(2, "Algorithms", "Thomas", "CS", 3, false);
        l.forward();
        System.out.println("Reverse:");
        l.reverse();
        l.updateAvailability(3, true);
        System.out.println("Count: " + l.count());
    }
}
