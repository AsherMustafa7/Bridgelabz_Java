package JavaGenerics.SometestingClasses.BoundedImplementation1.Bounded1;



public class TestBonded1 
{
    public static void main(String[] args) {
        MyNumber obj1 = new MyNumber(12);
        Box<MyNumber> box = new Box<>(obj1);
        box.getItem().print();
    }
}
 class Box<T extends Number & Printable>
{
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
interface Printable
{
    void print();
}
class MyNumber extends Number implements Printable
{
    private int value;
    MyNumber(int value)
    {
        this.value=value;
    }
    
    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}