package JavaGenerics.SometestingClasses.GenericMethord.GenericWildcards.GenericWildcardtest2;
import java.util.ArrayList;
import java.util.Arrays;
public class GenericWildCardtest2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> ls= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> ls2= new ArrayList<>();
        copy(ls,ls2);
        System.out.println(ls2);
    }
    public static <T> void copy(ArrayList<T> source, ArrayList<T> target) 
    
    {
        for(T element:source)
        {
            target.add(element);
        }
    }
    // we were only able to cppy form the souse to the target cause of them were of type T and we knew exactally that
    // but if i would have written this wildcard like this
    // public static void copy(ArrayList<?> source, ArrayList<?> target)
    // {
    //     for(Object element:source)
    //     {
    //         target.add(element); 
                // this is an error cause both the source and target can we of diffferent types
    //     }
    // }
}

