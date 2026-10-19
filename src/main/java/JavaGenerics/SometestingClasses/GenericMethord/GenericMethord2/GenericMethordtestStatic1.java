package JavaGenerics.SometestingClasses.GenericMethord.GenericMethord2;

public class GenericMethordtestStatic1
{
    public static void main(String [] args)
    {

        String[] str={"Asher", "Is", "Amazing"};
        Integer[] ar= {1,2,3,4};
        printarray(str);
        printarray(ar);
    }
    public static <T> void printarray(T[] arr)
    {
        for(T element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}