package JavaGenerics.SometestingClasses.GenericContainerImplementation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container<String> c1= new GenericContainer<>("Asher Mustafa 1");
        c1.added("Asher Mustafa");
        System.out.println(c1.get());
        List<Container<String>> ls= new ArrayList<Container<String>>();
        // the objects that I will add to this
        
        ls.add(new GenericContainer<>("hello World 1"));
        ls.add(new GenericContainer<>("hello World 2"));
        ls.add(new GenericContainer<>("hello World 3"));
        for(Container<String> vals: ls)
            {
                System.out.println(vals.get());
            }
        }
}
