package JavaGenerics.onlineCompilerClassesStyle.Test2;
import java.util.*;  

public class Test2 
{
    public static void main(String[] args)
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
class Pair<K,V>
{
    private K key;
    private V value;
    public Pair()
    {
       
    }
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    public K getKey()
    {
        return key;
    }
    public V getValue()
    {
        return value;
    }
    public void put(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}

