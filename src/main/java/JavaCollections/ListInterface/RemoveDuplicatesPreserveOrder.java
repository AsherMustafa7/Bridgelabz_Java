/*
 * Question: Remove duplicate elements from a list while maintaining
 * the original order of elements.
 *
 * Hint: Use LinkedHashSet because it stores only unique elements
 * while preserving their insertion order.
 *
 * Example:
 * Input: [3, 1, 2, 2, 3, 4]
 * Output: [3, 1, 2, 4]
 *
 * Author : Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaCollections.ListInterface;
import java.util.*;
public class RemoveDuplicatesPreserveOrder 
{
    public static void main(String args[])
    {
        List<Integer> ls=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        List<Integer> ls1=new ArrayList<>();
        for(int i =0; i <ls.size();i++)
        {
            if(!ls1.contains(ls.get(i)))
            {
                ls1.add(ls.get(i));
            }
        }
        System.out.println(ls1);
    }
    //  public static void main(String[] args) {

    //     List<Integer> list = new ArrayList<>(
    //         Arrays.asList(3, 1, 2, 2, 3, 4)
    //     );

    //     LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

    //     List<Integer> result = new ArrayList<>(set);

    //     System.out.println(result);
    // }
}


// import java.util.*;

// public class SetDemo {
//     public static void main(String[] args) {
//         List<Integer> list =
//             Arrays.asList(3, 1, 2, 2, 3, 4);

//         Set<Integer> hashSet = new HashSet<>(list);
//         Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
//         Set<Integer> treeSet = new TreeSet<>(list);

//         System.out.println("HashSet: " + hashSet);
//         System.out.println("LinkedHashSet: " + linkedHashSet);
//         System.out.println("TreeSet: " + treeSet);
//     }
// }
// The output will have these characteristics:
// Set type	Example output	Order
// HashSet	[1, 2, 3, 4] or another order	No guaranteed order
// LinkedHashSet	[3, 1, 2, 4]	Insertion order
// TreeSet	[1, 2, 3, 4]	Sorted order