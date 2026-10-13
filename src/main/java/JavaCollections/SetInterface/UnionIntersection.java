/*
Question: Given two sets, compute their union and intersection.
Hint: Use addAll() to find the union and retainAll() to find
the intersection of two sets.
Example:
Set1: {1, 2, 3}
Set2: {3, 4, 5}
Union: {1, 2, 3, 4, 5}
Intersection: {3}

Author : Asher Mustafa
Date: 13 - 10 - 2026
*/
package JavaCollections.SetInterface;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class UnionIntersection {
    public static void main(String[] args)
    {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2= new HashSet<>(Arrays.asList(4,5,6,7,8));
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: "+union);
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);
        
    }
}
