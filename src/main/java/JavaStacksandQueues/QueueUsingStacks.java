/*
 * Problem 1: Implement a Queue Using Stacks
Design a queue using two stacks. Support enqueue and dequeue while preserving FIFO order.
Use one stack for incoming elements and one for outgoing elements. Transfer elements only when the outgoing stack is empty.
 *
 * Hint:
 * Use one stack for enqueue operations and another for dequeue operations. Moving items only when needed gives amortized O(1) operations.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
import java.util.ArrayDeque;
import java.util.Deque;

// Implement a queue using two stacks.
class QueueUsingStacks {
    private Deque<Integer> incoming = new ArrayDeque<>();
    private Deque<Integer> outgoing = new ArrayDeque<>();

    // Add a value to the back of the queue.
    void enqueue(int value) {
        incoming.push(value);
    }

    // Move values only when the outgoing stack is empty.
    private void transferIfNeeded() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) {
                outgoing.push(incoming.pop());
            }
        }
    }

    // Remove and return the oldest value.
    Integer dequeue() {
        transferIfNeeded();
        return outgoing.isEmpty() ? null : outgoing.pop();
    }

    // Return the oldest value without removing it.
    Integer peek() {
        transferIfNeeded();
        return outgoing.peek();
    }

    // Check whether the queue has no values.
    boolean isEmpty() {
        return incoming.isEmpty() && outgoing.isEmpty();
    }

    // Demonstrate queue operations.
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}