package LinkListQuestion;

/*
 * Problem 9: Circular Linked List: Online Ticket Reservation System
 * Each node stores Ticket ID, Customer Name, Movie Name, Seat Number, and
 * Booking Time. Implement insertion at the end, removal by Ticket ID,
 * display, search by customer or movie, and total ticket count.
 * Hint: Keep tail next connected to head. Use circular traversal that stops
 * after returning to head and preserve the circular link during deletion.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class TicketNode {
    int id;
    String customer, movie, seat, time;
    TicketNode next;

    TicketNode(int i, String c, String m, String s, String t) {
        id = i;
        customer = c;
        movie = m;
        seat = s;
        time = t;
    }
}

class TicketList {
    private TicketNode head, tail;
    private int size;

    void add(int i, String c, String m, String s, String t) {
        TicketNode x = new TicketNode(i, c, m, s, t);
        if (head == null) {
            head = tail = x;
            x.next = x;
        } else {
            x.next = head;
            tail.next = x;
            tail = x;
        }
        size++;
    }

    void remove(int id) {
        if (head == null)
            return;
        TicketNode p = tail, c = head;
        do {
            if (c.id == id) {
                if (head == tail)
                    head = tail = null;
                else {
                    p.next = c.next;
                    if (c == head)
                        head = c.next;
                    if (c == tail)
                        tail = p;
                    tail.next = head;
                }
                size--;
                return;
            }
            p = c;
            c = c.next;
        } while (c != head);
    }

    void display() {
        if (head == null)
            return;
        TicketNode c = head;
        do {
            show(c);
            c = c.next;
        } while (c != head);
    }

    void searchCustomer(String n) {
        if (head == null)
            return;
        TicketNode c = head;
        do {
            if (c.customer.equalsIgnoreCase(n))
                show(c);
            c = c.next;
        } while (c != head);
    }

    void searchMovie(String n) {
        if (head == null)
            return;
        TicketNode c = head;
        do {
            if (c.movie.equalsIgnoreCase(n))
                show(c);
            c = c.next;
        } while (c != head);
    }

    int count() {
        return size;
    }

    void show(TicketNode x) {
        System.out.println(x.id + " | " + x.customer + " | " + x.movie + " | " + x.seat + " | " + x.time);
    }
}

class CircularTicketReservation {
    public static void main(String[] a) {
        TicketList t = new TicketList();
        t.add(1, "Asher", "Interstellar", "A10", "10:00 AM");
        t.add(2, "Rahul", "Inception", "B12", "10:15 AM");
        t.add(3, "Navya", "Interstellar", "A11", "10:30 AM");
        t.display();
        System.out.println("Interstellar:");
        t.searchMovie("Interstellar");
        System.out.println("Count: " + t.count());
        t.remove(2);
    }
}
