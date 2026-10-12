package JavaStacksandQueues;
import java.util.*;
public class prefixsum {
    static List<List<Integer>> findall(int[] ar)
    {
        List<List<Integer>> result=new ArrayList<>();
        HashMap<Integer,List<Integer>>mp=new HashMap<>();
        int n=ar.length;
        int sum=0;
        mp.put(0,new ArrayList<>());
        mp.get(0).add(-1);
        for(int i =0;i<n;i++)
        {
            sum+=ar[i];
            if(mp.containsKey(sum))
            {
                for(int start:mp.get(sum))
                {
                    List<Integer> ls=new ArrayList<>();
                    for(int j=start+1;j<=i;j++)
                    {
                        ls.add(ar[j]);
                    }
                    result.add(ls);
                }
            }
            mp.putIfAbsent(sum,new ArrayList<>());
            mp.get(sum).add(i);
        }
        return result;
    }
    public static void main(String[] args) {

        // Create a sample integer array.
        int[] values = {2, -2, 3, 1, -1, 2, -3};

        // Find every contiguous subarray whose sum is zero.
        List<List<Integer>> result = findall(values);

        // Display the array.
        System.out.println("Original Array:");

        // Print all array elements.
        for (int value : values) {
            System.out.print(value + " ");
        }

        // Move to the next line.
        System.out.println();

        // Display all discovered zero-sum subarrays.
        System.out.println("\nZero-Sum Subarrays:");

        // Check whether any matching subarrays were found.
        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {

            // Print every matching subarray.
            for (List<Integer> subarray : result) {
                System.out.println(subarray);
            }
        }
    }
}
