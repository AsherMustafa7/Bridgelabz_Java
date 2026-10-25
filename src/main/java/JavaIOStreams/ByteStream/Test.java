package JavaIOStreams.ByteStream;


public class Test
{
    public static void main(String args[])
    {
        Parent obj1 = new Parent();
        obj1.msg();
        Child obj2 = new Child();
        obj2.msg();
        Parent obj3 = new Child();
        obj3.msg();
    }
}
class Parent
{
     void msg()
    {
        System.out.println("This is Parent class");
    }
} 
class Child extends Parent
{
     void msg()
    {
        System.out.println("This is Child class");
    }
}
