package JavaGenerics.SometestingClasses.GenericMethord.GenericMethord3;

public class GenericEnumImplementation
{
    public static void main(String[] args)
    {
        // The following code demonstrates the use of generic enums with bounded type parameters.
        double result = Operation.ADD.apply(10,20);
        System.out.println("Result: " + result);
        double result2=  Operation.SUBTRACT.apply(10,20);
        System.out.println("Result2: " + result2);
        double result3=  Operation.MULTIPLY.apply(10,20);
        System.out.println("Result3: " + result3);
        double result4=  Operation.DIVIDE.apply(10,20);
        System.out.println("Result4: " + result4);
        int i = 5;
    }
}
enum Operation
{
    ADD, SUBTRACT, MULTIPLY,DIVIDE;
    public <T extends Number> double apply(T a, T b)
    {
        double value=0.0;
        switch(this)
        {
           case ADD:
               value = a.doubleValue() + b.doubleValue();
               break;
            case SUBTRACT:
                value = a.doubleValue() - b.doubleValue();
                break;
            case MULTIPLY:
                value = a.doubleValue() * b.doubleValue();
                break;
            case DIVIDE:
                value = a.doubleValue() / b.doubleValue();
                break;
            default:
                throw new AssertionError("Unknown operation " + this);
        }
        return value;
    }
}
