/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].

 * Author : Asher Mustafa
 * Date: 13 - 10 - 2026
 *  */
package JavaCollections.ListInterface;

import java.util.*;

public class ReverseList {

    public static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        LinkedList<Integer> linked = new LinkedList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        reverseList(arr);
        reverseList(linked);

        System.out.println(arr);
        System.out.println(linked);
    }
}