/*
Question: Find the symmetric difference of two sets.
The symmetric difference contains elements present in either set,
but not in both sets.
Hint: Find the union and intersection of both sets.
Then remove the intersection elements from the union.
Example:
Set1: {1, 2, 3}
Set2: {3, 4, 5}
Output: {1, 2, 4, 5}

Author : Asher Mustafa
Date: 13 - 10 - 2026
*/
package JavaCollections.SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
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
        Set<Integer> symmetricDifference=new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        System.out.println("Symmetric Difference: "+symmetricDifference);
        
    }
}
