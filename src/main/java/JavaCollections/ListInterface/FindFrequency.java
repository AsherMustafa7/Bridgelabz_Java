
/*
 * Question: Given a list of strings, count the frequency of each element
 * and return the results in a Map<String, Integer>.
 *
 * Hint: Use a HashMap to store each string and its frequency.
 * If the string already exists, increase its count by 1.
 *
 * Author : Asher Mustafa
 * Date: 13 - 10 - 2026
 */

package JavaCollections.ListInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        Map<String, Integer> mpp = new HashMap<>();

        for (String word : list) {

            if (mpp.containsKey(word)) {
                mpp.put(word, mpp.get(word) + 1);
            } else {
                mpp.put(word, 1);
            }
        }

        System.out.println(mpp);
    }
}
