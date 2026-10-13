/*

Question: Compare two sets and determine if they contain the same

elements, regardless of order.

Hint: Use the equals() method to compare the two sets.
Example:

Set1: {1, 2, 3}

Set2: {3, 2, 1}

Output: true
Author : Asher Mustafa

Date: 13 - 10 - 2026
*/
package JavaCollections.SetInterface;
import java.util.HashSet;
import java.util.Set;
public class CheckSetEquality {
    public static void main(String[] args)
    {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println(set1.equals(set2));
    }
}
