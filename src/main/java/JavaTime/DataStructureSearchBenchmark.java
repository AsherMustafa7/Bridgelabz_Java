/*
 * Problem Statement: Compare searching in an array, HashSet, and TreeSet.
 * Hint: Array search is O(N), HashSet lookup is O(1) on average, and TreeSet lookup is O(log N). HashSet uses additional memory and does not preserve sorted order.
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
import java.util.HashSet;
import java.util.TreeSet;
public class DataStructureSearchBenchmark {
    // Builds each data structure and measures a lookup near the end.
    public static void main(String[] args) {
        int[] sizes={1000,100000,1000000};
        for(int n:sizes) {
            int[] a=new int[n]; HashSet<Integer> hs=new HashSet<>(); TreeSet<Integer> ts=new TreeSet<>();
            // Adds the same values to all three structures.
            for(int i=0;i<n;i++) { a[i]=i; hs.add(i); ts.add(i); }
            int target=n-1;
            long t=System.nanoTime(); boolean af=arraySearch(a,target); long at=System.nanoTime()-t;
            t=System.nanoTime(); boolean hf=hs.contains(target); long ht=System.nanoTime()-t;
            t=System.nanoTime(); boolean tf=ts.contains(target); long tt=System.nanoTime()-t;
            System.out.println("N = "+n);
            System.out.printf("Array: found=%b time=%.4f ms%nHashSet: found=%b time=%.4f ms%nTreeSet: found=%b time=%.4f ms%n%n",af,at/1e6,hf,ht/1e6,tf,tt/1e6);
        }
    }
    // Scans values until a match is found.
    public static boolean arraySearch(int[] a,int target) {
        for(int value:a) if(value==target) return true;
        return false;
    }
}
