/*
 * Problem Statement: Compare Linear Search and Binary Search on different dataset sizes.
 * Hint: Linear Search is O(N). Binary Search is O(log N) but requires sorted data; sorting costs O(N log N).
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
import java.util.Arrays;
public class SearchTargetBenchmark {
    // Runs the comparison on several array sizes.
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int n : sizes) {
            int[] a = new int[n];
            // Creates sorted values for repeatable measurements.
            for (int i = 0; i < n; i++) a[i] = i * 2;
            int target = a[n - 1];
            long t1 = System.nanoTime();
            int li = linearSearch(a, target);
            long lt = System.nanoTime() - t1;
            int[] b = Arrays.copyOf(a, n);
            long ts = System.nanoTime();
            Arrays.sort(b);
            long sort = System.nanoTime() - ts;
            long tb = System.nanoTime();
            int bi = Arrays.binarySearch(b, target);
            long bt = System.nanoTime() - tb;
            System.out.println("N = " + n);
            System.out.printf("Linear Search index=%d time=%.4f ms%n", li, lt / 1e6);
            System.out.printf("Sorting time=%.4f ms%n", sort / 1e6);
            System.out.printf("Binary Search index=%d time=%.4f ms%n%n", bi, bt / 1e6);
        }
    }
    // Checks each value until the target is found.
    public static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            // Returns immediately on a match.
            if (a[i] == target) return i;
        }
        return -1;
    }
}
