/*

- Question: Reverse the elements of a queue using queue operations.
-
- Hint: Remove each element from the queue and push it onto a stack.
- Then pop the elements from the stack and add them back to the queue.
-
- Example:
- Input: [10, 20, 30]
- Output: [30, 20, 10]
- Author : Asher Mustafa
- Date: 14 - 10 - 2026
*/

package JavaCollections.QueueInterface;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseQueue {
public static void main(String[] args) 
{
Queue<Integer> queue = new LinkedList<>();


    queue.add(10);
    queue.add(20);
    queue.add(30);

    Stack<Integer> stack = new Stack<>();

    while (!queue.isEmpty()) {
        stack.push(queue.remove());
    }

    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }

    System.out.println(queue);
}

}
