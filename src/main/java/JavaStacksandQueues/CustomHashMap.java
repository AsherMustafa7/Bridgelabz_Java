/*
 * Problem 4: Implement a Custom Hash Map
Design a basic integer-key, string-value hash map with insertion, retrieval, and deletion operations.
Use an array of linked-list buckets and separate chaining to handle collisions.
 *
 * Hint:
 * Hash a key to a bucket index. Search that bucket for matching keys before updating, retrieving, or deleting an entry.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
// Implement a small hash map with separate chaining.

class CustomHashMap {

    static class Node {
        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Node[] buckets;
    int size;

    CustomHashMap() {
        buckets = new Node[7];
        size = 0;
    }

    // Find the bucket index for a key
    int hash(int key) {
        return Math.floorMod(key, buckets.length);
    }

    // Insert a key-value pair or update an existing key
    void put(int key, String value) {
        int index = hash(key);
        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    // Retrieve the value associated with a key
    String get(int key) {
        int index = hash(key);
        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }

            temp = temp.next;
        }

        return null;
    }

    // Delete a key-value pair
    boolean remove(int key) {
        int index = hash(key);
        Node temp = buckets[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key == key) {

                if (prev == null) {
                    buckets[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }

                size--;
                return true;
            }

            prev = temp;
            temp = temp.next;
        }

        return false;
    }

    // Display all key-value pairs
    void display() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print(i + ": ");

            Node temp = buckets[i];

            while (temp != null) {
                System.out.print(
                    "(" + temp.key + ", " + temp.value + ") -> "
                );
                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(10, "Apple");
        map.put(17, "Mango");
        map.put(5, "Banana");

        System.out.println("Value of key 10: " + map.get(10));
        System.out.println("Value of key 17: " + map.get(17));

        // Update an existing key
        map.put(10, "Orange");
        System.out.println("Updated key 10: " + map.get(10));

        // Delete a key
        System.out.println("Removed key 17: " + map.remove(17));
        System.out.println("Value of key 17: " + map.get(17));

        System.out.println("\nHash Map:");
        map.display();
    }
}
