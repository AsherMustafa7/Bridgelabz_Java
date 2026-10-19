package JavaStream.JavaStream1;

import java.util.Arrays;
import java.util.List;

public class JavaStream1 
{
    public static void main(String[] args) 
    {
         List<String> narr = Arrays.asList("Asher","hello","How are you");
        System.out.println(narr);
        List<String> result=narr.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(result);
    }
}
