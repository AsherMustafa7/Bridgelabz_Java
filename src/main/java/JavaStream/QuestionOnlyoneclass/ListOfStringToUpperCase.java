package JavaStream.QuestionOnlyoneclass;
import java.util.*;
public class ListOfStringToUpperCase 
{
    public static void main(String[] args) 
    {
        List<String> str= Arrays.asList("Asher","Navya","Horahora");
        str.stream().map(s->s.toUpperCase()).forEach(e->System.out.println(e));
    }
}
