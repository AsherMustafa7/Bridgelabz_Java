package LinkListQuestion;

/*
 * Problem 3: Circular Linked List: Task Scheduler
 * Each task stores Task ID, Task Name, Priority, and Due Date.
 * Implement insertion at beginning, end, and position; removal by ID;
 * current-task viewing and movement; display from head; and priority search.
 * Hint: The tail next must always point to head. Use circular traversal that
 * stops when the traversal reaches head again to avoid infinite loops.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class TaskNode {
    int id, priority;
    String name, due;
    TaskNode next;

    TaskNode(int i, String n, int p, String d) {
        id = i;
        name = n;
        priority = p;
        due = d;
    }
}

class TaskList {
    private TaskNode head, tail, current;

    void addBeginning(int i, String n, int p, String d) {
        TaskNode x = new TaskNode(i, n, p, d);
        if (head == null) {
            head = tail = current = x;
            x.next = x;
        } else {
            x.next = head;
            head = x;
            tail.next = head;
        }
    }

    void addEnd(int i, String n, int p, String d) {
        TaskNode x = new TaskNode(i, n, p, d);
        if (head == null) {
            head = tail = current = x;
            x.next = x;
        } else {
            x.next = head;
            tail.next = x;
            tail = x;
        }
    }

    void addPosition(int pos, int i, String n, int p, String d) {
        if (pos <= 1 || head == null) {
            addBeginning(i, n, p, d);
            return;
        }
        TaskNode c = head;
        for (int k = 1; k < pos - 1 && c.next != head; k++)
            c = c.next;
        if (c == tail) {
            addEnd(i, n, p, d);
            return;
        }
        TaskNode x = new TaskNode(i, n, p, d);
        x.next = c.next;
        c.next = x;
    }

    void remove(int id) {
        if (head == null)
            return;
        TaskNode prev = tail, c = head;
        do {
            if (c.id == id) {
                if (head == tail) {
                    head = tail = current = null;
                    return;
                }
                prev.next = c.next;
                if (c == head)
                    head = c.next;
                if (c == tail)
                    tail = prev;
                tail.next = head;
                if (current == c)
                    current = c.next;
                return;
            }
            prev = c;
            c = c.next;
        } while (c != head);
    }

    void currentNext() {
        if (current == null) {
            System.out.println("No tasks");
            return;
        }
        System.out.println("Current: " + current.name);
        current = current.next;
    }

    void display() {
        if (head == null)
            return;
        TaskNode c = head;
        do {
            System.out.println(c.id + " | " + c.name + " | P" + c.priority + " | " + c.due);
            c = c.next;
        } while (c != head);
    }

    void searchPriority(int p) {
        if (head == null)
            return;
        TaskNode c = head;
        do {
            if (c.priority == p)
                System.out.println(c.name);
            c = c.next;
        } while (c != head);
    }
}

class CircularTaskScheduler {
    public static void main(String[] a) {
        TaskList t = new TaskList();
        t.addBeginning(1, "Study Java", 1, "08-10-2026");
        t.addEnd(2, "Assignment", 2, "09-10-2026");
        t.addPosition(2, 3, "LinkedList", 1, "10-10-2026");
        t.display();
        t.currentNext();
        t.currentNext();
        System.out.println("Priority 1:");
        t.searchPriority(1);
        t.remove(2);
    }
}
