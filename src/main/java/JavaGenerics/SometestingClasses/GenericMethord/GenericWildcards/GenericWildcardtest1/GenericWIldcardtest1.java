package JavaGenerics.SometestingClasses.GenericMethord.GenericWildcards.GenericWildcardtest1;
import java.util.ArrayList;
public class GenericWIldcardtest1 
{
    // please remeber as you can see we are only printing the valuse that is reading the values so 
    // we can use the unbounded wildcards here as we are not writing any values to the list
    // if we are writing values to the list then we can use the bounded wildcards here
    public static void main(String[] args) 
    {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        GenericWIldcardtest1 obj = new GenericWIldcardtest1();
        obj.printArraylist(strList);
        System.out.println();
        obj.printArraylist2(intList);
        System.out.println();
        // use the addtolist method to add values to the list
        obj.addToList(intList,200);
        System.out.println();
        obj.printArraylist(intList);
    }
    public void printArraylist(ArrayList<?> ls)
    {
        for(Object element:ls)
        {
            System.out.print(element+" ");
        }
    }
    public void printArraylist2(ArrayList<? extends Number> ls)
    {
        for(Object element:ls)
        {
            System.out.print(element+" ");
            // nothing I am write object here cause we dont really know which one will it be , would it be integer or double or float so we are just writing object here
            // if we try to do something else like 
            // ls.add(10); // this will give an error as we dont know what type of list it is so we cannot add any value to it
            // we can only read from the list, not write to it
            // cause the Number the above class and other like integer and double are all subclasses of Number
            // so we dont know which one it is so we cannot add any value to it
        }
    }
    // okay a few things to keep in my as you can see i name both of the function differenly 
    // cause if i name both of the function same then it will give me an error as the compiler will not be able to differentiate between the two functions
    // this is because ava uses a process called type erasure for generics. At runtime, the generic type arguments are erased, so both methods effectively have this parameter type:
    

    // WHAT IF I WANT TO ADD VALUES TO THE LIST THEN I CAN USE BOUNDED WILDCARDS LIKE THIS
    public void addToList(ArrayList<? super Integer> ls,Integer value)
    {
        ls.add(value);;
        for(Object element:ls)
        {
            System.out.print(element+" ");
        }
        // this works cause Integer is a subclass of Number , that means if we write ls.add(10);
        // then it works, now ls.add(0.5) will not work as 0.5 is a double and not an integer
        // cause its like number -> Integer and Number -> double and Number -> Float and Number -> Long and Number -> Short and Number -> Byte
        // so ? super Integer means that it can be any superclass of Integer, so it can be Number or Object but not Double or Float or Long or Short or Byte
        // so even if the ? is a Number or object then it will work cause Integer is a subclass of Number and Object is a superclass of Number

    }
}
