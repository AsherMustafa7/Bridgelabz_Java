package JavaGenerics.onlineCompilerClassesStyle.Test1;
import java.util.*;
public class Test1
{
    public static void main(String[] args)
    {
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
            // I will explain few things here, so The first thing is that if always create a folder and then inside that create the one class, and as you can see , we have a Test1, and only that class will be
            // public and contain the main method, and the other classes will be non-public and will be inside the same file
            // we put the Test1 class in the Test1 folder cause its essential when they get compiled , then Test1 and Test2 , for both of the class if you have similar names class then they will be put directly njto the onlinecompilerClassStyel directory.
            // also always put the main class in our cause Test1 at the top cause it has the main function.

            // coming back to the code here, as you can see we are not using the added funcion that we have defined in in the GenericContainer class, and we are using the constructor to add the value.
            // But why did we do that , cause our add returing us anything, for example
            // if we wrote s.add(new GenericContainer<>("hello World 1")); first off all for this we cant have a pramaetrised constructor now , i mean you can but when you use the added funciton that value will be over wridden , so you may need to write something like this 
            // ls.add((new GenericContainer<>("hello World 1")).added("hello World 1")); but this will not work cause the added function is retrning void and the "add" function of the list needs us to put an object of type Container<String> and not void, so we can either change the return type of the added function to GenericContainer<T> and then return this; or we can use the constructor to add the value, and we are using the constructor to add the value here.
            // You will see this code sinppit in the Test3 file that i have created
            // please know we would do this  ls.add(new GenericContainer<String>().add("Hello world 2"));
            // cause the constructor is not prameteised there.
    }       
}
 class GenericContainer<T> implements Container<T>
{
    
    private T item;
    GenericContainer(T item)
    {
        this.item=item;
    }
    @Override
    public void added(T item) {
        this.item=item;
    }

    @Override
    public T get() {
        return item;
    }
}
 interface Container<T>
{
    void added(T item);
    T get();
}

