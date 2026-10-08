package LinkListQuestion;

/*
 * Problem 7: Singly Linked List: Social Media Friend Connections
 * Each user node stores User ID, Name, Age, and a linked list of Friend IDs.
 * Implement adding and removing connections, mutual-friend search, friend
 * display, user search by name or ID, and friend counting.
 * Hint: Use a singly linked list of users and a nested singly linked list of
 * friend IDs. Compare the nested lists to find mutual friends.
 * Author: Asher Mustafa
 * Date: 08 - 10 - 2026
 */
class FriendNode {
    int id;
    FriendNode next;

    FriendNode(int i) {
        id = i;
    }
}

class UserNode {
    int id, age;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
}

class SocialList {
    private UserNode head;

    void addUser(int i, String n, int a) {
        UserNode x = new UserNode(i, n, a);
        if (head == null) {
            head = x;
            return;
        }
        UserNode c = head;
        while (c.next != null)
            c = c.next;
        c.next = x;
    }

    UserNode searchId(int i) {
        for (UserNode c = head; c != null; c = c.next)
            if (c.id == i)
                return c;
        return null;
    }

    UserNode searchName(String n) {
        for (UserNode c = head; c != null; c = c.next)
            if (c.name.equalsIgnoreCase(n))
                return c;
        return null;
    }

    boolean has(UserNode u, int id) {
        for (FriendNode f = u.friends; f != null; f = f.next)
            if (f.id == id)
                return true;
        return false;
    }

    void addOne(UserNode u, int id) {
        if (has(u, id))
            return;
        FriendNode x = new FriendNode(id);
        x.next = u.friends;
        u.friends = x;
    }

    void connect(int a, int b) {
        UserNode x = searchId(a), y = searchId(b);
        if (x != null && y != null) {
            addOne(x, b);
            addOne(y, a);
        }
    }

    void removeOne(UserNode u, int id) {
        FriendNode p = null, c = u.friends;
        while (c != null) {
            if (c.id == id) {
                if (p == null)
                    u.friends = c.next;
                else
                    p.next = c.next;
                return;
            }
            p = c;
            c = c.next;
        }
    }

    void remove(int a, int b) {
        UserNode x = searchId(a), y = searchId(b);
        if (x != null && y != null) {
            removeOne(x, b);
            removeOne(y, a);
        }
    }

    void displayFriends(int id) {
        UserNode u = searchId(id);
        if (u == null)
            return;
        for (FriendNode f = u.friends; f != null; f = f.next) {
            UserNode x = searchId(f.id);
            if (x != null)
                System.out.println(x.name);
        }
    }

    void mutual(int a, int b) {
        UserNode x = searchId(a), y = searchId(b);
        if (x == null || y == null)
            return;
        for (FriendNode f = x.friends; f != null; f = f.next)
            if (has(y, f.id)) {
                UserNode z = searchId(f.id);
                if (z != null)
                    System.out.println(z.name);
            }
    }

    int count(int id) {
        UserNode u = searchId(id);
        int n = 0;
        if (u != null)
            for (FriendNode f = u.friends; f != null; f = f.next)
                n++;
        return n;
    }
}

class SinglySocialMediaFriends {
    public static void main(String[] a) {
        SocialList s = new SocialList();
        s.addUser(1, "Asher", 20);
        s.addUser(2, "Rahul", 21);
        s.addUser(3, "Navya", 20);
        s.connect(1, 2);
        s.connect(1, 3);
        s.connect(2, 3);
        System.out.println("Asher friends:");
        s.displayFriends(1);
        System.out.println("Mutual:");
        s.mutual(1, 2);
        System.out.println("Count: " + s.count(1));
    }
}
