package JavaStacksandQueues;
import java.util.*;
public class Something {
   public static void main(String[] args)
   {
        HashMap<Integer,String>mpp = new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        mpp.put(1,"Asher");
        mpp.put(2,"Mustafa");
        mpp.put(3,"Java");
        // for(Map.Entry<Integer,String>e:mpp.entrySet())
        // {
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }
        for( Integer key:mpp.keySet())
        {
            System.out.println(key+" "+mpp.get(key));
        }
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for(int i=0;i<arr.size();i++){
            System.out.println(mpp.get(arr.get(i)));
        }
        // now lets try to see how we would remove an element from the hashmap
        mpp.remove(2);
        System.out.println("After removing key 2");
        for( Integer key:mpp.keySet())
        {
            System.out.println(key+" "+mpp.get(key));
        }
        // now lets try to see how we would remove an element from the arraylist
        arr.remove(1);
        System.out.println("After removing index 1 from arraylist");
        for(int i=0;i<arr.size();i++){
            System.out.println(mpp.get(arr.get(i)));
        }
        // now lets try to see how we would remove an element from the arraylist using iterator
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            Integer value = it.next();
            if(value==3){
                it.remove();
            }
        }
   }
    
    
}
