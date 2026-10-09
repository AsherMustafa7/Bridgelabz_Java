/*
 * Problem 4: Sliding Window Maximum
Given an integer array and a window size k, find the maximum element in every contiguous window of size k.
Use a deque of indices to keep only useful candidates for the maximum.
 *
 * Hint:
 * Remove indices that fall outside the current window, and remove smaller values from the deque back before adding the current index.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// Find the maximum value in every window of size k.
class SlidingWindowMaximum {
    // Return an empty array if the window size is invalid.
    static int[] maxInWindows(int[] values, int k) {
        if (values == null || k <= 0 || k > values.length) {
            return new int[0];
        }
        int[] result = new int[values.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < values.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && values[deque.peekLast()] <= values[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = values[deque.peekFirst()];
            }
        }
        return result;
    }

    // Demonstrate sliding window maximum.
    public static void main(String[] args) {
        int[] values = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxInWindows(values, 3)));
    }
}