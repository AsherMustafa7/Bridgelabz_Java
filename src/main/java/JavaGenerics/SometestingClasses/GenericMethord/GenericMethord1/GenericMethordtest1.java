package JavaGenerics.SometestingClasses.GenericMethord.GenericMethord1;

public class GenericMethordtest1
{
	public static void main(String [] args)
	{
		GenericMethordtest1 t= new GenericMethordtest1();
		String[] str={"Asher", "Is", "Amazing"};
		Integer[] ar= {1,2,3,4};
		t.printarray(str);
		t.printarray(ar);
	}
	public <T> void printarray(T[] arr)
	{
		for(T element:arr)
		{
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
