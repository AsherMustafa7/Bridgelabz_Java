package JavaStream.QuestionOnlyoneclass;

import java.util.Arrays;
import java.util.List;

public class AssendingDescending {
    public static void main(String[] args) 
    {
        List<Integer> nums=Arrays.asList(1,2,3,10,5,5,6,6,7,8,8);
        nums.stream().sorted((a,b)->(int)(a-b)).forEach(e->System.out.print(e+" "));
        System.out.println();
        nums.stream().sorted((a,b)->(int)(b-a)).forEach(e->System.out.print(e+" "));
    }
}
