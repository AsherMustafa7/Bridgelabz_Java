package LinkListQuestion;

/*
 * Problem 1: Singly Linked List: Student Record Management
 * Create a program to manage student records using a singly linked list.
 * Each node stores Roll Number, Name, Age, and Grade.
 * Implement insertion at beginning, end, and a specific position; 
 * deletion by Roll Number; search by Roll Number; display; and grade update.
 * Hint: Keep head as the first node and keep the last nodes next as null.
 * Update next pointers whenever nodes are inserted or deleted.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class StudentNode {
    int rollNumber, age;
    String name, grade;
    StudentNode next;

    StudentNode(int r, String n, int a, String g) {
        rollNumber = r;
        name = n;
        age = a;
        grade = g;
    }
}

class StudentList {
    private StudentNode head;

    void addBeginning(int r, String n, int a, String g) {
        StudentNode x = new StudentNode(r, n, a, g);
        x.next = head;
        head = x;
    }

    void addEnd(int r, String n, int a, String g) {
        StudentNode x = new StudentNode(r, n, a, g);
        if (head == null) {
            head = x;
            return;
        }
        StudentNode c = head;
        while (c.next != null)
            c = c.next;
        c.next = x;
    }

    void addPosition(int p, int r, String n, int a, String g) {
        if (p <= 1 || head == null) {
            addBeginning(r, n, a, g);
            return;
        }
        StudentNode c = head;
        for (int i = 1; i < p - 1 && c.next != null; i++)
            c = c.next;
        StudentNode x = new StudentNode(r, n, a, g);
        x.next = c.next;
        c.next = x;
    }

    void delete(int r) {
        if (head == null)
            return;
        if (head.rollNumber == r) {
            head = head.next;
            return;
        }
        StudentNode c = head;
        while (c.next != null && c.next.rollNumber != r)
            c = c.next;
        if (c.next != null)
            c.next = c.next.next;
    }

    StudentNode search(int r) {
        StudentNode c = head;
        while (c != null) {
            if (c.rollNumber == r)
                return c;
            c = c.next;
        }
        return null;
    }

    void updateGrade(int r, String g) {
        StudentNode x = search(r);
        if (x != null)
            x.grade = g;
    }

    void display() {
        StudentNode c = head;
        while (c != null) {
            System.out.println(c.rollNumber + " | " + c.name + " | " + c.age + " | " + c.grade);
            c = c.next;
        }
    }
}

class SinglyStudentRecord {
    public static void main(String[] args) {
        StudentList s = new StudentList();
        s.addBeginning(1, "Asher", 20, "A");
        s.addEnd(2, "Rahul", 21, "B");
        s.addPosition(2, 3, "Navya", 20, "A+");
        s.updateGrade(2, "A");
        s.display();
    }
}
