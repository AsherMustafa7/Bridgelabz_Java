/*
 * Problem Statement: Compare Bubble Sort, Merge Sort, and Quick Sort.
 * Hint: Bubble Sort is O(N²); Merge Sort is O(N log N) and stable; Quick Sort is O(N log N) on average but O(N²) in the worst case. Bubble Sort uses moderate input sizes.
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
import java.util.Arrays;
import java.util.Random;
public class SortingAlgorithmsBenchmark {
    // Measures the three sorting algorithms on identical data.
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000};
        Random r = new Random(42);
        for (int n : sizes) {
            int[] original = new int[n];
            for (int i = 0; i < n; i++) original[i] = r.nextInt(100000);
            int[] a = Arrays.copyOf(original, n), b = Arrays.copyOf(original, n), c = Arrays.copyOf(original, n);
            long t = System.nanoTime(); bubbleSort(a); long bt = System.nanoTime() - t;
            t = System.nanoTime(); mergeSort(b, 0, n - 1); long mt = System.nanoTime() - t;
            t = System.nanoTime(); quickSort(c, 0, n - 1); long qt = System.nanoTime() - t;
            System.out.println("N = " + n);
            System.out.printf("Bubble Sort: %.4f ms%nMerge Sort: %.4f ms%nQuick Sort: %.4f ms%n%n", bt/1e6, mt/1e6, qt/1e6);
        }
    }
    // Swaps adjacent out-of-order values.
    static void bubbleSort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            boolean changed=false;
            for (int j=0; j<a.length-1-i; j++) if (a[j]>a[j+1]) { int x=a[j]; a[j]=a[j+1]; a[j+1]=x; changed=true; }
            if (!changed) break;
        }
    }
    // Recursively sorts two halves and merges them.
    static void mergeSort(int[] a, int l, int r) {
        if (l>=r) return;
        int m=l+(r-l)/2; mergeSort(a,l,m); mergeSort(a,m+1,r); merge(a,l,m,r);
    }
    // Merges two sorted ranges into one sorted range.
    static void merge(int[] a,int l,int m,int r) {
        int[] x=new int[r-l+1]; int i=l,j=m+1,k=0;
        while(i<=m && j<=r) x[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<=m) x[k++]=a[i++]; while(j<=r) x[k++]=a[j++];
        System.arraycopy(x,0,a,l,x.length);
    }
    // Sorts around a pivot using partitioning.
    static void quickSort(int[] a,int l,int r) {
        if(l>=r) return; int p=partition(a,l,r); quickSort(a,l,p-1); quickSort(a,p+1,r);
    }
    // Places the pivot in its sorted position.
    static int partition(int[] a,int l,int r) {
        int pivot=a[r],i=l-1;
        for(int j=l;j<r;j++) if(a[j]<=pivot) { i++; int x=a[i];a[i]=a[j];a[j]=x; }
        int x=a[i+1];a[i+1]=a[r];a[r]=x; return i+1;
    }
}
