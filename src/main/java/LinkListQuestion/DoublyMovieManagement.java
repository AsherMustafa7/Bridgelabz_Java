package LinkListQuestion;

/*
 * Problem 2: Doubly Linked List: Movie Management System
 * Each node stores Movie Title, Director, Year of Release, and Rating.
 * Implement insertion at beginning, end, and position; removal by title;
 * search by director or rating; forward and reverse display; and rating update.
 * Hint: Maintain both head and tail and update next and prev on every change.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

class MovieList {
    private MovieNode head, tail;

    void addBeginning(String t, String d, int y, double r) {
        MovieNode x = new MovieNode(t, d, y, r);
        if (head == null)
            head = tail = x;
        else {
            x.next = head;
            head.prev = x;
            head = x;
        }
    }

    void addEnd(String t, String d, int y, double r) {
        MovieNode x = new MovieNode(t, d, y, r);
        if (tail == null)
            head = tail = x;
        else {
            tail.next = x;
            x.prev = tail;
            tail = x;
        }
    }

    void addPosition(int p, String t, String d, int y, double r) {
        if (p <= 1 || head == null) {
            addBeginning(t, d, y, r);
            return;
        }
        MovieNode c = head;
        for (int i = 1; i < p - 1 && c.next != null; i++)
            c = c.next;
        if (c == tail) {
            addEnd(t, d, y, r);
            return;
        }
        MovieNode x = new MovieNode(t, d, y, r);
        x.next = c.next;
        x.prev = c;
        c.next.prev = x;
        c.next = x;
    }

    MovieNode searchTitle(String t) {
        MovieNode c = head;
        while (c != null) {
            if (c.title.equalsIgnoreCase(t))
                return c;
            c = c.next;
        }
        return null;
    }

    void remove(String t) {
        MovieNode x = searchTitle(t);
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
    }

    void searchDirector(String d) {
        for (MovieNode c = head; c != null; c = c.next)
            if (c.director.equalsIgnoreCase(d))
                show(c);
    }

    void searchRating(double r) {
        for (MovieNode c = head; c != null; c = c.next)
            if (c.rating == r)
                show(c);
    }

    void updateRating(String t, double r) {
        MovieNode x = searchTitle(t);
        if (x != null)
            x.rating = r;
    }

    void forward() {
        for (MovieNode c = head; c != null; c = c.next)
            show(c);
    }

    void reverse() {
        for (MovieNode c = tail; c != null; c = c.prev)
            show(c);
    }

    void show(MovieNode x) {
        System.out.println(x.title + " | " + x.director + " | " + x.year + " | " + x.rating);
    }
}

class DoublyMovieManagement {
    public static void main(String[] a) {
        MovieList m = new MovieList();
        m.addBeginning("Inception", "Nolan", 2010, 8.8);
        m.addEnd("Interstellar", "Nolan", 2014, 8.7);
        m.addPosition(2, "Avatar", "Cameron", 2009, 7.8);
        m.forward();
        System.out.println("Reverse:");
        m.reverse();
        m.updateRating("Avatar", 8.0);
        m.remove("Inception");
    }
}
