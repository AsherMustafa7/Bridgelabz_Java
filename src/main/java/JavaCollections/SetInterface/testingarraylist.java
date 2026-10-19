package JavaCollections.SetInterface;
import java.util.*;
public class testingarraylist
{
    public static void main(String[] args)
    {
        ArrayList marks = new ArrayList();

        marks.add(90);
        marks.add(85);
        marks.add(95);
        marks.add("Asher");
        Object o = marks.get(0);
        String str= (String) marks.get(3);
        System.out.println(marks);

    }

}
