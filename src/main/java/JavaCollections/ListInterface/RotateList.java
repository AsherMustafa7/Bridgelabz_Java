
/*
 * Question: Rotate the elements of a list by a given number of positions.
 *
 * Hint: Store the first k elements in a temporary list, shift the
 * remaining elements to the left, and place the saved elements at the end.
 *
 * Example:
 * Input: [10, 20, 30, 40, 50], rotate by 2
 * Output: [30, 40, 50, 10, 20]
 *
 * Author : Asher Mustafa
 * Date: 13 - 10 - 2026
 */

package JavaCollections.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
            Arrays.asList(10, 20, 30, 40, 50)
        );

        int k = 2;

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        for (int i = k; i < list.size(); i++) {
            list.set(i - k, list.get(i));
        }

        for (int i = 0; i < k; i++) {
            list.set(list.size() - k + i, temp.get(i));
        }

        System.out.println(list);
    }
}
