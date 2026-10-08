package LinkListQuestion;

/*
 * Problem 6: Circular Linked List: Round Robin Scheduling Algorithm
 * Each node stores Process ID, Burst Time, and Priority.
 * Add processes at the end, execute them using a fixed time quantum,
 * remove a process after completion, display the circular queue after rounds,
 * and calculate average waiting and turn-around times.
 * Hint: Maintain a circular queue and record completion times. For all
 * processes arriving at time zero, turnaround equals completion time and
 * waiting equals turnaround minus burst time.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class ProcessNode {
    int id, burst, remaining, priority, completion;
    ProcessNode next;

    ProcessNode(int i, int b, int p) {
        id = i;
        burst = b;
        remaining = b;
        priority = p;
    }
}

class RoundRobinList {
    private ProcessNode head, tail;
    private int size;

    void add(int i, int b, int p) {
        ProcessNode x = new ProcessNode(i, b, p);
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

    void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        ProcessNode c = head;
        do {
            System.out.println("P" + c.id + " remaining=" + c.remaining + " priority=" + c.priority);
            c = c.next;
        } while (c != head);
    }

    void run(int quantum) {
        if (head == null || quantum <= 0) return;
        int time = 0;
        ProcessNode c = head;
        while (head != null) {
            int used = Math.min(quantum, c.remaining);
            c.remaining -= used;
            time += used;
            ProcessNode next = c.next;
            if (c.remaining == 0) {
                c.completion = time;
                remove(c.id);
            }
            if (head == null) break;
            c = next;
            boolean found = false;
            ProcessNode x = head;
            do {
                if (x == c) {
                    found = true;
                    break;
                }
                x = x.next;
            } while (x != head);
            if (!found) c = head;
            System.out.println("After round:");
            display();
        }
    }

    void remove(int id) {
        if (head == null) return;
        ProcessNode p = tail, c = head;
        do {
            if (c.id == id) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    p.next = c.next;
                    if (c == head) head = c.next;
                    if (c == tail) tail = p;
                    tail.next = head;
                }
                size--;
                return;
            }
            p = c;
            c = c.next;
        } while (c != head);
    }
}

class CircularRoundRobin {
    public static void main(String[] a) {
        RoundRobinList r = new RoundRobinList();
        r.add(1, 5, 1);
        r.add(2, 3, 2);
        r.add(3, 7, 1);
        r.display();
        r.run(2);
    }
}
