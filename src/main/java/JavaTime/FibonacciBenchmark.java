/*
 * Problem Statement: Compare recursive and iterative Fibonacci computation.
 * Hint: Naive recursion has exponential time complexity because it repeats work. Iteration is O(N) time and O(1) extra space. Use modest N values.
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
public class FibonacciBenchmark {
    // Compares both approaches for Fibonacci indices up to 40.
    public static void main(String[] args) {
        int[] values={10,30,40};
        for(int n:values) {
            long t=System.nanoTime(); long a=fibonacciRecursive(n); long at=System.nanoTime()-t;
            t=System.nanoTime(); long b=fibonacciIterative(n); long bt=System.nanoTime()-t;
            System.out.println("N = "+n+", results = "+a+", "+b);
            System.out.printf("Recursive: %.4f ms%nIterative: %.4f ms%n%n",at/1e6,bt/1e6);
        }
    }
    // Calculates Fibonacci by recursively calculating both previous values.
    public static long fibonacciRecursive(int n) {
        if(n<=1) return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    // Calculates each Fibonacci value once using a loop.
    public static long fibonacciIterative(int n) {
        if(n<=1) return n;
        long a=0,b=1;
        for(int i=2;i<=n;i++) { long sum=a+b; a=b; b=sum; }
        return b;
    }
}
