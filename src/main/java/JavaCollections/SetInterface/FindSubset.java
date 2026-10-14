package JavaCollections.SetInterface;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class FindSubset {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3));
        if(set1.size()<=set2.size())
        {
            System.out.println(set2.containsAll(set1));
        }
        else
        {
            System.out.println(set1.containsAll(set2));
        }
        // boolean result = set1.containsAll(set2) || set2.containsAll(set1);

        // System.out.println(result);
    }
}