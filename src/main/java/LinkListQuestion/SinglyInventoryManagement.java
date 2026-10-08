package LinkListQuestion;

/*
 * Problem 4: Singly Linked List: Inventory Management System
 * Each item stores Item Name, Item ID, Quantity, and Price.
 * Implement insertion at beginning, end, and position; removal by ID;
 * quantity update; search by ID or name; total inventory value; and sorting
 * by price in ascending or descending order using a linked-list algorithm.
 * Hint: Traverse once for total value. Merge sort is suitable for linked lists.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class InventoryNode {
    String name;
    int id, qty;
    double price;
    InventoryNode next;

    InventoryNode(String n, int i, int q, double p) {
        name = n;
        id = i;
        qty = q;
        price = p;
    }
}

class InventoryList {
    private InventoryNode head;

    void addBeginning(String n, int i, int q, double p) {
        InventoryNode x = new InventoryNode(n, i, q, p);
        x.next = head;
        head = x;
    }

    void addEnd(String n, int i, int q, double p) {
        InventoryNode x = new InventoryNode(n, i, q, p);
        if (head == null) {
            head = x;
            return;
        }
        InventoryNode c = head;
        while (c.next != null)
            c = c.next;
        c.next = x;
    }

    void addPosition(int pos, String n, int i, int q, double p) {
        if (pos <= 1 || head == null) {
            addBeginning(n, i, q, p);
            return;
        }
        InventoryNode c = head;
        for (int k = 1; k < pos - 1 && c.next != null; k++)
            c = c.next;
        InventoryNode x = new InventoryNode(n, i, q, p);
        x.next = c.next;
        c.next = x;
    }

    void remove(int id) {
        if (head == null)
            return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        InventoryNode c = head;
        while (c.next != null && c.next.id != id)
            c = c.next;
        if (c.next != null)
            c.next = c.next.next;
    }

    InventoryNode searchId(int id) {
        for (InventoryNode c = head; c != null; c = c.next)
            if (c.id == id)
                return c;
        return null;
    }

    InventoryNode searchName(String n) {
        for (InventoryNode c = head; c != null; c = c.next)
            if (c.name.equalsIgnoreCase(n))
                return c;
        return null;
    }

    void updateQuantity(int id, int q) {
        InventoryNode x = searchId(id);
        if (x != null && q >= 0)
            x.qty = q;
    }

    double totalValue() {
        double t = 0;
        for (InventoryNode c = head; c != null; c = c.next)
            t += c.qty * c.price;
        return t;
    }

    void sortByPrice(boolean asc) {
        head = mergeSort(head, asc);
    }

    private InventoryNode mergeSort(InventoryNode h, boolean asc) {
        if (h == null || h.next == null)
            return h;
        InventoryNode s = h, f = h.next;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        InventoryNode r = s.next;
        s.next = null;
        return merge(mergeSort(h, asc), mergeSort(r, asc), asc);
    }

    private InventoryNode merge(InventoryNode a, InventoryNode b, boolean asc) {
        InventoryNode d = new InventoryNode("", 0, 0, 0), t = d;
        while (a != null && b != null) {
            boolean take = asc ? a.price <= b.price : a.price >= b.price;
            if (take) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        t.next = a != null ? a : b;
        return d.next;
    }

    void display() {
        for (InventoryNode c = head; c != null; c = c.next)
            System.out.println(c.id + " | " + c.name + " | " + c.qty + " | " + c.price);
    }
}

class SinglyInventoryManagement {
    public static void main(String[] a) {
        InventoryList i = new InventoryList();
        i.addBeginning("Keyboard", 1, 5, 1200);
        i.addEnd("Mouse", 2, 10, 600);
        i.addPosition(2, "Monitor", 3, 3, 8000);
        System.out.println("Total: " + i.totalValue());
        i.updateQuantity(2, 15);
        i.sortByPrice(true);
        i.display();
    }
}
