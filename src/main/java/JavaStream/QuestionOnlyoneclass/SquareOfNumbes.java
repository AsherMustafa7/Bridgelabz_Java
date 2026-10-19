package JavaStream.QuestionOnlyoneclass;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumbes 
{
    public static void main(String[] args) 
    {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> square=ls.stream().map(n->n*n).toList();
        System.out.println(square);
        
    }
}
