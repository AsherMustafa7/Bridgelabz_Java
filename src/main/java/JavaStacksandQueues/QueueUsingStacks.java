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

import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Add an element to the queue
    void enqueue(int value) {
        stack1.push(value);
    }

    // Remove an element from the queue
    int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
        System.out.println(q.dequeue()); // -1
    }
}
