package JavaGenerics.SometestingClasses.GenericContainerImplementation;

public class GenericContainer<T> implements Container<T>
{
    private T item;
    GenericContainer(T item)
    {
        this.item=item;
    }
    {

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
