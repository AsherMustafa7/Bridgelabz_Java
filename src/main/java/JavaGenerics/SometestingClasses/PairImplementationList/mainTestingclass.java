package JavaGenerics.SometestingClasses.PairImplementationList;

import java.util.ArrayList;
import java.util.List;

public class mainTestingclass 
{
    public static void main(String []args)
    {
        Pair<String, Integer> p = new Pair<>("One", 1);
        System.out.println("Key: "+ p.getKey() +" | "+ "Value : "+ p.getValue());
        List<Pair<String, Integer>> ls = new ArrayList<Pair<String, Integer>>();
        ls.add(new Pair<>("Two", 2));
        ls.add(new Pair<>("Three", 3));
        for (Pair<String, Integer> pair : ls) {
            System.out.println("Key: "+ pair.getKey() +" | "+ "Value : "+ pair.getValue());
        }
    }
}
