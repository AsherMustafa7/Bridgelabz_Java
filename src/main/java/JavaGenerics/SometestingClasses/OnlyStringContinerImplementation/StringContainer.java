package JavaGenerics.SometestingClasses.OnlyStringContinerImplementation;

public class StringContainer implements Container<String>{
    private String str;
    @Override
    public void add(String item) {
        this.str=item;
    }

    @Override
    public String get() {
        return str;
    }
}
