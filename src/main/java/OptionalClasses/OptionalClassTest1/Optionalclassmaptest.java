package OptionalClasses.OptionalClassTest1;
import java.util.*;
public class Optionalclassmaptest 
{
    public static void main(String [] args)
    {
        List<String> narr = Arrays.asList("Asher","hello","How are you");
        System.out.println(narr);
        List<String> result=narr.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(result);
        List<Optional<String>> result2=narr.stream().map(s -> Optional.of(s.toUpperCase())).toList();
        result2.forEach(s->s.ifPresent(System.out::println));
    }
}

// Hello my name is Asher 