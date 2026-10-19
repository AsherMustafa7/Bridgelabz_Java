package JavaGenerics.SometestingClasses.GenericMethord.GenericWildcards.GenericWildcardtest4;

import java.util.ArrayList;

public class GenericWildcardtest4 
{
     public static void main(String[] args) 
    {
        ArrayList<Integer> ls= new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(sum(ls));
        // now use the print methord that we have defined with the lower bounded wild card
        ArrayList<Number> ls2= new ArrayList<>();
        ls2.add(10);
        ls2.add(20);
        ls2.add(30);
        print(ls2);
    }
    public static  double sum(ArrayList<? extends Number> ls)
    {
        double total = 0;
        for(Number element : ls)
        {
            total += element.intValue();
        }
        return total;
        // we have defined a wild card and it will take all the integer, double, float, long, short, byte and all the other classes that extend the Number class
        // we so can provide the reference as Number and use the intValue fnction cause we may get the Number type valuse or below , so we use whatever methord we have

    }
    public static void print (ArrayList<? super Integer> ls)
    {
        for(Object element:ls)
        {
            System.out.print(element+" ");
        }
        // this methord can take all the super classes of Integer class like Number, Object and so on
        // can we tqke a double here?
        // no we cannot take a double here cause double is not a super class of Integer class
    }
}
