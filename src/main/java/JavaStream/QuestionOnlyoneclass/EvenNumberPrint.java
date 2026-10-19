package JavaStream.QuestionOnlyoneclass;
import java.util.*;
public class EvenNumberPrint 
{
    public static void main(String[] args) 
    {
       List <Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       List<Integer> evenNumbers=arr.stream().filter(n->n%2==0).toList();
       System.out.println(evenNumbers);
    }
}
