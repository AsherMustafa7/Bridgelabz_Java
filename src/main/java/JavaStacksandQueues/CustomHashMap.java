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
    // Store key-value entries inside linked buckets.
    private static class Entry {
        int key;
        String value;
        Entry next;
        Entry(int key, String value) { this.key = key; this.value = value; }
    }

    private final Entry[] buckets = new Entry[16];

    // Convert any integer key into a valid bucket index.
    private int index(int key) {
        return (key & 0x7fffffff) % buckets.length;
    }

    // Insert a new key or update an existing key.
    void put(int key, String value) {
        int index = index(key);
        Entry current = buckets[index];
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Entry entry = new Entry(key, value);
        entry.next = buckets[index];
        buckets[index] = entry;
    }

    // Return the value for a key, or null if absent.
    String get(int key) {
        Entry current = buckets[index(key)];
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
        return null;
    }

    // Remove a key if it exists.
    boolean remove(int key) {
        int index = index(key);
        Entry current = buckets[index];
        Entry previous = null;
        while (current != null) {
            if (current.key == key) {
                if (previous == null) buckets[index] = current.next;
                else previous.next = current.next;
                current.next = null;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    // Demonstrate insertion, retrieval, and deletion.
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, "Asher");
        map.put(17, "Java");
        System.out.println(map.get(1));
        System.out.println(map.get(17));
        System.out.println("Removed: " + map.remove(1));
        System.out.println(map.get(1));
    }
}