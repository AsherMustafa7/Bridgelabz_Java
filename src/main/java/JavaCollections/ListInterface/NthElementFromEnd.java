/*
 * Question: Given a singly linked list (use LinkedList), find the Nth
 * element from the end without calculating its size.
 *
 * Hint: Use two pointers. Move the first pointer N positions ahead.
 * Then move both pointers together until the first reaches the end.
 * The second pointer will point to the required element.
 *
 * Example:
 * Input: [A, B, C, D, E], N = 2
 * Output: D
 *
 * Author : Asher Mustafa
 * Date: 13 - 10 - 2026
 */

package JavaCollections.ListInterface;

import java.util.LinkedList;
import java.util.Iterator;

public class NthElementFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                System.out.println("Invalid N");
                return;
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        if (second.hasNext()) {
            System.out.println(second.next());
        }
    }
}