/*
 * Question: Convert a HashSet of integers into a sorted list
 * in ascending order.
 *
 * Hint: Convert the HashSet into an ArrayList and use
 * Collections.sort() to sort the elements.
 *
 * Example:
 * Input: {5, 3, 9, 1}
 * Output: [1, 3, 5, 9]
 *
 * Author : Asher Mustafa
 * Date: 14 - 10 - 2026
 */

package JavaCollections.SetInterface;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(
            Arrays.asList(5, 3, 9, 1)
        );

        
        Set<Integer> setsorted= new TreeSet<>(set);
        System.out.println(setsorted);
        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // System.out.println(list);
    }
}