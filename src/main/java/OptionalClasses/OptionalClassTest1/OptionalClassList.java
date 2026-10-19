package OptionalClasses.OptionalClassTest1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassList {
    public static void main(String[] args) {
    
        // we learn to create an optional list and print the values using for each loop and also by converting them to upper case
        List<String> arr = Arrays.asList("Asher","hello","How are you");
        List<Optional<String>> str= arr.stream().map( s->Optional.of(s.toUpperCase()) ).toList();
        System.out.println(str);
        System.out.println("Printing through foreach");
        str.forEach(s->s.ifPresent(t->System.out.println(t)));

    }
}
