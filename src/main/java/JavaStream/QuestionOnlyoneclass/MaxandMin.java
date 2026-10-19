package JavaStream.QuestionOnlyoneclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxandMin 
{
    public static void main(String[] args) 
    {
        List<Integer> nums=Arrays.asList(1,2,3,10,5,5,6,6,7,8,8,12,13);
        Optional<Integer>ops=nums.stream().min((a,b)->(int)(a-b));
        ops.ifPresent(n->System.out.println("Min: "+n));
        Optional<Integer>ops2=nums.stream().min((a,b)->(int)(b-a));
        ops2.ifPresent(n->System.out.println("Max: "+n));
        
    }
}
