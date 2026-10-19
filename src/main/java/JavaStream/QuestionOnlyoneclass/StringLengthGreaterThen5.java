package JavaStream.QuestionOnlyoneclass;

import java.util.Arrays;
import java.util.List;

public class StringLengthGreaterThen5 {
    public static void main(String[] args) 
    {
        List<String> str= Arrays.asList("Asher","Navya","Horahora");
        str.stream().filter(s->s.length()>5).forEach(e->System.out.println(e+" "));
        
    }
}
