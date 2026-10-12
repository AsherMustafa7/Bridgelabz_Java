/*
 * StringBuffer Problem 2: Compare StringBuffer and StringBuilder
 *
 * Problem Statement:
 * Compare the time taken by StringBuffer and StringBuilder to append a large number of repeated strings. Print the elapsed time for each.
 *
 * Hint:
 * Use System.nanoTime() immediately before and after each timed loop. Keep the iteration count configurable because one million appends can take different amounts of time on different computers.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class CompareStringBufferStringBuilder {
    // Run the performance comparison.
    public static void main(String[] args) {
        int n = 1_000_000;
        // Measure StringBuilder.
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder(n * 5);
        for (int i = 0; i < n; i++) builder.append("hello");
        long builderTime = System.nanoTime() - startBuilder;

        // Measure StringBuffer.
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer(n * 5);
        for (int i = 0; i < n; i++) buffer.append("hello");
        long bufferTime = System.nanoTime() - startBuffer;

        // Print timings in milliseconds.
        System.out.printf("StringBuilder: %.3f ms%n", builderTime / 1_000_000.0);
        System.out.printf("StringBuffer:  %.3f ms%n", bufferTime / 1_000_000.0);
        // Print lengths to ensure both results were produced.
        System.out.println("Builder length: " + builder.length());
        System.out.println("Buffer length: " + buffer.length());
    }
}
