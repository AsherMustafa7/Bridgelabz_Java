package OptionalClasses.ifPresentOrElsetest;

import java.util.*;

public class ifPresentOrElsetest 
{
    public static void main(String[] args) 
    {
        Optional <String> str= Optional.of("Asher");
        str.ifPresentOrElse(s->System.out.println(s),()->System.out.println("Nothing is found here"));
        Optional <String> str2=Optional.empty();
        str2.ifPresentOrElse(s->System.out.println(s),()->System.out.println("Nothing is found here"));
    }
}
